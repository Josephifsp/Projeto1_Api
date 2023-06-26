package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.RandomFoodJoke;
import br.edu.ifsp.aluno.model.RandomFoodTrivia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class MiscApiTest {
    @Test
    void criaUmObjetoRandomJokeApi() {
        var apiUrl = "https://api.spoonacular.com/food/jokes/random";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RecipeApi(apiUrl,apiKey);
        Assertions.assertNotNull(api);
    }

    @Test
    void tellJoke() throws IOException, InterruptedException{
        var apiUrl = "https://api.spoonacular.com/food/jokes/random";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new MiscApi(apiUrl,apiKey);
        RandomFoodJoke response = api.contarPiada();
        Assertions.assertFalse(response.getText().isEmpty());
        System.out.println(response);
    }

    @Test
    void showTrivia() throws IOException, InterruptedException{
        var apiUrl = "https://api.spoonacular.com/food/trivia/random";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new MiscApi(apiUrl,apiKey);
        RandomFoodTrivia response = api.mostrarTrivialidade();
        Assertions.assertFalse(response.getText().isEmpty());
        System.out.println(response);
    }
}
