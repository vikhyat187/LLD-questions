package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Road {
    private String roadId;
    private String name;
    private TrafficLight trafficLight;
    public Road(String roadId, String name){
        this.roadId = roadId;
        this.name = name;
    }
}
