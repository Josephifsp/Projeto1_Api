package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuItems {
    private int id;
    private String title;
    private String restaurantChain;

    private Nutrition nutrition;

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

    public String getRestaurantChain() {
        return restaurantChain;
    }

    public void setRestaurantChain(String restaurantChain) {
        this.restaurantChain = restaurantChain;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MenuItems [");
        sb.append("id=").append(id).append(", ");
        if (title != null && !title.isEmpty()) {
            sb.append("title=").append(title).append(", ");
        }
        if (restaurantChain != null && !restaurantChain.isEmpty()) {
            sb.append("restaurantChain=").append(restaurantChain).append(", ");
        }
        if (nutrition != null) {
            sb.append("nutrition=").append(nutrition);
        }
        sb.append("]");
        return sb.toString();
    }

}
