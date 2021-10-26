package ru.netology.radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void StationNext() {
        Radio dance = new Radio();
        dance.setCurrentStationNext(7);
        dance.setStationNext();
        int actual = dance.getStation();

        assertEquals(8, actual);
    }

    @Test
    void StationNextToTheBeginning() {
        Radio dance = new Radio();
        dance.setCurrentStationNext(9);
        dance.setStationNext();
        int actual = dance.getStation();

        assertEquals(0, actual);
    }

    @Test
    void StationPrew() {
        Radio dance = new Radio();
        dance.setCurrentStationNext(7);
        dance.setStationPrew();
        int actual = dance.getStation();

        assertEquals(6, actual);
    }

    @Test
    void StationPrewToTheEnd() {
        Radio dance = new Radio();
        dance.setCurrentStationNext(0);
        dance.setStationPrew();
        int actual = dance.getStation();

        assertEquals(9, actual);
    }

    @Test
    void CurrentStation() {
        Radio dance = new Radio();
        dance.setCurrentStationValid(5);
        int actual = dance.getStation();

        assertEquals(5, actual);
    }

    @Test
    void CurrentStationPrew() {
        Radio dance = new Radio();
        dance.setCurrentStationValid(-1);
        int actual = dance.getStation();

        assertEquals(9, actual);
    }

    @Test
    void CurrentStationNext() {
        Radio dance = new Radio();
        dance.setCurrentStationValid(12);
        int actual = dance.getStation();

        assertEquals(0, actual);
    }

    @Test
    void CurrentVolumeUpBorder() {
        Radio dance = new Radio();
        dance.setCurrentVolume(12);
        dance.setIncreaseVolumeUp();
        int actual = dance.getIncreaseVolume();

        assertEquals(10, actual);
    }

    @Test
    void CurrentVolumeDownBorder() {
        Radio dance = new Radio();
        dance.setCurrentVolume(-1);
        dance.setIncreaseVolumeDown();
        int actual = dance.getIncreaseVolume();

        assertEquals(0, actual);
    }

    @Test
    void CurrentVolumeDown() {
        Radio dance = new Radio();
        dance.setCurrentVolume(10);
        dance.setIncreaseVolumeDown();
        int actual = dance.getIncreaseVolume();

        assertEquals(9, actual);
    }

    @Test
    void CurrentVolumeUp() {
        Radio dance = new Radio();
        dance.setCurrentVolume(0);
        dance.setIncreaseVolumeUp();
        int actual = dance.getIncreaseVolume();

        assertEquals(1, actual);
    }
}
