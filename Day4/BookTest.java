package com.htc.day3;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javaprogrammingbook=new Book(101,"JavaPrgBook",25);
		System.out.println("Object is printed ");
		System.out.println(javaprogrammingbook);
		Book dbms=new Book(102,"DBMS",30);
		//System.out.println(javaprogrammingbook.equals(dbms));
		System.out.println(dbms.equals(dbms));
		
		

	}

}
