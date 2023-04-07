package ru.netology.javaqamvn;

public class Radio {
    public int currentStation;
    public int currentVolume;

//    public int getCurrentStation() {
//        return currentStation;
//    }


    public int increaseStation() {
        if (currentStation < 9) {
            currentStation++;
        } else  { currentStation = 0;
        }
        return currentStation;
    }


    public int decreaseStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {currentStation = 9;
        }
        return currentStation;
    }

    public void CurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
//        if ((currentStation >= 0) && (currentStation <= 9));
//        increaseStation();

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

    public void inputCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

}
