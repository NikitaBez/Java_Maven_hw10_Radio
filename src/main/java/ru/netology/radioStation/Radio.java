package ru.netology.radioStation;
public class Radio {
    private int currentRadioStation;
    private int amountStations = 10;

    public Radio(){

    }
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

    public void nextRadioStation(int newNextRadioStation) {
        if (newNextRadioStation >= amountStations - 1) {
            currentRadioStation = 0;
        }
        if (newNextRadioStation < amountStations - 1) {
            currentRadioStation = newNextRadioStation + 1;
        }
    }

    //требование 1.3 переключение prev
    public void prevRadioStation(int newPrevRadioStation) {
        if (newPrevRadioStation <= 0) {
            currentRadioStation = amountStations - 1;
        }
        if (newPrevRadioStation > 0) {
            currentRadioStation = newPrevRadioStation - 1;
        }
    }
}
