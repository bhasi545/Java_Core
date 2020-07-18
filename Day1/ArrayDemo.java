package com.htc.oops;
import java.util.*;
// program to check if all elements are same in an array
public class ArrayDemo {
	public static void main(String[] args)
	{
		int arr[]= new int[5];
		boolean mismatchflag=false;
		System.out.println("Enter the Elements");
		Scanner sc=new Scanner(System.in);
		//input phase 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int firstelement=arr[0];
		//business logic 
		for(int i=1;(i<=arr.length-1 && mismatchflag==false);i++)
		{
			System.out.println(firstelement+"<----->"+arr[i]);
			if(firstelement!=arr[i])
			{
				System.out.println("Mismatch detected at pass number "+i);
				mismatchflag=true;
				//break;			
			}
		}
		if(!mismatchflag)
			System.out.println(" All elements are same");
		else
			System.out.println("All elements are not same ");
	
	}
}
