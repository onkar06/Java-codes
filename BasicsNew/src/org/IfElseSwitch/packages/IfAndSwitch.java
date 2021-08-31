package org.IfElseSwitch.packages;

public class IfAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * int  n = 7;
		if(true) {
			System.out.println("Hello");
		}
		if(false) {
			System.out.println("Bye");
		}
		if(n==8) {
			System.out.println("Given number is 7");
		}
		if(n%2==1) {
			System.out.println("Number 7 is Odd");
		}
		else if(n==0) {
			System.out.println("Nothing");
		}
		else {
			System.out.println("Number is Even");
		}
		*/
		
		//Switch
		
		//Switch dosen't support double, float
		//We can use string in switch from 1.7
		
		int num = 4;
		
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("No match");
		}

	}

}
