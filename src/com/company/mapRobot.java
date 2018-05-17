package com.company;
import static com.company.projConstants.*;
/**
 * Created by 90937kav on 15/05/2018.
 */
public class mapRobot {

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
