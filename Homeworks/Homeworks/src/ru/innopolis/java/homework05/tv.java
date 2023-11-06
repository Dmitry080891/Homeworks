package ru.innopolis.java.homework05;
import java.util.Objects;
import java.util.StringJoiner;
public class tv {
        private String name; //название телевизора
        private int channelIncluded; //номер канала
        private int volumeLevel; //уровень громкости
        private boolean isTVon;   //
        public tv(String name) {
            this.name = name;
        }
        public tv(String name, int channelIncluded, int volumeLevel, boolean isTVon) {
            this.name = name;
            this.channelIncluded = channelIncluded;
            this.volumeLevel = volumeLevel;
            this.isTVon = isTVon;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getChannelIncluded() {return channelIncluded;}
        public void setChannelIncluded(int channelIncluded) {this.channelIncluded = channelIncluded;}
        public int getVolumeLevel() {
            return this.volumeLevel;
        }
        public void setVolumeLevel(int volumeLevel) {

            if (volumeLevel >= 0 && volumeLevel <= 100) {
                this.volumeLevel = volumeLevel;
            }
            else throw new RuntimeException("Введенное значение должно быть >= 0 и <= 100");
        }
         public boolean isTVon() {return isTVon; }
        public void setTVon(boolean TVon) {isTVon = TVon;}
        @Override
        public String toString() {
            return new StringJoiner(", ", tv.class.getSimpleName() + "[", "]")
                    .add("Название телевизора " + name )
                    .add("Номер включенного канала " + channelIncluded)
                    .add("Уровень громкости " + volumeLevel)
                    .add("Телевизор включен? " + isTVon)
                    .toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            tv tv = (tv) o;
            return channelIncluded == tv.channelIncluded &&
                    getVolumeLevel() == tv.getVolumeLevel() &&
                    isTVon == tv.isTVon &&
                    Objects.equals(getName(), tv.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(),
                    channelIncluded,
                    getVolumeLevel(),
                    isTVon
            );
        }
    }

