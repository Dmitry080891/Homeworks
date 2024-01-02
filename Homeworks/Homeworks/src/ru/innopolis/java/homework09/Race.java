package ru.innopolis.java.homework09;

import java.util.Objects;

public class Race {
    private Integer  lengthRace; //длина гонки
    private String route; //маршрут
    private Integer prizeFund; // призовой фонд

    public Race() {
    }

    public Race(Integer lengthRace, String route, Integer prizeFund) {
        this.lengthRace = lengthRace;
        this.route = route;
        this.prizeFund = prizeFund;
    }

    public Integer getLengthRace() {
        return lengthRace;
    }

    public void setLengthRace(Integer lengthRace) {
        this.lengthRace = lengthRace;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Integer getPrizeFund() {
        return prizeFund;
    }

    public void setPrizeFund(Integer prizeFund) {
        this.prizeFund = prizeFund;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return Objects.equals(lengthRace, race.lengthRace) &&
                Objects.equals(route, race.route) && Objects.equals(prizeFund, race.prizeFund);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthRace, route, prizeFund);
    }

    @Override
    public String toString() {
        return "Race{" +
                "lengthRace=" + lengthRace +
                ", route='" + route + '\'' +
                ", prizeFund=" + prizeFund +
                '}';
    }
}
