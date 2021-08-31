package com.encapsulation;

//Encapsulation means binding data with methods.
//To avoid direct handling of variables so we can keep it as private.



class Student{
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setRollNo(6);
		obj.setName("Onkar");
		System.out.println("RollNo:" +obj.getRollNo());
		System.out.println("Name: "+ obj.getName());
	}
}
