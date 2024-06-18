package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final State state = new State(PrinterType.ODD);
        final Printer oddPrinter = new Printer(1,50,1, PrinterType.ODD, PrinterType.EVEN, state);
        final Printer evenPrinter = new Printer(2,50,1, PrinterType.EVEN, PrinterType.ODD, state);

        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);
        oddThread.start();
        evenThread.start();

    }
}