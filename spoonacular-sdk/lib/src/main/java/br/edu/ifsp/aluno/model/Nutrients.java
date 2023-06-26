package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nutrients {
    private String name;
    private double amount;
    private String unit;
    private int percentOfDailyNeeds;

    private double calories;
    private double carbohydrates;
    private double fat;
    private double protein;

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

    public int getPercentOfDailyNeeds() {
        return percentOfDailyNeeds;
    }

    public void setPercentOfDailyNeeds(int percentOfDailyNeeds) {
        this.percentOfDailyNeeds = percentOfDailyNeeds;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nutrients [");
        if (name != null && !name.isEmpty()) {
            sb.append("name=").append(name).append(", ");
        }
        if (amount != 0.0) {
            sb.append("amount=").append(amount).append(", ");
        }
        if (unit != null && !unit.isEmpty()) {
            sb.append("unit=").append(unit).append(", ");
        }
        if (percentOfDailyNeeds != 0) {
            sb.append("percentOfDailyNeeds=").append(percentOfDailyNeeds).append(", ");
        }
        if (calories != 0.0) {
            sb.append("calories=").append(calories).append(", ");
        }
        if (carbohydrates != 0.0) {
            sb.append("carbohydrates=").append(carbohydrates).append(", ");
        }
        if (fat != 0.0) {
            sb.append("fat=").append(fat).append(", ");
        }
        if (protein != 0.0) {
            sb.append("protein=").append(protein).append(", ");
        }
        sb.append("]");

        return sb.toString();
    }
}
