package com.method.overriding;

class A{
	public void show() {
		System.out.println("In A");
	}
}

class B extends A{
	@Override   //To Avoid Logical error
	public void show() {
		super.show();
		System.out.println("In B");		
	}
}

public class MethodOverr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show();

	}

}
