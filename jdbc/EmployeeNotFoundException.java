package jdbc;

public class EmployeeNotFoundException extends Exception {
	
	String errorMsg;

	public EmployeeNotFoundException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
	
	

}
