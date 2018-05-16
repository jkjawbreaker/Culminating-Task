package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.company.projConstants.*;
public class Main {

    static int gridSize=0;
    static String[] arg={null};
    public static void main(String[] args) {
        mapRobot mapClass= new mapRobot();
        mineRobot mineClass= new mineRobot();
        System.out.println("How big would you like your array to be?\nmust be between 1 and 1000");
        Scanner inputScanner = new Scanner(System.in);

        try {
            gridSize=inputScanner.nextInt();
        }catch (InputMismatchException error){
            System.out.println("you must enter a number");
        }
        if(1000<gridSize && gridSize<1){
            System.out.print("you must enter a number between 1 and 1000");
            System.exit(0);
        }
        int Grid[][]=new int[gridSize][gridSize];
        boolean isGridFound[][]=new boolean[gridSize][gridSize];
        String shownGrid[][]=new String[gridSize][gridSize];

    }
}
