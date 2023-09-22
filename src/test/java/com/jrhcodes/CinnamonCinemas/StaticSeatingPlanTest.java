package com.jrhcodes.CinnamonCinemas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticSeatingPlanTest {
    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)
    public void testGetLabel(String label, char firstRowLetter, int firstSeatNumber, int numberOfRows, int seatsPerRow  ) {
        StaticSeatingPlan plan = new StaticSeatingPlan(label, firstRowLetter, firstSeatNumber, numberOfRows, seatsPerRow);
        assertEquals(plan.getLabel(), label);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)
    public void testGetFirstRow(String label, char firstRowLetter, int firstSeatNumber, int numberOfRows, int seatsPerRow  ) {
        StaticSeatingPlan plan = new StaticSeatingPlan(label, firstRowLetter, firstSeatNumber, numberOfRows, seatsPerRow);
        assertEquals(plan.getFirstRowLetter(), firstRowLetter);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)
    public void testGetFirstSeatNumber(String label, char firstRowLetter, int firstSeatNumber, int numberOfRows, int seatsPerRow  ) {
        StaticSeatingPlan plan = new StaticSeatingPlan(label, firstRowLetter, firstSeatNumber, numberOfRows, seatsPerRow);
        assertEquals(plan.getFirstSeatNumber(), firstSeatNumber);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)
    public void testGetNumberOfSeatsPerRow(String label, char firstRowLetter, int firstSeatNumber, int numberOfRows, int seatsPerRow  ) {
        StaticSeatingPlan plan = new StaticSeatingPlan(label, firstRowLetter, firstSeatNumber, numberOfRows, seatsPerRow);
        assertEquals(plan.getNumberOfSeatsPerRow(), seatsPerRow);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)
    public void testGetNumberOfRows(String label, char firstRowLetter, int firstSeatNumber, int numberOfRows, int seatsPerRow  ) {
        StaticSeatingPlan plan = new StaticSeatingPlan(label, firstRowLetter, firstSeatNumber, numberOfRows, seatsPerRow);
        assertEquals(plan.getNumberOfRows(), numberOfRows);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "testStaticSeatingPlanConstructor.csv", numLinesToSkip = 1)
    public void testStaticSeatingPlanConstructorSeatValues(String label, char firstRowLetter, int firstSeatNumber, int numberOfRows, int numberOfSeatsPerRow  ) {
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
