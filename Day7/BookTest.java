package com.htc.pakage3;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javaprogrammingbook;
		Book dbmsbook;
		try {
			javaprogrammingbook=new Book(101,"JavaPrgBook",-25);
		    //System.out.println("Object is printed ");
		    //System.out.println(javaprogrammingbook);
		    dbmsbook=new Book(102,"DBMS",30);
		    //System.out.println(javaprogrammingbook.equals(dbms));
		    //System.out.println(dbms.equals(dbms));
	     //	 Book sqlbook=new Book();

	     }
		 catch(InvalidPriceException IVP) {
			 System.out.println("Inside User defined exception block");
			 IVP.printStackTrace();
			 // option a:- log the exception message in an text file 
			 // option b:- i can log the exception  message in a xml file
			 // option c:- store the exception  message as a record in a table DB
			 // option d:- write the exception message in an excel file  
			 
			 System.out.println("..."+IVP.getErrorMessage());
			 // the client can handle the exception in the way he need 
		 }
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	}

}
