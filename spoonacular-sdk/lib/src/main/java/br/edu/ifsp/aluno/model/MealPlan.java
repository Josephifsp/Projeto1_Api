package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MealPlan {
    private List<Meal> meals;
    private Nutrients nutrients;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MealPlan [");
        if (meals != null && !meals.isEmpty()) {
            sb.append("meals=").append(meals).append(", ");
        }
        if (nutrients != null) {
            sb.append("nutrients=").append(nutrients);
        }
        sb.append("]");

        return sb.toString();
    }
}
