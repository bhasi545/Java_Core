package com.htc.pakage3;

// sample programs with static methods , remove the output phase in  StringServiceProvider
class StringServiceProvider {
	
	public static boolean findKeyinString(String str,char key){
		boolean flag=false;
		char[] str1=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(key==str1[i]){
				flag=true;
				System.out.println("Found");
				break;				
			}
		}
		if(!flag){
			System.out.println("Not found");
		}
		return flag;
	}
	
	public static char findCharecterAtPosition(String str,int postion){
		char str1=str.charAt(postion);
		System.out.println("Character at"+postion+"position is:"+str1);
		return str1;
		
	}
	public static String subString(String str,int startPosition,int endPosition){
		char[] str1=str.toCharArray();
		char[] subString=new char[10];
		int j=0;
		for(int i=startPosition;i<=endPosition;i++){
			subString[j]=str1[i];
			j++;
		}
		System.out.println(subString);
		return null;
		
	}
}

public class StringExample {
	public static void main(String args[]){
		String str="Walking thru the life is not so hard ";
		StringServiceProvider.findKeyinString(str, 'z');
		StringServiceProvider.findCharecterAtPosition(str, 0);
		StringServiceProvider.findCharecterAtPosition(str, 5);		
		StringServiceProvider.subString(str, 3, 8);
	}

}
