package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IEmployeeServiceProvider {
	
	boolean  insertRecord(Employee emp) throws DuplicateEmployeeException, FileNotFoundException, ClassNotFoundException, SQLException, IOException;
    Employee readRecord(int empid) throws EmployeeNotFoundException, FileNotFoundException, ClassNotFoundException, SQLException, IOException;
    boolean  updateRecord(int empid, Double salary) throws EmployeeNotFoundException, FileNotFoundException, ClassNotFoundException, SQLException, IOException;
    boolean  deleteRecord(int empid) throws EmployeeNotFoundException, FileNotFoundException, ClassNotFoundException, SQLException, IOException;
   
}
