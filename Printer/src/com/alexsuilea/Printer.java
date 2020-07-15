package com.alexsuilea;

import java.sql.SQLOutput;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPages, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void tonerCapacity(){
        if(getTonerLevel() <= 0){
            System.out.println("The toner is empty. Please fill it up.");
            tonerLevel = 0;
        } else if(getTonerLevel() > 0 && getTonerLevel() < 100){
            System.out.println("The toner capacity is: " +getTonerLevel() +"%");
        } else {
            System.out.println("The toner is full.");
            tonerLevel = 100;
        }
    }

    public void fillUpTonerLevel(int toner){
        System.out.println("The toner is filled up..");
        if(getTonerLevel() >= 100){
            System.out.println("The toner is full.");
        } else {
            tonerLevel += toner;
            System.out.println("Now the toner is " + getTonerLevel() +"%");
        }
    }

    public void printPage(int newPage){
        if(isDuplexPrinter() && getTonerLevel() > 0 && getTonerLevel() <= 100){
            System.out.println("Printing new duplex pages..");
            if(getTonerLevel() >= 10 * newPage){
                numberOfPages += 2 * newPage;
                tonerLevel -= 10 * newPage;
                System.out.println("Now the number of pages is: "+getNumberOfPages());
            } else {
                System.out.println("Not enough toner. You will need at least " + 10 * newPage + "% toner.");
            }
        } else if ((!isDuplexPrinter()) && getTonerLevel() > 0 && getTonerLevel() <= 100){
            System.out.println("Printing a new page..");
            if(getTonerLevel() >= 5 * newPage){
                numberOfPages += newPage;
                tonerLevel -= 5 * newPage;
                System.out.println("Now the number of pages is: "+getNumberOfPages());
            } else {
                System.out.println("Not enough toner. You will need at least "+ 5 * newPage +"% toner.");
            }
        } else {
            System.out.println("The toner is empty. Please fill it up.");
        }

    }
}
