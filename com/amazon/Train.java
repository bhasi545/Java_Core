package com.amazon;

class Train {
    
    public static String longestConsec(String[] strarr, int k) {
	
    	if(strarr.length == 0 || strarr.length < k || k <=0  )
    	{
    		return "";
    	}
    	
    	int highlen=0; int coordinate=0;int l=0;
    	for(int i=0; i<strarr.length ;i++)
    	{
    		int length=0;l=0;
    		for(int j=i ;l<k ;l++)
    			length = length + strarr[j].length();
    		
    		if(highlen < length )
    		{
    			highlen = length;
    			coordinate = i;
    			
    		}
    		
    	}
    	
    	System.out.println("Cor   " + coordinate);
    	
    	return null;
        
    }
    
    public static void main(String[] args) {
    	
    	String[] str = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
		
    	longestConsec(str, 2);
	}
}