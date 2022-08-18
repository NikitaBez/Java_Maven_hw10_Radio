package ru.netology.radioStation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    Radio radioStation = new Radio();

//тестируем требование 1.1
    @Test //также подходит к требованию 1.4 (выставление номера радиостанции)
    public void shouldSetRadioStation() {
        radioStation.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        radioStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitValueMinRadioStation() {
        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitValue2MinRadioStation() {
        radioStation.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        radioStation.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitValueMaxRadioStation() {
        radioStation.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitValue2MaxRadioStation() {
        radioStation.setCurrentRadioStation(10);

        int expected = 0; //ноль, так как проверяется условие установки произвольного канала,
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

//тестируем требование 1.2 NEXT
    @Test
    public void shouldSetNextRadioStation() {
        radioStation.setCurrentRadioStation(8);
        radioStation.nextRadioStation();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMaxRadioStation() {
        radioStation.setCurrentRadioStation(9);
        radioStation.nextRadioStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldSetLimitValueNextMaxRadioStation() {
//        radioStation.setCurrentRadioStation(10);
//        radioStation.nextRadioStation();
//
//        int expected = 1;
//        int actual = radioStation.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetLimitValueNextMinRadioStation() {
//        radioStation.setCurrentRadioStation(-1);
//        radioStation.nextRadioStation();
//
//        int expected = 1;
//        int actual = radioStation.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void shouldSetNextMinRadioStation() {
        radioStation.setCurrentRadioStation(0);
        radioStation.nextRadioStation();

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //тестируем требование 1.3 PREV
    @Test
    public void shouldSetPrevRadioStation() {
        radioStation.setCurrentRadioStation(8);
        radioStation.prevRadioStation();

        int expected = 7;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevMaxRadioStation() {
        radioStation.setCurrentRadioStation(9);
        radioStation.prevRadioStation();

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
//
//    @Test
//    public void shouldSetLimitValuePrevMaxRadioStation() {
//        radioStation.setCurrentRadioStation(10);
//        radioStation.prevRadioStation();
//
//        int expected = 9;
//        int actual = radioStation.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetLimitValueNPrevMinRadioStation() {
//        radioStation.setCurrentRadioStation(-1);
//        radioStation.prevRadioStation();
//
//        int expected = 9;
//        int actual = radioStation.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void shouldSetPrevMinRadioStation() {
        radioStation.setCurrentRadioStation(0);
        radioStation.prevRadioStation();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //тестируем требование 2.1 и 2.2
    @Test
    public void shouldIncreaseVolume() {
        radioStation.setCurrentVolume(9);
        radioStation.increaseVolume();

        int expected = 10;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenAtMax() {
        radioStation.setCurrentVolume(10);
        radioStation.increaseVolume();

        int expected = 10;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenAtMin() {
        radioStation.setCurrentVolume(0);
        radioStation.increaseVolume();

        int expected = 1;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testingBoundaryValuesWhenAtMin() {
        radioStation.setCurrentVolume(-1);
        radioStation.increaseVolume();

        int expected = 1;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testingBoundaryValuesWhenAtMax() {
        radioStation.setCurrentVolume(11);
        radioStation.increaseVolume();

        int expected = 1;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    //тестируем требование 2.3
    @Test
    public void shouldReduceVolume() {
        radioStation.setCurrentVolume(9);
        radioStation.reduceVolume();

        int expected = 8;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReduceVolumeWhenAtMax() {
        radioStation.setCurrentVolume(10);
        radioStation.reduceVolume();

        int expected = 9;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReduceVolumeWhenAtMin() {
        radioStation.setCurrentVolume(0);
        radioStation.reduceVolume();

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

}
