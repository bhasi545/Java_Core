package com.htc.pakage3;

interface SpecialBankingServideProvider{	
	public void rechargeMobile();		
}

public abstract class BankingServiceProvider {
	
	public abstract void authenticateUser();
	
	public void checkBalanceinMobile() {		
	   System.out.println(" logics for sending balance as text message to the registered mobile number");
		
	} 	

}


class AxisBankServiceProvider extends BankingServiceProvider implements SpecialBankingServideProvider {
	
	@Override
	public void authenticateUser() {		
		System.out.println("Logics for authenticating using MPIN....");		
	}
	
	@Override
	public void rechargeMobile() {
		System.out.println("Logics for mobile recharge ");
	}
	
	
	
}

class IndianBankServiceProvider extends BankingServiceProvider{
	
	 @Override
     public void authenticateUser() {		
		System.out.println("Logics for authenticating using Retina Scan... ");		
	}
	
}

