package ru.netology.radioStationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioStation.Radio;
public class RadioTest {
   Radio radioStation = new Radio(10);
    //Тесты на требование 1.1 пределы частот
    @Test
    public void shouldSetRadioStation() {

        radioStation.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationMax() {

        radioStation.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
//проверка на изменение в ветке
    @Test
    public void shouldSetRadioStationOutOfRange() {

        radioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationMinLimitValues() {

        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationMin() {

        radioStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationMinLimitValues2() {

        radioStation.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }



    //требование 1.2 переключение next
    @Test
    public void shouldSetNextRadioStation() {

        radioStation.nextRadioStation(8);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetNextRadioStationIfMax() {

        radioStation.nextRadioStation(9);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNextRadioStationIfMaxLimitValue() {

        radioStation.nextRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetNextRadioStationIfMinLimitValue() {

        radioStation.nextRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetNextRadioStationIfMin() {

        radioStation.nextRadioStation(0);

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNextRadioStationIfMinLimitValue2() {

        radioStation.nextRadioStation(1);

        int expected = 2;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }



    //требование 1.3 переключение prev
    @Test
    public void shouldSetPrevRadioStation(){

        radioStation.prevRadioStation(8);

        int expected = 7;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationMax(){

        radioStation.prevRadioStation(9);

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationOutOfRange(){

        radioStation.prevRadioStation(10);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationIfMin(){

        radioStation.prevRadioStation(0);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationLimitValue(){

        radioStation.prevRadioStation(-1);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStationLimitValue2(){

        radioStation.prevRadioStation(1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}