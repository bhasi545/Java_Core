package com.htc.day3;

import java.util.Scanner;
// wrong approcah for designing a class , DO NOT DESIGN CLASS LIKE THIS 
public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeDOB;
	private double employeeSalary;
	public void readInputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		System.out.println("employeeId--?");
		employeeId=sc.nextInt();
		System.out.println("employeeName--?");
		employeeName=sc.nextLine();
		System.out.println("DOB--?");
		employeeDOB=sc.nextLine();
		System.out.println("employeeSalary--?");
		employeeSalary=sc.nextInt();
		
	}
	public void display() {
		
		System.out.println(employeeId+"--"+employeeName+"---"+employeeDOB+"--"+employeeSalary);
		tryThis();// private method called  
			
	}
	
	private void tryThis() {
		System.out.println("I am a private methid ");
	}

}
