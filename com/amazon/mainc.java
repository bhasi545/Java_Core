package com.amazon;

import java.util.ArrayList;
import java.util.List;

public class mainc {
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		List<List<Integer>> temp = new ArrayList<List<Integer>>();
		List<Integer> addtemp = new ArrayList<Integer>();
		addtemp.add(1);addtemp.add(2);
		List<Integer> addtemp1 = new ArrayList<Integer>();
		addtemp1.add(2);addtemp1.add(4);
		List<Integer> addtemp2 = new ArrayList<Integer>();
		addtemp2.add(3);addtemp2.add(6);
		temp.add(addtemp);temp.add(addtemp1);temp.add(addtemp2);
		
		//System.out.println(temp);
		
		List<List<Integer>> backtemp = new ArrayList<List<Integer>>();
		List<Integer> backaddtemp = new ArrayList<Integer>();
		backaddtemp.add(1);backaddtemp.add(2);
		
		
		backtemp.add(backaddtemp);
		
		//System.out.println(backaddtemp);
		
		s.optimalUtilization(7,temp,backtemp); 
		
		/*List<Integer> w = new ArrayList<Integer>();
	      List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();//Use Arraylist inside
	      for(int i=1;i<10; i++){
	          w.add(i);
	          a.add(new ArrayList(w));
	      }

	      System.out.println(w);
	      System.out.println(a);*/
		
	}

}
