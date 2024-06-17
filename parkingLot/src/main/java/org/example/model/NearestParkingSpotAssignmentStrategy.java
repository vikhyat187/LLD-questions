package org.example.model;

public class NearestParkingSpotAssignmentStrategy implements ParkingSpotAssignmentStrategy{

    @Override
    public ParkingSpot getParkingSpot(Terminal terminal) {
        return null;
    }

    @Override
    public boolean releaseParkingSpot(ParkingSpot parkingSpot) {
        return false;
    }
}
/**
 *
 * We can use the heap for this to get the nearest parking spot based on distance from the terminal
 */
