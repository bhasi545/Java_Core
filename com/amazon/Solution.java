package com.amazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Solution
{
 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 List<List<Integer>> optimalUtilization(int deviceCapacity, 
                         List<List<Integer>> foregroundAppList,
                         List<List<Integer>> backgroundAppList)
{
	
	 List<List<Integer>> temp = new ArrayList<List<Integer>>();
	 List<Integer> addtemp = new ArrayList<Integer>();
	 
	 Iterator foregrounditerator = foregroundAppList.iterator();
	 Iterator backgrounditerator = backgroundAppList.iterator();
	 
	 
	 for (int k = 0; k < foregroundAppList.size(); k++)
	 {
		 List<Integer> listelement = foregroundAppList.get(k);
		 
		 for (int i = 0; i < listelement.size(); i++) {
			 if(i%2==1)
			 {
				 for (int l = 0; l < backgroundAppList.size(); l++)
				 {	 
					 List<Integer> backlistelement = backgroundAppList.get(l);
					 
					 for (int j = 0; j < backlistelement.size(); j++) {
						 if(j%2==1)
						 {
							 int total = listelement.get(i) + backlistelement.get(j);
							 if(total <= deviceCapacity)
							 {
								 addtemp.addAll(backgroundAppList.get(j-1));
								 addtemp.addAll(backgroundAppList.get(k-1));
							 }
						 }
				 }		 
			  }
				 
			 }
		 }
		 		 
	 }
	return temp;
	 
		 
}	

	 


 // METHOD SIGNATURE ENDS
}