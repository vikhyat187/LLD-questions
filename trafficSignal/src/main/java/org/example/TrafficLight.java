package org.example;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrafficLight {
    private Signal signal;
    private int redDuration;
    private int greenDuration;
    private int yellowDuration;

    public TrafficLight(int redDuration,
                        int greenDuration,
                        int yellowDuration){
        this.redDuration = redDuration;
        this.yellowDuration = yellowDuration;
        this.greenDuration = greenDuration;
        this.signal = Signal.RED;
    }

    public synchronized void changeSignal(Signal signal){
        this.signal = signal;
//        notifyObservers();
    }

}
