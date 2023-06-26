package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.ApiRequest;
import br.edu.ifsp.aluno.model.MenuItems;
import br.edu.ifsp.aluno.model.MenuItemsResponse;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class MenuItemsApi extends ApiRequest {
    public MenuItemsApi(String apiUrl, String apiKey){
        super(apiUrl, apiKey);
    }

    public MenuItems getMenuItemsInformation(int id) throws IOException, InterruptedException {
        String str = getApiUrl() + id + "?apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), MenuItems.class);
    }


     public MenuItemsResponse searchMenuItems(String alimento, int quantidadeItens) throws IOException, InterruptedException{
        String str = getApiUrl() + "query=" + alimento + "&number=" + quantidadeItens +"&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), MenuItemsResponse.class);
    }
}
