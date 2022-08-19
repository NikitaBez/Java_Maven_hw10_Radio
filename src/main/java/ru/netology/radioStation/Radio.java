package ru.netology.radioStation;

public class Radio {
    private int currentRadioStation;
    private int amountStations;
    private int currentVolume;

    public Radio(int amountStations) {
        this.amountStations = amountStations;
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > amountStations - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    //требование 1.2 переключение next
    public void nextRadioStation() {
        if (currentRadioStation == amountStations - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }


    //требование 1.3 переключение prev
    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = amountStations -1;
        } else {
            currentRadioStation--;
        }
    }

//требование 2.1. Уровень громкости устанавливается в переделах 0 - 100

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //требование 2.2 увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        if (currentVolume == 100) {
            currentVolume = 100;
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
