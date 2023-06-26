package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meal {
    private int id;
    private String title;
    private int readyInMinutes;
    private int servings;
    private String sourceUrl;

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

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meal [");
        sb.append("id=").append(id).append(", ");
        if (title != null && !title.isEmpty()) {
            sb.append("title=").append(title).append(", ");
        }
        sb.append("readyInMinutes=").append(readyInMinutes).append(", ");
        sb.append("servings=").append(servings).append(", ");
        if (sourceUrl != null && !sourceUrl.isEmpty()) {
            sb.append("sourceUrl=").append(sourceUrl);
        }
        sb.append("]");
        return sb.toString();
    }
}
