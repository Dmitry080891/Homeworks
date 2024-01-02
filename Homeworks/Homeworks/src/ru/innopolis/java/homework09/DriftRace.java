package ru.innopolis.java.homework09;

public class DriftRace extends Race{
    public DriftRace() {
    }

    public DriftRace(Integer lengthRace, String route, Integer prizeFund) {
        super(lengthRace, route, prizeFund);
    }

    @Override
    public String toString() {
        return "дрифтовая гонка{}";
    }
}
