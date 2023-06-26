package br.edu.ifsp.aluno.model;

public class RandomFoodTrivia {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RandomFoodTrivia [");
        if (text != null && !text.isEmpty()) {
            sb.append("text=").append(text);
        }
        sb.append("]");
        return sb.toString();
    }
}
