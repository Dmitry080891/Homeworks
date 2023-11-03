package ru.innopolis.java.homework03;

public class TV {
    private String maker;
    private int diagonal;
    private int fps;
    private String color;
    public TV(){} //1 конструктор без параметров
    public TV(String maker, int diagonal, int fps, String color)
    {
        this.maker = maker;
        this.diagonal = diagonal;
        this.fps = fps;
        this.color = color;
    } //2 конструктор с параметрами
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public int getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
    public int getFps() { return fps;  }
    public void setFps(int fps) { this.fps = fps; }
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public  String location(String location)
    {        return "Телевизор " + this.maker + " расположен в " + location;    }
    public String settingChannel()
    {         return "Настройка телевизионных каналов на телевизоре " + this.maker;    }
    public String turnONchannel(String channel)
    {        return "На телевизоре "+ this.maker +" включен телевизионный канал: " + channel;    }
    public  String toString()
    {
        return "TV с параметрами\n" +
                "Производитель: " + this.maker +"\n" +
                "Диагональ экрана: " + this.diagonal +"\n" +
                "Частота обновления экрана: " + this.fps +"\n" +
                "Цвет телевизора: " + this.color;
    }
}
