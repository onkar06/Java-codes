package org.operator.packages;

public class Operators {
	
	/*
	 *  Arithmatic +,-,*,/,%
	 *  Bitwise
	 *  Relational
	 *  Logical
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=6,n=4;
		int r1= m+n;   //10
		int r2 = m-n;  // 2
		int r3 = m*n;  //24
		double r4 = (double)m/n;  //1.5
		int r5 = m%n;  //2
		// m +=n;  equals to m = m+n  (ShortHand operator)
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		// m = n++;  o/p of m= 4 and n = 5.... Post increment
		// m = ++n;  o/p of m = 5 and n = 5... Pre increment

	}

}
