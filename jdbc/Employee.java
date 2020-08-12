package jdbc;

public class Employee {
	
	private int empId;
	private String emptName;
	private double salary;
	public Employee(int empId, String emptName, double salary) {
		super();
		this.empId = empId;
		this.emptName = emptName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmptName() {
		return emptName;
	}
	public void setEmptName(String emptName) {
		this.emptName = emptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " \n Employee [empId=" + empId + ", emptName=" + emptName + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	

}
