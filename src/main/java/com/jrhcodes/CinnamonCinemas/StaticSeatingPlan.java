package com.jrhcodes.CinnamonCinemas;

public class StaticSeatingPlan {

    private final String label;
    private final char firstRowLetter;
    private final int firstSeatNumber;
    private final int numberOfRows;
    private final int numberOfSeatsPerRow;
    private final StaticSeat[][] seats;

    public StaticSeatingPlan(String label, char firstRowLetter, int firstSeatNumber, int numberOfRows, int numberOfSeatsPerRow) {
        this.label = label;
        this.firstRowLetter = firstRowLetter;
        this.firstSeatNumber = firstSeatNumber;
        this.numberOfRows = numberOfRows;
        this.numberOfSeatsPerRow = numberOfSeatsPerRow;
        // generate seating plan
        seats = new StaticSeat[numberOfRows][numberOfSeatsPerRow];
        // for each seat - call constructor
    }

    public String getLabel() {
        return label;
    }

    public char getFirstRowLetter() {
        return firstRowLetter;
    }

    public int getFirstSeatNumber() {
        return firstSeatNumber;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfSeatsPerRow() {
        return numberOfSeatsPerRow;
    }

    public StaticSeat getSeat(char row, int seatNumber) {
        return null;
    }
}
