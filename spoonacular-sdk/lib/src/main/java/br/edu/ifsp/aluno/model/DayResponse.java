package br.edu.ifsp.aluno.model;

import java.util.List;

public class DayResponse {
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
        sb.append("DayResponse [");
        if (meals != null && !meals.isEmpty()) {
            sb.append("meals=").append(meals).append(", ");
        }
        if (nutrients != null) {
            sb.append("nutrients=").append(nutrients).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

