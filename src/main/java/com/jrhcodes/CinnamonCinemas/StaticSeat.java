package com.jrhcodes.CinnamonCinemas;

public class StaticSeat {

    private final int seatNumber;
    private final char row;

    public int getSeatNumber() {
        return seatNumber;
    }

    public char getRow() {
        return row;
    }

    public StaticSeat(char row, int seatNumber ) {
        this.seatNumber = seatNumber;
        this.row = row;
    }

}
