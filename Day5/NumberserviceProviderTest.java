package com.htc.pakage3;


class NumberserviceProvider{

	private int y;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	 //setters and getters for y
	  static void add(int a,int b){
		System.out.println("static method is called ");
	    System.out.println(a+b);
	  }
	  void sum(int x){
		System.out.println("non static method is called ");
	    System.out.println(x+y);
	  }
	}


public class NumberserviceProviderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class name.static method name 
		NumberserviceProvider.add(5, 10);
		NumberserviceProvider nsobj = new NumberserviceProvider();
		nsobj.setY(10);
		nsobj.sum(50);
		

	}

}
