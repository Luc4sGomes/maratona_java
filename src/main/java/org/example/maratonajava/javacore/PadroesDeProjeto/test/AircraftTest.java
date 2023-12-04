package org.example.maratonajava.javacore.PadroesDeProjeto.test;

import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Aircraft;

public class AircraftTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("785-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
