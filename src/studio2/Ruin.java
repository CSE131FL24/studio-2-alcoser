package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Start Amount");
		int Stnumber = in.nextInt();
		System.out.print("WinChance");
		double Pw  = in.nextDouble();
		System.out.print("winlimit");
		int winl = in.nextInt();
		System.out.print("totalSimulation");
		int total = in.nextInt();
		
		int count = 0;
		while (Stnumber != winl|| Stnumber == 0 ||count == total){
			double WorL = (double)Math.random();
			if (WorL <= Pw) {
				Stnumber ++;     
			}
			else {Stnumber--;
				
			} 



		      
		 }
		
		

	}


