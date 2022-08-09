package ru.netology.radioStationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioStation.Radio;

public class RadioTest {
    //Тесты на требование 1.1 пределы частот
    @Test
    public void shouldSetRadioStation() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationOutOfRange() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMin() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //требование 1.2 переключение next
    @Test
    public void shouldSetNextRadioStation() {
        Radio radioStation = new Radio();

        radioStation.nextRadioStation(5);

        int expected = 6;
        int actual = radioStation.currentRadioStation;
    }

    @Test
    public void shouldSetNextRadioStationIfMax() {
        Radio radioStation = new Radio();

        radioStation.nextRadioStation(9);

        int expected = 0;
        int actual = radioStation.currentRadioStation;
    }

    //требование 1.3 переключение prev
    @Test
    public void shouldSetPrevRadioStation(){
        Radio radioStation = new Radio();

        radioStation.prevRadioStation(5);

        int expected = 4;
        int actual = radioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationIfMin(){
        Radio radioStation = new Radio();

        radioStation.prevRadioStation(0);

        int expected = 9;
        int actual = radioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationOutOfRange(){
        Radio radioStation = new Radio();

        radioStation.prevRadioStation(15);

        int expected = 9;
        int actual = radioStation.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
}