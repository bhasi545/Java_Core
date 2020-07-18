package com.htc.day3;

class Parent{
	public void parentMethod() {
		System.out.println("Parent method ");
	}	
}

class Child extends Parent{
	public void childMethod() {
		System.out.println("Child method");
	}
}

public class InhertanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child=new Child();
		child.parentMethod();

	}

}
