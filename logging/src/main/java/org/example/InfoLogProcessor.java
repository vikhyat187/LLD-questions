package org.example;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String logMessage){
        if (logLevel == LogProcessor.INFO){
            System.out.println("INFO - " + logMessage);
        } else{
            super.log(logLevel, logMessage);
        }
    }
}
