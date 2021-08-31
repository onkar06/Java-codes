package com.abstractclass;

abstract class Box{
	public abstract void show();
}

class Pen extends Box{
	public void show() {
		System.out.println("I'm a Pen");
	}
}

class Pencil extends Box{
	public void show() {
		System.out.println("I'm a Pencil");
	}
}

class Printer{
	public void doSomething(Box b) {
		b.show();
	}
}

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj1 = new Printer();
		Box pen = new Pen();
		Box pencil = new Pencil();
		obj1.doSomething(pen);
		obj1.doSomething(pencil);
	}

}
