package Arciniegas_PA2_1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		
		
		Scanner scnr = new Scanner(System.in);
	      final int NUM_ELEMENTS = 4;             
	      int[] userVals = new int[NUM_ELEMENTS]; 
	      int i;   
	      int Temp1; 
	      int Temp2;                              

	      System.out.println("Enter " + NUM_ELEMENTS + " integer values to crypt them...");
	      for (i = 0; i < userVals.length; ++i) {
	         System.out.print("Digit"+(i+1)+": ");
	         userVals[i] = scnr.nextInt();
	      }
	      
	      System.out.print("You entered: ");
	      for (i = 0; i < userVals.length; ++i) {
	         System.out.print(userVals[i] + " ");
	      }
	      System.out.println();
	    Temp1=userVals[0];
	      userVals[0]=userVals[2];
	      userVals[2]=Temp1;
	    Temp2=userVals[1];
	      userVals[1]=userVals[3];
	      userVals[3]=Temp2;

	    System.out.print("It is now: ");
	      for (i = 0; i < userVals.length; ++i) {
	         System.out.print((userVals[i]+7)%10 + " ");
	      }
	      scnr.close();
	}

}
