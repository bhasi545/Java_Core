package com.htc.day6;
class Number{
	static int divide(int a,int b){
		return a/b;
	}
}
public class NumberService {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("The value is "+Number.divide(6,2));
		}
		catch(ArithmeticException AE) {
			AE.printStackTrace();
		} 
		catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Further coming logics for business ");
	}
}
