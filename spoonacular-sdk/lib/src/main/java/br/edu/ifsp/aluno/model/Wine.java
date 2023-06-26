package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wine {
    private int id;
    private String title;
    private String description;
    private String link;
    private String price;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Wine [");
        if (id != 0) {
            sb.append("id=").append(id).append(", ");
        }
        if (title != null) {
            sb.append("title=").append(title).append(", ");
        }
        if (description != null) {
            sb.append("description=").append(description).append(", ");
        }
        if (link != null) {
            sb.append("link=").append(link).append(", ");
        }
        if (price != null) {
            sb.append("price=").append(price);
        }
        sb.append("]");

        return sb.toString();
    }

}
