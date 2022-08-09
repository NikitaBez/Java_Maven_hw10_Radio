package ru.netology.radioStation;
public class Radio {
    //требование 1.1 номер радиостанции от 0 до 9
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation <= 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    //требование 1.2 переключение next
    public void nextRadioStation(int newNextRadioStaion) {
        if (newNextRadioStaion < 9) {
            currentRadioStation = newNextRadioStaion + 1;
            }
        if (newNextRadioStaion >=9) {
            currentRadioStation = 0;
        }
    }

    //требование 1.3 переключение prev
    public void prevRadioStation(int newPrevRadioStation){
        if (newPrevRadioStation > 0) {
            currentRadioStation = newPrevRadioStation - 1;
        }
        if (newPrevRadioStation <=0) {
            currentRadioStation = 9;
        }
        if (newPrevRadioStation > 9) {
            currentRadioStation = 9;
        }
    }
}