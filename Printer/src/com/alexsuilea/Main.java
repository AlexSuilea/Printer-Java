package com.alexsuilea;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(0,1, true);
        printer.tonerCapacity();
        printer.fillUpTonerLevel(15);
        printer.printPage(4);
        printer.tonerCapacity();
        printer.fillUpTonerLevel(85);
        printer.tonerCapacity();
        printer.printPage(4);
        printer.tonerCapacity();
    }
}
