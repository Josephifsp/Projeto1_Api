package br.edu.ifsp.aluno.model;

public class RandomFoodJoke {
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
        sb.append("RandomFoodJoke [");
        if (text != null && !text.isEmpty()) {
            sb.append("text=").append(text);
        }
        sb.append("]");
        return sb.toString();
    }
}
