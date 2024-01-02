package ru.innopolis.java.homework09;

public class CasualRace extends Race{

    public CasualRace() {
    }

    public CasualRace(Integer lengthRace, String route, Integer prizeFund) {
        super(lengthRace, route, prizeFund);
    }

    @Override
    public String toString() {
        return "обычная гонка{}";
    }
}
