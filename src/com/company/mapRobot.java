package com.company;
import static com.company.projConstants.*;
/**
 * Created by 90937kav on 15/05/2018.
 */
public class mapRobot {
    private static int Grid[][];
    private static String shownGrid[][];
    private static int gridSize;
    private static int startXPos;
    private static int startYPos;
    private static boolean isGridMapped[][];
    public static int getGridSize() {
        return gridSize;
    }
    public int[][] getGrid() {
        return Grid;
    }
    public static int getStartXPos() {
        return startXPos;
    }
    public static int getStartYPos() {
        return startYPos;
    }
    public static String[][] getShownGrid() {
        return shownGrid;
    }

    public static void setGridSize(int gridSize) {
        mapRobot.gridSize = gridSize;
    }
    public void setGrid(int[][] grid) {
        Grid = grid;
    }
    public static void setStartXPos(int startXPos) {
        mapRobot.startXPos = startXPos;
    }
    public static void setStartYPos(int startYPos) {
        mapRobot.startYPos = startYPos;
    }

    public static final void resetGrid(){
        isGridMapped=new boolean[gridSize][gridSize];
        Grid=new int[gridSize][gridSize];
        String shownGrid[][]=new String[gridSize][gridSize];
        for (int i=0;i<gridSize;i++) {
            for (int j=0;j<gridSize;j++) {
                shownGrid[i][j]=shownUnmapped;
            }
        }
    }
    public static final void printGrid(String[][] printArray){
        for(int i=0;i<printArray.length;i++){
            for (int j=0;j<printArray.length;j++){
                System.out.print(printArray[i][j]);
            }
            System.out.print("\n");
        }
    }
    private int resourceValue(){
        return INVALID;
    }
    public int getResourceValue(){
        return resourceValue();
    }

}
