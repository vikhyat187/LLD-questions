package org.example.flight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private final List<Flight> flights;

    public FlightSearch(List<Flight> flights){
        this.flights = flights;
    }
    public List<Flight> findFlights(String arrivalLocation, String destLocation, LocalDateTime arrivalTime, LocalDateTime deptTime){
//            throws FlightNotFoundException{
        List<Flight> availableFLights = flights.stream()
                .filter(flight ->
                            flight.getArrivalLocation().equalsIgnoreCase(arrivalLocation) &&
                                    flight.getDestLocation().equalsIgnoreCase(destLocation) &&
                                    flight.getArrivalTime().isEqual(arrivalTime)

                ).collect(Collectors.toList());

        return availableFLights;
    }

}
