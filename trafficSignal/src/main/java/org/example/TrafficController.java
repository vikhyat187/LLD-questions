package org.example;

public class TrafficController {
    private static volatile TrafficController instance;
    private TrafficController(){

    }

    public static TrafficController getInstance(){
        if (instance == null){
            synchronized(instance){
               if (instance == null){
                   instance = new TrafficController();
               }
            }
        }
        return instance;
    }

}
