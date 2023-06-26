package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.DishPairingWine;
import br.edu.ifsp.aluno.model.WineResponse;
import br.edu.ifsp.aluno.model.Wine;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WineApiTest {
    @Test
    void criaUmObjetoWineApi() {
        var apiUrl = "https://api.spoonacular.com/food/wine";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RecipeApi(apiUrl,apiKey);
        Assertions.assertNotNull(api);
    }


    @Test
    void getWineDescription() throws IOException, InterruptedException{
        var apiUrl = "https://api.spoonacular.com/food/wine/description";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new WineApi(apiUrl,apiKey);
        Wine response = api.getWineDescription("malbec");
        Assertions.assertFalse(response.getDescription().isEmpty());
        System.out.println(response);
    }

    @Test
    void getDishPairingWine() throws IOException, InterruptedException{
        var apiUrl = "https://api.spoonacular.com/food/wine/dishes";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new WineApi(apiUrl,apiKey);
        DishPairingWine response = api.getDishPairingWine("riesling");
        Assertions.assertFalse(response.getPairings().isEmpty());
        Assertions.assertFalse(response.getText().isEmpty());
        System.out.println(response);
    }

    @Test
    void getWineRecommendation() throws IOException, InterruptedException {
        var apiUrl = "https://api.spoonacular.com/food/wine/recommendation";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new WineApi(apiUrl,apiKey);
        WineResponse response = api.getWineRecommendation("riesling", 50.0, 2);
        Assertions.assertFalse(response.getRecommendedWines().isEmpty());
        System.out.println(response);
    }

    @Test
    void getWinePairing() throws IOException, InterruptedException {
        var apiUrl = "https://api.spoonacular.com/food/wine/pairing";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new WineApi(apiUrl,apiKey);
        WineResponse response = api.getWinePairing("steak", 60.0);
        Assertions.assertFalse(response.getPairedWines().isEmpty());
        Assertions.assertFalse(response.getPairingText().isEmpty());
        Assertions.assertFalse(response.getProductMatches().isEmpty());
        System.out.println(response);
    }
}
