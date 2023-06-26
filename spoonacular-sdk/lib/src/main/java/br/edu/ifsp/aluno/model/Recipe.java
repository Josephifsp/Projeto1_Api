package br.edu.ifsp.aluno.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
    private int id;
    private String title;
    private int readyInMinutes;
    private boolean vegetarian;
    private boolean vegan;
    private int healthScore;
    @JsonProperty("extendedIngredients")
    private List<Ingredient> ingredients;
    private String instructions;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getReadyInMinutes() {
        return readyInMinutes;
    }
    
    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
    
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    
    public boolean isVegan() {
        return vegan;
    }
    
    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
    
    public int getHealthScore() {
        return healthScore;
    }
    
    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }
    
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    public String getInstructions() {
        return instructions;
    }
    
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recipe [");
        sb.append("id=").append(id).append(", ");
        sb.append("title=").append(title).append(", ");
        sb.append("readyInMinutes=").append(readyInMinutes).append(", ");
        sb.append("vegetarian=").append(vegetarian).append(", ");
        sb.append("vegan=").append(vegan).append(", ");
        sb.append("healthScore=").append(healthScore).append(", ");
        if (ingredients != null && !ingredients.isEmpty()) {
            sb.append("ingredients=").append(ingredients).append(", ");
        }
        if (instructions != null) {
            sb.append("instructions=").append(instructions);
        }
        sb.append("]");

        return sb.toString();
    }

}
