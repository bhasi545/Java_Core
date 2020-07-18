package com.htc.pakage3;
// User defined exception class 
public class InvalidPriceException extends Exception {
	private String errorMessage;
	
	public InvalidPriceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	 
}
