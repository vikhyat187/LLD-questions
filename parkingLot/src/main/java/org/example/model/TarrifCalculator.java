package org.example.model;

public interface TarrifCalculator {
    public double calculateTarrif(long entryTime, ParkingSpot parkingSpot);
}

//this can be instantiated by a strategy pattern to have different tarrif on weekdays and weekends