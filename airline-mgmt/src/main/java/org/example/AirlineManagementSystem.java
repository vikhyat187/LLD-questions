package org.example;

import org.example.booking.BookingManager;
import org.example.flight.Flight;
import org.example.flight.FlightSearch;
import org.example.payment.PaymentProcessor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineManagementSystem {
    private final List<Flight> flights;
    private final List<Aircraft> aircrafts;
    private final FlightSearch flightSearch;
    private final PaymentProcessor paymentProcessor;
    private final BookingManager bookingManager;

    public AirlineManagementSystem(){
        this.flights = new ArrayList<>();
        this.aircrafts = new ArrayList<>();
        this.flightSearch = new FlightSearch(flights);
        paymentProcessor = PaymentProcessor.getInstance();
        bookingManager = BookingManager.getInstance();
    }
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public List<Flight> searchFlights(String source, String destination, LocalDateTime arrivalTime, LocalDateTime deptTime) {
        return flightSearch.findFlights(source, destination, arrivalTime, deptTime);
    }



}
