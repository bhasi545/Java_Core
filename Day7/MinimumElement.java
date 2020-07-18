package com.htc.oops;
import java.util.*;
// to find minimum elements in an array
public class MinimumElement {
	public static void main(String[] args){
	 
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements");
		int smallest=0;
		// input phase 
		try {
			int arr[]=new int[-5];	
	    	for(int i=0;i<arr.length;i++)
		    	arr[i]=sc.nextInt();
		     smallest=arr[-5];// throwing exception 
		     System.out.println("Will this statement execute ?");
         	 for(int i=1;i<arr.length;i++)
		     {   
			    System.out.println(smallest+"<----->"+arr[i]);
			    if(smallest>arr[i])
		    		smallest=arr[i];		
		     }
		}
		catch(ArrayIndexOutOfBoundsException AIB) {
			System.out.println("Inside Aritmetic exception catch block");
			AIB.printStackTrace();
		}
		catch(NegativeArraySizeException NAE) {
			System.out.println("Inside NegativeArraySizeException block ");
			NAE.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Inside Exception block");
			ex.printStackTrace();
		}
		
		System.out.println("Minimum Element is : "+smallest);
		System.out.println("Further logics if any ");
		sc.close();
	}
}
