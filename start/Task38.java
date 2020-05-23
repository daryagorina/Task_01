package by.htp.les01.start;

import java.util.Scanner;

public class Task38 {

	public static void main(String[] args) {
		  
		
		int x = scannerInt();
	    int y = scannerInt();
	
		
		


        
        // задание 1
        if (y + Math.abs(x) <= 4 && y >= 0){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");

        // задание 2
        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");

        // задание 3
        if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
       

	}

}
