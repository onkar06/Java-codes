package com.abstractclass;

//Without Abstract class
class Numb{
	public void show(Integer i) {
		System.out.println(i);
	}
	public void show(Double i) {
		System.out.println(i);
	}
}

// Here we required two functions to print Integer and Double. We haven't used int and double.

//Now With abstract class

class NumbWithAbstract{
	public void show(Number i) {
		System.out.println(i);
	}
}
//Here we have used Number which is abstract class of Integer,Float,Double....
//Only one function required

public class WhyAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numb obj = new Numb();
		obj.show(4);
		obj.show(5.4);
		
		System.out.println("Now with Abstract class");
		
		NumbWithAbstract obj1 = new NumbWithAbstract();
		obj1.show(3);
		obj1.show(3.55);

	}

}
