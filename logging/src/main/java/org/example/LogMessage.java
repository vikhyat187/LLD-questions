package org.example;

import jdk.nashorn.internal.objects.annotations.Getter;

public class LogMessage {
    private LogLevel logLevel;
    private int timeStamp;
    private String message;

    public LogMessage(LogLevel logLevel, int timeStamp, String message){
        this.logLevel = logLevel;
        this.timeStamp = timeStamp;
        this.message = message;
    }
}
