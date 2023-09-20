package studio2;

import java.util.Scanner;
import java.util.Random;

public class Nim {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the inital number of sticks?");
		int totalnumstick = in.nextInt();
		//int totalstick = in.nextInt(); 
		int currentnumstick = totalnumstick;
		//boolean Humamround = true;
		int roundnum=0;
		
		
		while (currentnumstick>0) {
			if(roundnum%2==0) {
				System.out.println("Enter the number of sticks you will take?");
				int Humannum=in.nextInt();
				if(currentnumstick==1){
					while (Humannum!=1) {
						System.out.println("Please enter the valid number of sticks you will take. The number should be 1.");
						Humannum=in.nextInt();
					}
				}
				else {
					while(Humannum!=1 && Humannum!=2) {
						System.out.println("Please enter the valid number of sticks you will take. The number should be 1 or 2.");
						Humannum=in.nextInt();
					}
				}
				currentnumstick=totalnumstick-Humannum;
				System.out.println("Round " + roundnum + ": " + totalnumstick + " at start human takes " +Humannum+" so "+currentnumstick +" remain");
				totalnumstick=totalnumstick-Humannum;
			}
			if(roundnum%2!=0) {
				if(currentnumstick==1) {
					System.out.println("Enter the number of sticks you will take?");
					int Computernum=currentnumstick;
					currentnumstick=totalnumstick-Computernum;
					System.out.println("Round " + roundnum + ": " + totalnumstick + " at start human takes " +Computernum+" so "+currentnumstick +" remain");
				}
				else {
					Random random = new Random();
					int Computernum =random.nextInt(2)+1;
					currentnumstick=totalnumstick-Computernum;
					System.out.println("Round " + roundnum + ": " + totalnumstick + " at start computer takes " +Computernum+" so "+currentnumstick +" remain");
					totalnumstick=totalnumstick-Computernum;

					
				}
				
			}
			roundnum++;
			
		}
		if(roundnum%2!=0) {
			System.out.println("You win / The computer lose!");
		}
		else {
			System.out.println("The computer wins / you lose!");
			}
		

	}

}
