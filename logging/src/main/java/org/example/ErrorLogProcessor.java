package org.example;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel, String logMessage){
        if (logLevel == LogProcessor.ERROR){
            System.out.println("ERROR - " + logMessage);
        } else{
            super.log(logLevel, logMessage);
        }
    }
}
