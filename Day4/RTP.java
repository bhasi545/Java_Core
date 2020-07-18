package com.htc.day3;

class BankServiceProvider{
	public void processLoan() {
		System.out.println("Logis for processing Loan");
	}
}

class AxisBank extends BankServiceProvider{
	@Override
	public void processLoan() {
		System.out.println("Axis bank logics for preparing loan");
	}
}

class HDFCBank extends BankServiceProvider{
	@Override
	public void processLoan() {
		System.out.println("HDFC bank logics for preparing loan");
	}
}

class IndianBank extends BankServiceProvider{
     @Override
	public void processLoan() {
		System.out.println("Indian bank logics for preparing loan ");
	}
}




public class RTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Run time polymorphism 
		//Axisbank ab = new Axisbank();
		BankServiceProvider bsp= new AxisBank();
		bsp.processLoan();
		bsp=new IndianBank();
		bsp.processLoan();
		
		/*final double pie=3.14;
		pie=pie+1;*/
		
		

	}

}
