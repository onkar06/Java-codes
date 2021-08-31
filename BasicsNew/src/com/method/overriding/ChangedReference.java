package com.method.overriding;

class C{
	public void show() {
		System.out.println("In C");
	}
}

class D extends C{
	@Override   //To Avoid Logical error
	public void show() {
		super.show();
		System.out.println("In D");		
	}
	public void refer() {
		System.out.println("In refer method");
	}
}

public class ChangedReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new D();
		obj.show();
		//obj.refer();   //Not Valid bcoz it is not present in Class C

	}

}
