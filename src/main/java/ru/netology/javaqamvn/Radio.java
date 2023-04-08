package ru.netology.javaqamvn;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int decreaseStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
        return currentStation;
    }

    public int next() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prev() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

}
