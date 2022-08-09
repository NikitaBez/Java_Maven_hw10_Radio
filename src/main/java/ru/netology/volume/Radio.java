package ru.netology.volume;

public class Radio {

    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    //требование 2.2 увеличение громкости
    public void increaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 10) {
            currentVolume = newIncreaseVolume + 1;
        }
        if (newIncreaseVolume >= 10) {
            currentVolume = 10;
        }
    }

    //требование 2.3 уменьшить громкость
    public void reduceVolume(int newIncreaseVolume) {
        if (newIncreaseVolume > 0) {
            currentVolume = newIncreaseVolume - 1;
        }
        if (newIncreaseVolume <= 0) {
            currentVolume = 0;
        }
        if (newIncreaseVolume > 10) {
            currentVolume = 10;
        }
    }
}
