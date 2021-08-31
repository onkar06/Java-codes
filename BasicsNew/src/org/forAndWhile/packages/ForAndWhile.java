package org.forAndWhile.packages;

public class ForAndWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Note : Use for loop when we know when to stop: start and end");
		System.out.println("Use while loop when we don't know");
		System.out.println("");
		//While
		int i = 1;
		while(i<=5){
			System.out.println("Hello");
			i++;			
		}
		
		System.out.println("");
		//do-While loop
		int num =  100;
		do {
			System.out.println("True");
			num++;
		}while(num<5);
		
		System.out.println("");
		//For Loop
		for(int m=1;m<=5;m++) {
			System.out.println("Using For Loop");
		}
		
		System.out.println("");
		//Nested For
		/*
		 * &
		 * & &
		 * & & &
		 * & & & &
		 */
		for(int k=1;k<=4;k++) {
			for(int l=1;l<=k;l++) {
				System.out.print("& ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		//Nested ASCII values
		/*
		 * A
		 * A B
		 * A B C
		 * A B C D
		 */	
		for(char c=65;c<=68;c++) {
			for(char asc=65;asc<=c;asc++) {
				System.out.print(asc);
				System.out.print(" ");
			}
			System.out.println("");
		}
		

	}

}
