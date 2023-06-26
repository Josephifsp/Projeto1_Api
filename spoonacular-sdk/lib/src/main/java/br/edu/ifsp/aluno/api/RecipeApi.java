package br.edu.ifsp.aluno.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import br.edu.ifsp.aluno.model.ApiRequest;

import br.edu.ifsp.aluno.model.RecipeResponse;

public class RecipeApi extends ApiRequest {

    public RecipeApi(String apiUrl, String apiKey) {
        super(apiUrl, apiKey);
    }

    public RecipeResponse listarReceitasAleatorias(int quantidadeReceitas) throws IOException, InterruptedException {
        String str = getApiUrl() + "?number=" + quantidadeReceitas +"&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), RecipeResponse.class);
    }

}
