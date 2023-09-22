package com.jrhcodes.CinnamonCinemas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticSeatingPlanTest {

    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)
    public void testStaticSeatingPlanConstructor(String label, char firstRowLetter, char firstSeatNumber, int numberOfRows, int seatsPerRow  ) {
        StaticSeatingPlan plan = new StaticSeatingPlan(label, firstRowLetter, firstSeatNumber, numberOfRows, seatsPerRow);
        assertEquals(plan.getFirstSeatNumber(), firstSeatNumber);
        assertEquals(plan.getLabel(), label);
        assertEquals(plan.getNumberOfSeatsPerRow(), seatsPerRow);
        assertEquals(plan.getNumberOfRows(), numberOfRows);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)

    public void testStaticSeatingPlanConstructorSeatValues(String label, char firstRowLetter, char firstSeatNumber, int numberOfRows, int numberOfSeatsPerRow  ) {
        StaticSeatingPlan plan = new StaticSeatingPlan(label, firstRowLetter, firstSeatNumber, numberOfRows, numberOfSeatsPerRow);
        for(char row = firstRowLetter; row < firstRowLetter + numberOfRows; row++) {
            for( int seatNumber = firstSeatNumber; seatNumber < firstSeatNumber + numberOfSeatsPerRow; seatNumber++) {
                StaticSeat seat = plan.getSeat(row, seatNumber);
                assertEquals(seat.getSeatNumber(), seatNumber);
                assertEquals(seat.getRow(), row);
            }

        }
    }
}
