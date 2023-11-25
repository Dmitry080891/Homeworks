package ru.innopolis.java.homework05;
import java.util.Objects;
import java.util.StringJoiner;
public class Television {
        private String name; //название телевизора
        private int channelIncluded; //номер канала
        private int volumeLevel; //уровень громкости
        private boolean isTVOn;   //
        public Television(String name) {
            this.name = name;
        }
        public Television(String name, int channelIncluded, int volumeLevel, boolean isTVOn) {
            this.name = name;
            this.channelIncluded = channelIncluded;
            this.volumeLevel = volumeLevel;
            this.isTVOn = isTVOn;
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

            if (volumeLevel < 0 || volumeLevel > 100) {
               throw new RuntimeException("Введенное значение должно быть >= 0 и <= 100");
            }
            this.volumeLevel = volumeLevel;
        }

    public boolean isTVOn() {
        return isTVOn;
    }

    public void setTVOn(boolean TVOn) {
        isTVOn = TVOn;
    }

    @Override
        public String toString() {
            return new StringJoiner(", ", Television.class.getSimpleName() + "[", "]")
                    .add("Название телевизора " + name )
                    .add("Номер включенного канала " + channelIncluded)
                    .add("Уровень громкости " + volumeLevel)
                    .add("Телевизор включен? " + isTVOn)
                    .toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Television tv = (Television) o;
            return channelIncluded == tv.channelIncluded &&
                    getVolumeLevel() == tv.getVolumeLevel() &&
                    isTVOn == tv.isTVOn &&
                    Objects.equals(getName(), tv.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(),
                    channelIncluded,
                    getVolumeLevel(),
                    isTVOn
            );
        }
    }

