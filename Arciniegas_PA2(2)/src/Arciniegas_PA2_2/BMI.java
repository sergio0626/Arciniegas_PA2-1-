package Arciniegas_PA2_2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	    int x ;
	    float Weight;
	    float Height;
	    float BMI;
	System.out.println("");System.out.println("");
	       System.out.print("Weight in Pounds or Kilos, Height in inches or in meters.");
	       System.out.println("");
	       System.out.println("");
	      System.out.print("Is your input in pounds(1) or kilos(2)?");
	      System.out.println("");

	    x = scnr.nextInt();
	 System.out.print("How much do you weigh?  What is your Height?");

	 Weight = scnr.nextFloat();
	 Height = scnr.nextFloat();

	switch(x){


	    case 1:
	      BMI = (703*Weight)/(Height*Height);
	       System.out.println("");
	      System.out.println("Your BMI is " + BMI);
	       System.out.println("");
	      break;
	    case 2:
	      BMI = (Weight/((Height*Height)));
	       System.out.println("");
	      System.out.println("Your BMI is " +BMI);
	       System.out.println("");
	      break;
	    default:
	      System.out.println("Your input was wrong mate come on follow directions");




	}
	System.out.println("");
	System.out.println("BMI categories:");
	System.out.println("");
	System.out.println("Underweight = <18.5");

	System.out.println("");
	System.out.println("Normal weight = 18.5–24.9 ");
	System.out.println("");
	System.out.println("Overweight = 25–29.9");
	System.out.println("");
	System.out.println("Obesity = BMI of 30 or greater");
	System.out.println("");
	scnr.close();
	}

}
