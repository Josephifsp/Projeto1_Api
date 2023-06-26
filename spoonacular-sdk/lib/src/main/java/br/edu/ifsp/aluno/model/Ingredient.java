package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredient {
    private int id;
    private String name;
    private double amount;
    private String unit;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getUnit() {
        return unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ingredient [");
        sb.append("id=").append(id).append(", ");
        if (name != null && !name.isEmpty()) {
            sb.append("name=").append(name).append(", ");
        }
        sb.append("amount=").append(amount).append(", ");
        if (unit != null && !unit.isEmpty()) {
            sb.append("unit=").append(unit);
        }
        sb.append("]");
        return sb.toString();
    }
}

