package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.company.projConstants.*;
public class Main {
    public static mapRobot mapClass= new mapRobot();
    public static mineRobot mineClass= new mineRobot();
    private static int createInt(int Max,int Min){
        int result=0;
        try {
            Scanner inputScanner = new Scanner(System.in);
            result = inputScanner.nextInt();
        } catch (InputMismatchException error) {
            System.out.println("Must be a Integer");
        }
        if (Max < result || result < Min) {
            System.out.println("number in not within parameters");
            System.exit(0);
        } else {
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("How big would you like your array to be?\nmust be between 1 and 1000");
        mapClass.setGridSize(createInt(1000,1));
        System.out.println("What row would you like your mining robot to start in?\nmust be between 1 and 1000");
        mapClass.setStartXPos(createInt(mapClass.getGridSize(),1));
        System.out.println("What column would you like your mining robot to start in?\nmust be between 1 and 1000");
        mapClass.setStartXPos(createInt(mapClass.getGridSize(),1));
        System.out.println("Symbols\n"+"Unmapped land ="+shownUnmapped+"\nMapped land="+shownMapped+"\nMap robot="
                +shownMapRobot+"\nMine Robot="+shownMineRobot);
        mapClass.printGrid(mapClass.getShownGrid());
    }
}
