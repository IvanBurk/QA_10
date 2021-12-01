package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int quantityStation = 10;

    public Radio() {
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public void setCurrentStationNext(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setStationNext() {
        maxStation = quantityStation - 1;
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public int getStation() {
        return currentStation;
    }

    public void setStationPrew() {
        maxStation = quantityStation - 1;
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStationValid(int currentStation) {
        maxStation = quantityStation - 1;
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else if (currentStation <= minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
        return;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setIncreaseVolumeUp() {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void setIncreaseVolumeDown() {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }
}
