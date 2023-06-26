package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.ApiRequest;
import br.edu.ifsp.aluno.model.DishPairingWine;
import br.edu.ifsp.aluno.model.WineResponse;
import br.edu.ifsp.aluno.model.Wine;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WineApi extends ApiRequest {
    public WineApi(String apiUrl, String apiKey) {
        super(apiUrl, apiKey);
    }

    public Wine getWineDescription(String wine) throws IOException, InterruptedException {
        String str = getApiUrl() + "?wine=" + wine +"&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        Wine wineDesc = getMapper().readValue(response.body(), Wine.class);
        wineDesc.setDescription(response.body());
        return wineDesc;
    }

    public DishPairingWine getDishPairingWine(String wine) throws IOException, InterruptedException{
        String str = getApiUrl() + "?wine=" + wine +"&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), DishPairingWine.class);
    }

    public WineResponse getWineRecommendation(String wine, double maxPrice, int recommendationsQuantity) throws IOException, InterruptedException {
        String str = getApiUrl() + "?wine=" + wine + "&maxPrice=" + maxPrice + "&number=" + recommendationsQuantity + "&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), WineResponse.class);
    }

    public WineResponse getWinePairing(String food, double maxPrice) throws IOException, InterruptedException {
        String str = getApiUrl() + "?food=" + food + "&maxPrice=" + maxPrice + "&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), WineResponse.class);
    }
}
