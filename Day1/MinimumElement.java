package com.htc.oops;
import java.util.*;
// to find minimum elements in an array
public class MinimumElement {
	public static void main(String[] args){
	 
		int arr[]=new int[5];	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements");
		// input phase 
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++)
		{   
			System.out.println(smallest+"<----->"+arr[i]);
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		System.out.println("Minimum Element is : "+smallest);
		sc.close();
	}
}
