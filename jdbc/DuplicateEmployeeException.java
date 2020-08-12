package jdbc;

public class DuplicateEmployeeException extends Exception {
	

	String errorMsg;

	public DuplicateEmployeeException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

}
