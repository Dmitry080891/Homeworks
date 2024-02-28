package ru.innopolis.java.homework09;

public class DragRace extends Race{
    public DragRace() {
    }

    public DragRace(Integer lengthRace, String route, Integer prizeFund) {
        super(lengthRace, route, prizeFund);
    }

    @Override
    public String toString() {
        return "гонка за самый мощный двигатель. Идеальное переключениепередач — залог победы{}";
    }
}
