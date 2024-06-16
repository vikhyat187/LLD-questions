package org.example;

public class Aircraft {
    private String aircraftNo;
    private int noOfSeats;
    private String model;

    public Aircraft(String aircraftNo, String model, int noOfSeats){
        this.noOfSeats = noOfSeats;
        this.aircraftNo = aircraftNo;
        this.model = model;
    }
}
