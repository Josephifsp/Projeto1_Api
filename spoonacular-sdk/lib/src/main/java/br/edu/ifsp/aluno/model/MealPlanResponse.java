package br.edu.ifsp.aluno.model;

import br.edu.ifsp.aluno.model.MealPlan;
import br.edu.ifsp.aluno.model.Week;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MealPlanResponse {
    private Week week;

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MealPlanResponse [");

        if (week != null) {
            sb.append("week=").append(week);
        }
        sb.append("]");
        return sb.toString();
    }
}


