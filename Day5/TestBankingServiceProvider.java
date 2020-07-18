package com.htc.pakage3;

public class TestBankingServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankingServiceProvider bsp = new AxisBankServiceProvider();		
		//bsp.authenticateUser();
		//bsp=new IndianBankServiceProvider();
		//bsp.authenticateUser();
		//bsp.checkBalanceinMobile();
		AxisBankServiceProvider abs = new AxisBankServiceProvider();
		abs.rechargeMobile();

	}

}
