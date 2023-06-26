package br.edu.ifsp.aluno.api;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.edu.ifsp.aluno.model.RecipeResponse;

public class RecipeApiTest {
    
    @Test
    void criaUmObjetoRandomRecipeApi() {
        var apiUrl = "https://api.spoonacular.com/recipes/";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RecipeApi(apiUrl,apiKey);
        Assertions.assertNotNull(api);
    }

    @Test
    void getRandomRecipe() throws IOException, InterruptedException {
        var apiUrl = "https://api.spoonacular.com/recipes/random";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RecipeApi(apiUrl,apiKey);
        RecipeResponse response = api.listarReceitasAleatorias(1);
        Assertions.assertFalse(response.getRecipes().isEmpty());
        System.out.println(response);
    }
}
