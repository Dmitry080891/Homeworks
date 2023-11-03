package ru.innopolis.java.homework03;

public class APP {
    public static void main(String[] args) {
        TV philips = new TV(); //1
        philips.setMaker("Philips");
        philips.getMaker();
        philips.setDiagonal(55);
        philips.getDiagonal();
        philips.setFps(60);
        philips.getFps();
        philips.setColor("Серый");
        philips.getColor();
        TV samsung = new TV("Samsung", 32, 60, "Белый"); //2
        System.out.println(philips);
        System.out.println(samsung);
        String philipsLocation = "Hole";
        String samsungLocation = "Kitchen";
        System.out.println(philips.location(philipsLocation));
        System.out.println(samsung.location(samsungLocation));
        System.out.println(philips.settingChannel());
        System.out.println(samsung.settingChannel());
        String philipsChannel = "MTV";
        String samsungChannel = "МузТВ";
        System.out.println(philips.turnONchannel(philipsChannel));
        System.out.println(samsung.turnONchannel(samsungChannel));
    }
}
