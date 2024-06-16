package org.example.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.seat.Seat;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class Flight {
    private String flightNo;
    private String arrivalLocation;
    private String destLocation;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private List<Seat> availableSeats;
}

