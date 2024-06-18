package org.example;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel, String logMessage){
        if (logLevel == LogProcessor.DEBUG){
            System.out.println("DEBUG - " + logMessage);
        } else{
            super.log(logLevel, logMessage);
        }
    }
}
