package ru.netology.radioStation;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    //требование 1.1. Номер текущей РС принимает значения от 0 до 9
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    //требование 1.2 переключение next
    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }


    //требование 1.3 переключение prev
    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

//требование 2.1. Уровень громкости устанавливается в переделах 0 - 10

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //требование 2.2 увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
    }

    //требование 2.3 уменьшение громкости
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
    }
}