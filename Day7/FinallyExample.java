package com.htc.day6;

public class FinallyExample {

	public static void main(String[] args) {
    	// TODO Auto-generated method stub
		try {
			System.out.println(" I am opening a file ");
			System.out.println(" Do some business with file ");
			//int a= 5/0;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		 
		}
		finally {
			System.out.println("Closing the file ");	
		}

	}

}
