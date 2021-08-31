package com.abstractclass;

abstract class Person{
	public abstract void walk();
	public abstract void talk();
}

class Man extends Person{
	public void walk() {
		System.out.println("Walk Method");
	}
	public void talk() {
		System.out.println("Talk Method");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Man();
		obj.talk();
		obj.walk();
	}

}
