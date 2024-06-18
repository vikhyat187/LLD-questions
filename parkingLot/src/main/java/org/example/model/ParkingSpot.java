package org.example.model;

import lombok.extern.slf4j.Slf4j;
import org.example.exceptions.ParkingSpotNotAvailableException;

@Slf4j
public abstract class ParkingSpot {
    private String parkingSpotId;
    private boolean isFree;
    private double amountPerHour;
    private boolean parkVehicle() throws ParkingSpotNotAvailableException {
        if (!isFree){
//            log.debug("This parking spot is not Free at teh moment");
            return false;
        }
        isFree = false;
        return true;
    }
}
