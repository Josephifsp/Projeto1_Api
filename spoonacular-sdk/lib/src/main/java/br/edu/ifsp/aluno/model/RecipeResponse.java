package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeResponse {

    private List<Recipe> recipes;

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecipeResponse [");
        if (recipes != null && !recipes.isEmpty()) {
            sb.append("recipes=").append(recipes);
        }
        sb.append("]");
        return sb.toString();
    }
}
