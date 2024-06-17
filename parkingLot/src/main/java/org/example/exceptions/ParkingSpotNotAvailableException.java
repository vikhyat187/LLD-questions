package org.example.exceptions;

public class ParkingSpotNotAvailableException extends Throwable{
    public ParkingSpotNotAvailableException(String message){
        super(message);
    }
}
