package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.ApiRequest;
import br.edu.ifsp.aluno.model.RandomFoodJoke;
import br.edu.ifsp.aluno.model.RandomFoodTrivia;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MiscApi extends ApiRequest {
    public MiscApi(String apiUrl, String apiKey) {
        super(apiUrl, apiKey);
    }
    public RandomFoodJoke contarPiada() throws IOException, InterruptedException{
        String str = getApiUrl() + "?apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), RandomFoodJoke.class);
    }

    public RandomFoodTrivia mostrarTrivialidade() throws IOException, InterruptedException{
        String str = getApiUrl() + "?apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), RandomFoodTrivia.class);
    }

}
