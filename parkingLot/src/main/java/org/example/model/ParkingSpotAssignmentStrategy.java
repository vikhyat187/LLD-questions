package org.example.model;

public interface ParkingSpotAssignmentStrategy {
    public ParkingSpot getParkingSpot(Terminal terminal);

    public boolean releaseParkingSpot(ParkingSpot parkingSpot);
}
