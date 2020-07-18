package com.htc.oops;
import java.util.*;

public class CompareArray {
	public static void main(String[] args){
		int k=0,m=0;
		int org[]=new int[5];
		int key[]=new int[5];
		int found[]=new int[5];
		int notfound[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the original Array");
		for(int i=0;i<org.length;i++)
		{
			org[i]=sc.nextInt();
		}
		System.out.println("Enter the Key Array");
		for(int j=0;j<key.length;j++)
		{
			key[j]=sc.nextInt();
		}
		for(int i=0;i<key.length;i++)
		{
			int flag=0;
			for(int j=0;j<org.length&&flag==0;j++)
			{
				if(key[i]==org[j])
				{
					flag=1;
				}				
			}
			if(flag==1)
			{
				
				found[k]=key[i];
				k++;				
			}
			else
			{
				notfound[m]=key[i];
				m++;
			}
		}
		System.out.println("Found Elements");
		for(int i=0;i<found.length;i++)
		{
			if(found[i]!=0)
			System.out.print(found[i]+" ");
		}
		System.out.println();
		System.out.println("Not Found Element");
		for(int j=0;j<notfound.length;j++)
		{
			if(notfound[j]!=0)
			System.out.print(notfound[j]+" ");
		}
		sc.close();
	}

}
