package Arciniegas_PA2_3;

import java.util.Scanner;

public class polls {

	public static void main(String[] args) {
		
		
		
		Scanner scnr = new Scanner(System.in);
		float Appearance =0;
		float Intelligence=0;
		float Personality = 0;
		float Wealth  = 0;
		float Compatability= 0;
		float tempAppearance= 0;
		float tempIntelligence= 0;
		float tempPersonality= 0;
		float tempWealth= 0;
		float tempCompatability= 0;
		float MaxVariable = 0;
		float MinVariable = 0;

		int [][] arr = { {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } }; 

		 int Check= 0;

		int x;
		x=1;


		int l=0;
		while (x!=0)
		{
		  System.out.println("");
		  l++;
		  System.out.println("----------SURVEY "+ l +"----------");
		  System.out.print("In terms of attraction, how important is another persons ");
		System.out.println("");
		System.out.println("");
		System.out.println("Appearance");
		System.out.println("Intelligence");
		System.out.println("Personality");
		System.out.println("Wealth");
		System.out.println("Compatability");
		System.out.println("");
		System.out.println("");
		System.out.println("1 is least important, 10 is most important");

		System.out.println("");
		{
		  
		  System.out.println("Rank Appearance");
		 tempAppearance = scnr.nextFloat();
		 Appearance = tempAppearance + Appearance; 


		if (tempAppearance==1){
		      arr[1][0]= arr[1][0]+1;
		  }
		  else if (tempAppearance==2){
		arr[1][1]= arr[1][1]+1;
		  }
		  else if (tempAppearance==3){
		    arr[1][2]= arr[1][2]+1;
		  }
		  else if (tempAppearance==4){
		    arr[1][3]= arr[1][3]+1;
		  }
		  else if (tempAppearance==5){
		    arr[1][4]= arr[1][4]+1;
		  }
		  else if (tempAppearance==6){
		    arr[1][5]= arr[1][5]+1;
		  }
		  else if (tempAppearance==7){
		    arr[1][6]= arr[1][6]+1;
		  }
		  else if (tempAppearance==8){
		    arr[1][7]= arr[1][7]+1;
		  }
		  else if (tempAppearance==9){
		    arr[1][8]= arr[1][8]+1;
		  }
		  else if (tempAppearance==10){
		    arr[1][9]= arr[1][9]+1;
		  
		  }
		  tempAppearance=0;


		  
		  }


		{
		  
		  
		  System.out.println("Rank Intelligence");
		      
		      
		      tempIntelligence = scnr.nextFloat();
		 Intelligence = tempIntelligence + Intelligence; 


		if (tempIntelligence==1){
		      arr[2][0]= arr[2][0]+1;
		  }
		  else if (tempIntelligence==2){
		arr[2][1]= arr[2][1]+1;
		  }
		  else if (tempIntelligence==3){
		    arr[2][2]= arr[2][2]+1;
		  }
		  else if (tempIntelligence==4){
		    arr[2][3]= arr[2][3]+1;
		  }
		  else if (tempIntelligence==5){
		    arr[2][4]= arr[2][4]+1;
		  }
		  else if (tempIntelligence==6){
		    arr[2][5]= arr[2][5]+1;
		  }
		  else if (tempIntelligence==7){
		    arr[2][6]= arr[2][6]+1;
		  }
		  else if (tempIntelligence==8){
		    arr[2][7]= arr[2][7]+1;
		  }
		  else if (tempIntelligence==9){
		    arr[2][8]= arr[2][8]+1;
		  }
		  else if (tempIntelligence==10){
		    arr[2][9]= arr[2][9]+1;
		  
		  }
		  tempIntelligence=0;
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      }
		{
		  
		  
		  System.out.println("Rank Personality");
		      tempPersonality = scnr.nextFloat();
		 Personality = tempPersonality + Personality; 


		if (tempPersonality==1){
		      arr[3][0]= arr[3][0]+1;
		  }
		  else if (tempPersonality==2){
		arr[3][1]= arr[3][1]+1;
		  }
		  else if (tempPersonality==3){
		    arr[3][2]= arr[3][2]+1;
		  }
		  else if (tempPersonality==4){
		    arr[3][3]= arr[3][3]+1;
		  }
		  else if (tempPersonality==5){
		    arr[3][4]= arr[3][4]+1;
		  }
		  else if (tempPersonality==6){
		    arr[3][5]= arr[3][5]+1;
		  }
		  else if (tempPersonality==7){
		    arr[3][6]= arr[3][6]+1;
		  }
		  else if (tempPersonality==8){
		    arr[3][7]= arr[3][7]+1;
		  }
		  else if (tempPersonality==9){
		    arr[3][8]= arr[3][8]+1;
		  }
		  else if (tempPersonality==10){
		    arr[3][9]= arr[3][9]+1;
		  
		  }
		  tempPersonality=0;
		      
		      
		      
		      
		      
		      }
		{
		  
		  
		  System.out.println("Rank Wealth");
		      tempWealth = scnr.nextFloat();
		 Wealth = tempWealth + Wealth; 


		if (tempWealth==1){
		      arr[4][0]= arr[4][0]+1;
		  }
		  else if (tempWealth==2){
		arr[4][1]= arr[4][1]+1;
		  }
		  else if (tempWealth==3){
		    arr[4][2]= arr[4][2]+1;
		  }
		  else if (tempWealth==4){
		    arr[4][3]= arr[4][3]+1;
		  }
		  else if (tempWealth==5){
		    arr[4][4]= arr[4][4]+1;
		  }
		  else if (tempWealth==6){
		    arr[4][5]= arr[4][5]+1;
		  }
		  else if (tempWealth==7){
		    arr[4][6]= arr[4][6]+1;
		  }
		  else if (tempWealth==8){
		    arr[4][7]= arr[4][7]+1;
		  }
		  else if (tempWealth==9){
		    arr[4][8]= arr[4][8]+1;
		  }
		  else if (tempWealth==10){
		    arr[4][9]= arr[4][9]+1;
		  
		  }
		  tempWealth=0;
		      
		      
		      
		      
		      
		      
		      
		      
		      }
		{
		  System.out.println("Rank Compatability");
		      
		      
		tempCompatability = scnr.nextFloat();
		 Compatability = tempCompatability + Compatability; 


		if (tempCompatability==1){
		      arr[5][0]= arr[5][0]+1;
		  }
		  else if (tempCompatability==2){
		arr[5][1]= arr[5][1]+1;
		  }
		  else if (tempCompatability==3){
		    arr[5][2]= arr[5][2]+1;
		  }
		  else if (tempCompatability==4){
		    arr[5][3]= arr[5][3]+1;
		  }
		  else if (tempCompatability==5){
		    arr[5][4]= arr[5][4]+1;
		  }
		  else if (tempCompatability==6){
		    arr[5][5]= arr[5][5]+1;
		  }
		  else if (tempCompatability==7){
		    arr[5][6]= arr[5][6]+1;
		  }
		  else if (tempCompatability==8){
		    arr[5][7]= arr[5][7]+1;
		  }
		  else if (tempCompatability==9){
		    arr[5][8]= arr[5][8]+1;
		  }
		  else if (tempCompatability==10){
		    arr[5][9]= arr[5][9]+1;
		  
		  }
		  tempCompatability=0;









		}



		 System.out.println("New poll 1 yes 0 no?");
		      x= scnr.nextInt();
		    





		      
		      

		}


		 


		        
		for (int i = 0; i < 6; i++) { 
		if (Check==0){
		  System.out.print("Rank           ");}
		else if (Check==1){
		  System.out.print("Appearance:    ");}
		else if(Check==2){
		  System.out.print("Intelligence:  ");}
		else if(Check==3){
		  System.out.print("Personality:   ");
		}
		else if(Check==4){
		  System.out.print("Wealth:        ");
		}
		else if(Check==5){
		  System.out.print("Compatability: ");

		}

		            for (int j = 0; j < 10; j++) { 
		                System.out.print(arr[i][j] + " "); 
		               
		            } 

		             if (i==0){
		  System.out.print("  Average Results:");
		}
		            else if (i==1){
		  System.out.print("      "+     Appearance/l);}
		else if(i==2){
		  System.out.print("      "+     Intelligence/l);}
		else if(i==3){
		  System.out.print("      "+     Personality/l   );
		}
		else if(i==4){
		  System.out.print("      "+     Wealth/l      );
		}
		else if(i==5){
		  System.out.print("      "+     Compatability/l );

		}
		            System.out.println("");
		            System.out.print("----------------------------------------------------------");
		            Check = Check + 1;
		           
		            System.out.println(); 

		        } 
		    


		MaxVariable = Math.max(Appearance/l, Math.max(Intelligence/l, Math.max(Personality/l, Math.max(Wealth/l, Compatability/l))));

		MinVariable = Math.min(Appearance/l, Math.min(Intelligence/l, Math.min(Personality/l, Math.min(Wealth/l, Compatability/l))));


		System.out.println("A total of "+ l + " Surveys were recorded.");
		System.out.print("The highest average category was: " + MaxVariable + " " );       


		if(MaxVariable==Appearance/l){
		      System.out.println("Appearance");


		          }
		else if (MaxVariable==Intelligence/l){
		  System.out.println("Intelligence");
		}
		else if (MaxVariable==Personality/l){
		  System.out.println("Personality");
		}
		else if (MaxVariable==Wealth/l){
		  System.out.println("Wealth");
		}
		else if (MaxVariable==Compatability/l){
		  System.out.println("Compatability");
		}

		System.out.println("");

		System.out.print("The lowest average category was: " + MinVariable +" "  );



		if(MinVariable==Appearance/l){
		      System.out.println("Appearance");


		          }
		else if (MinVariable==Intelligence/l){
		  System.out.println("Intelligence");
		}
		else if (MinVariable==Personality/l){
		  System.out.println("Personality");
		}
		else if (MinVariable==Wealth/l){
		  System.out.println("Wealth");
		}
		else if (MinVariable==Compatability/l){
		  System.out.println("Compatability");
		}
		scnr.close();

	}

}
