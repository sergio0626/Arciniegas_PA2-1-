package Arciniegas_PA2_1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	      final int NUM_ELEMENTS = 4;             
	      int[] userVals = new int[NUM_ELEMENTS]; 
	      int i;   
	      int Temp1; 
	      int Temp2;                              

	      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
	      for (i = 0; i < userVals.length; ++i) {
	         System.out.print("Digit"+(i+1)+": ");
	         userVals[i] = scnr.nextInt();
	      }
	      
	      System.out.print("You entered the crypted code: ");
	      for (i = 0; i < userVals.length; ++i) {
	         System.out.print(userVals[i] + " ");
	      }
	      System.out.println();

	     userVals[0]=userVals[0]-7;
	     userVals[1]=userVals[1]-7;
	     userVals[2]=userVals[2]-7;
	     userVals[3]=userVals[3]-7;

	Temp1=userVals[0];
	      userVals[0]=userVals[2];
	      userVals[2]=Temp1;
	    Temp2=userVals[1];
	      userVals[1]=userVals[3];
	      userVals[3]=Temp2;


	  System.out.print("Decrypted code: ");

	      for (i = 0; i <= userVals.length; ++i){
	              if (userVals[i]<0){
	                userVals[i]=userVals[i]+10;
	              }
	                System.out.print(((userVals[i])) + " ");}
	      scnr.close();
	}

}
