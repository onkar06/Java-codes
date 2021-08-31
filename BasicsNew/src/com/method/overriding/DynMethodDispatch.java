package com.method.overriding;

class X{
	public void show() {
		System.out.println("In X");
	}
}

class Y extends X{
	@Override   //To Avoid Logical error
	public void show() {
		System.out.println("In Y");		
	}
}

public class DynMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj = new Y();
		obj.show();
		
		obj = new X();
		obj.show();		

	}

}
