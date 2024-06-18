package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class State {
    private PrinterType nextPrinterType;

    public State(final PrinterType nextPrinterType){
        this.nextPrinterType = nextPrinterType;
    }
}
