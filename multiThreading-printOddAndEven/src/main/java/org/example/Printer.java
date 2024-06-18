package org.example;

import lombok.NonNull;
import lombok.SneakyThrows;

public class Printer implements Runnable {
    private final State state;
    private int currentCount;
    private final PrinterType currentPrinterType;
    private final PrinterType nextPrinterType;
    private final int step;
    private final int maxValue;

    public Printer(@NonNull final int startValue, @NonNull int maxValue, @NonNull int step, @NonNull PrinterType currentPrinterType,
                   @NonNull PrinterType nextPrinterType, @NonNull State state) {
        this.currentCount = startValue;
        this.maxValue = maxValue;
        this.step = step;
        this.state = state;
        this.currentPrinterType = currentPrinterType;
        this.nextPrinterType = nextPrinterType;
    }

    @SneakyThrows
    @Override
    public void run() {
        //make the other thread sleep
        //print my value and notify others
        while (currentCount <= maxValue) {
            synchronized (state) {
                while (this.currentPrinterType != state.getNextPrinterType()) {

                    state.wait();
                }
                System.out.println(this.currentPrinterType + " " + currentCount);
                currentCount += step;
                state.setNextPrinterType(this.nextPrinterType);
                state.notifyAll();
            }
        }
    }

}