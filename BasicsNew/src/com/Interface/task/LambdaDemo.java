package com.Interface.task;

interface Abc {
	void show();
}

class Demo implements Abc{
	public void show() {
		System.out.println("Only one method: Single Abstract Method");
	}
}

//No need of Demo Class



public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = ()  -> System.out.println("Only one Method: Single Abstract method");
		obj.show();
	}

}
