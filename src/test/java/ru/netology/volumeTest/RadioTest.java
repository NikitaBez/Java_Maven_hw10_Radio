package ru.netology.volumeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.volume.Radio;

public class RadioTest {
    Radio volume = new Radio();

    @Test
    public void shouldSetVolumeMinLimitValues() {

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMinLimitValues2() {

        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeMaxLimitValue() {

        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeMax() {

        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeOutOfRange() {

        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }





    //Тесты на требование 2.2 увеличение громкости
    @Test
    public void shouldIncreaseVolume() {

        volume.increaseVolume(99);

        int expected = 100;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {

        volume.increaseVolume(100);

        int expected = 100;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMaxLimitValue() {

        volume.increaseVolume(101);

        int expected = 100;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }




        //Тесты на требование 2.3 уменьшение громкости
    @Test
    public void shouldReduceVolume() {

        volume.reduceVolume(2);

        int expected = 1;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMin() {

        volume.reduceVolume(1);

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolumeMinLimitValue() {

        volume.reduceVolume(0);

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOutOfRange() {

        volume.reduceVolume(-1);

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected,actual);
    }
}



