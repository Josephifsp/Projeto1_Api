package br.edu.ifsp.aluno.model;

import java.util.List;

public class DishPairingWine {
    private List<String> pairings;
    private String text;

    public List<String> getPairings() {
        return pairings;
    }

    public void setPairings(List<String> pairings) {
        this.pairings = pairings;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString(){

    StringBuilder sb = new StringBuilder();
        sb.append("DishPairingWine [");
        if (pairings != null && !pairings.isEmpty()) {
        sb.append("pairings=").append(pairings).append(", ");
    }
        if (text != null && !text.isEmpty()) {
        sb.append("text=").append(text).append(", ");
    }
        sb.append("]");
        return sb.toString();
    }
}
