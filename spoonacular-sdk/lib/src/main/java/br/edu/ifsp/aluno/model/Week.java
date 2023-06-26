package br.edu.ifsp.aluno.model;

public class Week {
    private DayResponse monday;
    private DayResponse tuesday;
    private DayResponse wednesday;
    private DayResponse thursday;
    private DayResponse friday;
    private DayResponse saturday;
    private DayResponse sunday;

    public DayResponse getMonday() {
        return monday;
    }

    public void setMonday(DayResponse monday) {
        this.monday = monday;
    }

    public DayResponse getTuesday() {
        return tuesday;
    }

    public void setTuesday(DayResponse tuesday) {
        this.tuesday = tuesday;
    }

    public DayResponse getWednesday() {
        return wednesday;
    }

    public void setWednesday(DayResponse wednesday) {
        this.wednesday = wednesday;
    }

    public DayResponse getThursday() {
        return thursday;
    }

    public void setThursday(DayResponse thursday) {
        this.thursday = thursday;
    }

    public DayResponse getFriday() {
        return friday;
    }

    public void setFriday(DayResponse friday) {
        this.friday = friday;
    }

    public DayResponse getSaturday() {
        return saturday;
    }

    public void setSaturday(DayResponse saturday) {
        this.saturday = saturday;
    }

    public DayResponse getSunday() {
        return sunday;
    }

    public void setSunday(DayResponse sunday) {
        this.sunday = sunday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Week [");
        if (monday != null) {
            sb.append("monday=").append(monday).append(", ");
        }
        if (tuesday != null) {
            sb.append("tuesday=").append(tuesday).append(", ");
        }
        if (wednesday != null) {
            sb.append("wednesday=").append(wednesday).append(", ");
        }
        if (thursday != null) {
            sb.append("thursday=").append(thursday).append(", ");
        }
        if (friday != null) {
            sb.append("friday=").append(friday).append(", ");
        }
        if (saturday != null) {
            sb.append("saturday=").append(saturday).append(", ");
        }
        if (sunday != null) {
            sb.append("sunday=").append(sunday);
        }
        sb.append("]");
        return sb.toString();
    }
}

