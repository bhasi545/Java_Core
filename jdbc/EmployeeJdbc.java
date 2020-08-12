package jdbc;

public class EmployeeJdbc {

	public static void main(String[] args) {
		UserDAO user = new UserDAO();
		Employee emp = new Employee(1003,"Deeps",60000.00);
		HTCGlobalServices htc = new HTCGlobalServices(user);
		
		System.out.println("Adding Employee Records ***********************");
		try {
			
			if (htc.insertRecord(emp) == true)
				System.out.println("Employee Sucessfully Inserted ");
		}catch(DuplicateEmployeeException e) {
			 System.out.println(e.getErrorMsg()); 
		}catch(Exception e) {
			 e.printStackTrace(); 
		}
		
		System.out.println("Reading Employee Records ***********************");
		
		try {
				System.out.println(" Employee Details are ***********************" );
				System.out.println(htc.readRecord(1003)); 
		}catch(EmployeeNotFoundException e) {
			 System.out.println(e.getErrorMsg()); 
		}catch(Exception e) {
			 e.printStackTrace(); 
		}
		
		System.out.println("Updating Employee Records ***********************");
		try {
			System.out.println(" Employee Details are  Before Update  "  + htc.readRecord(1002));
			htc.updateRecord(1002, 78888.77);
			System.out.println(" Employee Details are  Before Update  "  + htc.readRecord(1002));
			}catch(EmployeeNotFoundException e) {
		 System.out.println(e.getErrorMsg()); 
			}catch(Exception e) {
		 e.printStackTrace(); 
			}
		
		System.out.println("deleting Employee Record ");
		try {
			System.out.println(" Employee Details are  Before delete  "  + htc.readRecord(1003));
			htc.deleteRecord(1003);
			System.out.println(" Employee Details are  Before Update  "  + htc.readRecord(1003));
			}catch(EmployeeNotFoundException e) {
		 System.out.println(e.getErrorMsg()); 
			}catch(Exception e) {
		 e.printStackTrace(); 
			}
		

	}

}
