package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.company.projConstants.*;
public class Main {
    static int gridSize;
    static int startXPos;
    static int startYPos;
    static int createInt(int Max,int Min){
        boolean repeat=true;
        int result=0;
        do {
            repeat=false;
            try {
                Scanner inputScanner = new Scanner(System.in);
                result = inputScanner.nextInt();
                repeat=false;
            } catch (InputMismatchException error) {
                System.out.println("Must be a Integer");
                break;
            }
            if (repeat=false) {
                if (Max < gridSize && gridSize < Min) {
                    System.out.println("number in not within parameters");
                    repeat=true;
                } else {
                    repeat=false;
                }
            }
        }while (repeat);
        return result;
    }
    public static void main(String[] args) {
        mapRobot mapClass= new mapRobot();
        mineRobot mineClass= new mineRobot();
        System.out.println("How big would you like your array to be?\nmust be between 1 and 1000");
        gridSize= createInt(1000,1);
        int Grid[][]=new int[gridSize][gridSize];
        boolean isGridMapped[][]=new boolean[gridSize][gridSize];
        String shownGrid[][]=new String[gridSize][gridSize];
        mapClass.printGrid(shownGrid);
    }
}
