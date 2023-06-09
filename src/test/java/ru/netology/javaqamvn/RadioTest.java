package ru.netology.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseStation() {
        Radio station = new Radio();
        station.setCurrentStation(3);

        int expected = 4;
        int actual = station.increaseStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStation9() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        int expected = 0;
        int actual = station.increaseStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 4;
        int actual = station.decreaseStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStation0() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        int expected = 9;
        int actual = station.decreaseStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(30);

        int expected = 31;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);

        int expected = 49;
        int actual = volume.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(55);

        int expected = 55;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-110);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(150);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}