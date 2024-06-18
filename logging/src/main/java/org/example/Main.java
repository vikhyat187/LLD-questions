package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.INFO,"testing info");
        logger.log(LogProcessor.DEBUG,"testing debug");
        logger.log(LogProcessor.ERROR,"testing error");
    }
}