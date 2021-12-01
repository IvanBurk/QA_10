package ru.netology.radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio dance = new Radio();
    @Test
    void StationNext() {
        dance.setCurrentStationNext(7);
        dance.setStationNext();
        int actual = dance.getStation();

        assertEquals(8, actual);
    }

    @Test
    void StationNextToTheBeginning() {
        dance.setCurrentStationNext(9);
        dance.setStationNext();
        int actual = dance.getStation();

        assertEquals(0, actual);
    }

    @Test
    void StationPrew() {
        dance.setCurrentStationNext(7);
        dance.setStationPrew();
        int actual = dance.getStation();

        assertEquals(6, actual);
    }

    @Test
    void StationPrewToTheEnd() {
        dance.setCurrentStationNext(0);
        dance.setStationPrew();
        int actual = dance.getStation();

        assertEquals(9, actual);
    }

    @Test
    void CurrentStation() {
        dance.setCurrentStationValid(5);
        int actual = dance.getStation();

        assertEquals(5, actual);
    }

    @Test
    void CurrentStationPrew() {
        dance.setCurrentStationValid(-1);
        int actual = dance.getStation();

        assertEquals(9, actual);
    }

    @Test
    void CurrentStationNext() {
        dance.setCurrentStationValid(12);
        int actual = dance.getStation();

        assertEquals(0, actual);
    }

    @Test
    void CurrentVolumeUpBorder() {
        dance.setCurrentVolume(101);
        dance.setIncreaseVolumeUp();
        int actual = dance.getIncreaseVolume();

        assertEquals(100, actual);
    }

    @Test
    void CurrentVolumeDownBorder() {
        dance.setCurrentVolume(-1);
        dance.setIncreaseVolumeDown();
        int actual = dance.getIncreaseVolume();

        assertEquals(0, actual);
    }

    @Test
    void CurrentVolumeDown() {
        dance.setCurrentVolume(100);
        dance.setIncreaseVolumeDown();
        int actual = dance.getIncreaseVolume();

        assertEquals(99, actual);
    }

    @Test
    void CurrentVolumeUp() {
        dance.setCurrentVolume(0);
        dance.setIncreaseVolumeUp();
        int actual = dance.getIncreaseVolume();

        assertEquals(1, actual);
    }

    Radio danceQuantity = new Radio(7);
    @Test
    void QuantityStationBeginning() {
        danceQuantity.setCurrentStationNext(6);
        danceQuantity.setStationNext();
        int actual = danceQuantity.getStation();

        assertEquals(0, actual);
    }

    @Test
    void QuantityStationNext() {
        danceQuantity.setCurrentStationNext(5);
        danceQuantity.setStationNext();
        int actual = danceQuantity.getStation();

        assertEquals(6, actual);
    }

    @Test
    void QuantityStationPrew() {
        danceQuantity.setCurrentStationNext(4);
        danceQuantity.setStationPrew();
        int actual = danceQuantity.getStation();

        assertEquals(3, actual);
    }

    @Test
    void QuantityStationPrewToTheEnd() {
        danceQuantity.setCurrentStationNext(0);
        danceQuantity.setStationPrew();
        int actual = danceQuantity.getStation();

        assertEquals(6, actual);
    }

    @Test
    void QuantityCurrentStation() {
        danceQuantity.setCurrentStationValid(5);
        int actual = danceQuantity.getStation();

        assertEquals(5, actual);
    }

    @Test
    void QuantityCurrentStationPrew() {
        danceQuantity.setCurrentStationValid(-1);
        int actual = danceQuantity.getStation();

        assertEquals(6, actual);
    }

    @Test
    void QuantityCurrentStationNext() {
        danceQuantity.setCurrentStationValid(12);
        int actual = danceQuantity.getStation();

        assertEquals(0, actual);
    }
}