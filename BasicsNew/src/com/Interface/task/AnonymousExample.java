package com.Interface.task;

interface Comp{
	void show();
	/*public void notAllowed() {
		Not allowed to define method in interface
	}
	*/
}


class Scale implements Comp{
	public void show() {
		System.out.println("I'm a Scale");
	}
}


public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comp obj = new Scale() 
		{
			public void show()
			{
				System.out.println("If we want different content");
			}
		};
		obj.show();

	}

}
