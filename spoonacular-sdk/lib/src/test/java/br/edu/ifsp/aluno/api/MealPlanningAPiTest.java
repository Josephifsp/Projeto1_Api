package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.MealPlan;
import br.edu.ifsp.aluno.model.MealPlanResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class MealPlanningAPiTest {

    @Test
    void criaUmObjetoMealPlanApi() {
        var apiUrl = "https://api.spoonacular.com/mealplanner/generate";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RecipeApi(apiUrl,apiKey);
        Assertions.assertNotNull(api);
    }


    @Test
    public void generateMealPlan() throws IOException, InterruptedException {
        var apiUrl = "https://api.spoonacular.com/mealplanner/generate";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new MealPlanningApi(apiUrl,apiKey);
        MealPlan response = api.generateMealPlan(3000, "Paleo");
        Assertions.assertFalse(response.getMeals().isEmpty());
        System.out.println(response);
    }

    @Test
    public void generateMealPlanWeek() throws IOException, InterruptedException {
        var apiUrl = "https://api.spoonacular.com/mealplanner/generate";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new MealPlanningApi(apiUrl,apiKey);
        MealPlanResponse response = api.generateMealPlanWeek(3000, "vegetarian");
        Assertions.assertFalse(response.getWeek().getMonday().getMeals().isEmpty());
        System.out.println(response);
    }


}
