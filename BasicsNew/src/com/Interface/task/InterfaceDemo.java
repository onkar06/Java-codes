package com.Interface.task;

interface Box{
	void show();
	/*public void notAllowed() {
		Not allowed to define method in interface
	}
	*/
}

class Pen implements Box{
	public void show() {
		System.out.println("I'm a Pen");
	}
}

class Pencil implements Box{
	public void show() {
		System.out.println("I'm a Pencil");
	}
}

class Printer{
	public void doSomething(Box b) {
		b.show();
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj1 = new Printer();
		Box pen = new Pen();
		Box pencil = new Pencil();
		obj1.doSomething(pen);
		obj1.doSomething(pencil);

	}

}
