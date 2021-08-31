package com.constructor.basics;

class E{
	public E() {
		System.out.println("In E");
	}
	public E(int i) {
		System.out.println("In E with Arg");
	}
}

class F extends E{
	public F() {
		super();
		System.out.println("In F");
	}
	public F(int i) {
		super(i);
		System.out.println("In F with Arg");
	}
}

public class ConstructorSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F obj = new F(5);

	}

}
