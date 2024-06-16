package org.example.booking;

import org.example.Passenger;
import org.example.flight.Flight;
import org.example.seat.Seat;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingManager {
    private static volatile BookingManager instance;
    private final Map<String, Booking> bookings;
    private static final Object lock = new Object();
    private final AtomicInteger bookingCounter = new AtomicInteger(0);

    public BookingManager(){
        bookings = new HashMap<>();

    }
    public static BookingManager getInstance(){
        if (instance == null) synchronized (lock) {
            if (instance == null) {
                instance = new BookingManager();
            }
        }
        return instance;
    }
//    public Booking createBooking(Flight flight, Seat seat, Passenger passenger,double amount){
//
//    }

}
