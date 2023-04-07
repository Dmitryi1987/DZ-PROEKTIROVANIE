package ru.netology.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseStation() {
        Radio station = new Radio();
        station.increaseStation(3);

        int expected = 4;
        int actual = station.increaseStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseStation() {
        Radio station = new Radio();
        station.decreaseStation(5);

        int expected = 4 ;
        int actual = station.increaseStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentStation() {
        Radio station = new Radio();
        station.CurrentStation(5);

        int expected = 5;
        int actual = station.CurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.increaseVolume(30);

        int expected = 31;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.decreaseVolume(50);

        int expected = 49;
        int actual = volume.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();
        volume.inputCurrentVolume(55);

        int expected = 55;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}