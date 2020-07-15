package com.alexsuilea;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(-300, true);
        printer.tonerCapacity();
        printer.fillUpTonerLevel(50);
        printer.printPage(5);
        printer.tonerCapacity();;
    }
}
