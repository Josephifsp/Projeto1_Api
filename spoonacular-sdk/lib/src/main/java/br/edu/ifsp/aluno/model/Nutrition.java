package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nutrition {
    private List<Nutrients> nutrients;

    public List<Nutrients> getNutrients() {
        return nutrients;
    }

    public void setNutrients(List<Nutrients> nutrients) {
        this.nutrients = nutrients;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nutrition [");
        if (nutrients != null && !nutrients.isEmpty()) {
            sb.append("nutrients=").append(nutrients);
        }
        sb.append("]");
        return sb.toString();
    }
}
