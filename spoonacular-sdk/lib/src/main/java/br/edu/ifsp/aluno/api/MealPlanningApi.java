package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.ApiRequest;
import br.edu.ifsp.aluno.model.MealPlan;
import br.edu.ifsp.aluno.model.MealPlanResponse;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class MealPlanningApi extends ApiRequest {

    public MealPlanningApi(String apiUrl, String apiKey) {
        super(apiUrl, apiKey);
    }

    public MealPlan generateMealPlan(int targetCalories, String diet) throws IOException, InterruptedException {
        String str = getApiUrl() + "?timeFrame=day" + "&targetCalories=" + targetCalories + "&diet=" + diet + "&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(), MealPlan.class);
    }

    public MealPlanResponse generateMealPlanWeek(int targetCalories, String diet) throws IOException, InterruptedException {
        String str = getApiUrl() + "?timeFrame=week" + "&targetCalories=" + targetCalories + "&diet=" + diet + "&apiKey=" + getApiKey();
        URI uri = URI.create(str);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        return getMapper().readValue(response.body(),MealPlanResponse.class);
    }



}
