package ru.netology.volume;

public class Radio {

    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0) {
            this.currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < 100) {
            this.currentVolume = newCurrentVolume;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        if (currentVolume < 0) {
            this.currentVolume = 0;
        }
    }


    //требование 2.2 увеличение громкости
    public void increaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 100) {
            currentVolume = newIncreaseVolume + 1;
        }
        if (newIncreaseVolume >= 100) {
            currentVolume = 100;
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
    }
}
