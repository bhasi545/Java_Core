package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class HTCGlobalServices implements IEmployeeServiceProvider {

	UserDAO user;
	
	
	public HTCGlobalServices(UserDAO user) {
		super();
		this.user = user;
	}

	@Override
	public boolean insertRecord(Employee emp) throws DuplicateEmployeeException, FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		
		boolean result=false;
		CallableStatement statement = user.getConnection().prepareCall("{call insert_emp(?,?,?)}");
		statement.setInt(1, emp.getEmpId());
		statement.setString(2, emp.getEmptName());
		statement.setDouble(3, emp.getSalary());
		
		int insertCount = statement.executeUpdate();
		if(insertCount == 0)		
				result = true;
		else
				throw new DuplicateEmployeeException("Dupilcate Employee Insertion Not Allowed ");
		return result;
	}

	@Override
	public Employee readRecord(int empid) throws EmployeeNotFoundException, FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		
		boolean result=false;
		Employee e;
		CallableStatement  statement = user.getConnection().prepareCall("{ call emprecord(?) } ");
		statement.setInt(1, empid);
		ResultSet rs = statement.executeQuery();
		if(rs.next())		
		{	
			return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
		}
		else
				throw new EmployeeNotFoundException("Employee Not Found ");
		
	}

	@Override
	public boolean updateRecord(int empid, Double salary) throws EmployeeNotFoundException, FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		
		boolean result=false;
		Employee e;
		CallableStatement statement = user.getConnection().prepareCall( "{ call updateemp(?,?) } ");
		statement.setInt(1, empid);
		statement.setDouble(2, salary);
		boolean count = statement.execute();
		if(count)		
		{	
			return true;
		}
		else
				throw new EmployeeNotFoundException("Employee Not Found ");
		
	}

	@Override
	public boolean deleteRecord(int empid) throws EmployeeNotFoundException, FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		
		boolean result=false;
		Employee e;
		CallableStatement statement = user.getConnection().prepareCall( "{ call deleteemp(?) } ");
		statement.setInt(1, empid);
		boolean count = statement.execute();
		if(count)		
		{	
			return true;
		}
		else
				throw new EmployeeNotFoundException("Employee Not Found ");

	}

}
