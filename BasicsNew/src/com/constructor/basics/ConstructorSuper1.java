package com.constructor.basics;

class C{
	public C() {
		System.out.println("In A");
	}
	public C(int i) {
		System.out.println("In C with Arg");
	}
}

class D extends C{
	public D() {
		System.out.println("In D");
	}
	public D(int i) {
		System.out.println("In D with Arg");
	}
}

public class ConstructorSuper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D(6);

	}

}
