package com.constructor.basics;

class A{
	public A() {
		System.out.println("In A");
	}
}

class B extends A{
	public B() {
		System.out.println("In B");
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();

	}

}
