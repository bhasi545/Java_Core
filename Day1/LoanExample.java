package com.htc.oops;
import java.util.*;
// Program to process loan amount 
public class LoanExample {
	public static void main(String[] args){
		/*.......................................
		 * input phase 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		System.out.println("Job Type(Permanent/Temporary)");
	    String 	job=sc.nextLine();
		System.out.println("Status(Married/Unmarried)");
		String status=sc.nextLine();
		System.out.println("Experience");
		Integer exp=sc.nextInt();	
		/*.................................
		 * business logic and op phase
		 */
		if(job.equals("Permanent"))		
		    if(status.equals("Married"))		
		        if(exp>=30)		        
		         System.out.println("Loan Amount is : 60,000 Rs");				
				else				
					System.out.println("Loan Amount is : 35,000 Rs");	
			
			else			
				if(exp>=30)				
					System.out.println("Loan Amount is : 50,000");				
				else				
					System.out.println("LoaN amount is : 25,000");
				
		else {
			System.out.println("Loan Amount is : 10,000");
		    System.out.println("My second statement ");
		}
		
		 sc.close();
	}

}
