package com.jrhcodes.CinnamonCinemas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StaticSeatTest {



    @ParameterizedTest
    @CsvSource({ "A, 10", "B, 20"})
    public void testSeatConstructor(char row, int seatNumber) {
        StaticSeat seat = new StaticSeat(row, seatNumber);
        assertEquals(seat.getRow(), row);
        assertEquals(seat.getSeatNumber(), seatNumber);
    }

}
