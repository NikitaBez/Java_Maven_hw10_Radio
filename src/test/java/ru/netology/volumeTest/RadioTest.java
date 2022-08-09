package ru.netology.volumeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.volume.Radio;

public class RadioTest {

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOutOfRange() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);

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
    public void shouldSetVolumeMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты на требование 2.2 увеличение громкости
    @Test
    public void shouldIncreaseVolume() {
        Radio volumeUp = new Radio();

        volumeUp.increaseVolume(4);

        int expected = 5;
        int actual = volumeUp.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio volumeUp = new Radio();

        volumeUp.increaseVolume(11);

        int expected = 10;
        int actual = volumeUp.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    //Тесты на требование 2.3 уменьшение громкости
    @Test
    public void shouldReduceVolume() {
        Radio volumeDown = new Radio();

        volumeDown.reduceVolume(5);

        int expected = 4;
        int actual = volumeDown.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMin() {
        Radio volumeDown = new Radio();

        volumeDown.reduceVolume(0);

        int expected = 0;
        int actual = volumeDown.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOutOfRange() {
        Radio volumeDown = new Radio();

        volumeDown.reduceVolume(15);

        int expected = 10;
        int actual = volumeDown.currentVolume;

        Assertions.assertEquals(expected,actual);
    }
}


