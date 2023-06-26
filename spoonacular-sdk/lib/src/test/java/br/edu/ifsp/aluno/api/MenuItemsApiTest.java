package br.edu.ifsp.aluno.api;

import br.edu.ifsp.aluno.model.MenuItems;
import br.edu.ifsp.aluno.model.MenuItemsResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

public class MenuItemsApiTest {
    @Test
    void criaUmObjetoMenuItemsApi() {
        var apiUrl = "https://api.spoonacular.com/food/menuItems/";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RecipeApi(apiUrl,apiKey);
        Assertions.assertNotNull(api);
    }

    @Test
    void getMenuInformation() throws IOException, InterruptedException {
        var apiUrl = "https://api.spoonacular.com/food/menuItems/";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new MenuItemsApi(apiUrl,apiKey);
        MenuItems response = api.getMenuItemsInformation(424571);
        Assertions.assertEquals(424571, response.getId());
        System.out.println(response);
    }

    @Test
    void searchMenuItems() throws  IOException, InterruptedException{
        var apiUrl = "https://api.spoonacular.com/food/menuItems/search?";
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new MenuItemsApi(apiUrl,apiKey);
        MenuItemsResponse response = api.searchMenuItems("cake", 5);
        Assertions.assertFalse(response.getMenuItems().isEmpty());
        System.out.println(response);
    }


}
