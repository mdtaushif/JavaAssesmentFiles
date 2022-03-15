
public class Employee {
	String FirstName;
	String LastName;
	double Salary;

	public Employee(String FirstName, String LastName, double Salary) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Salary = Salary;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public double getSalary() {
		return Salary;
	}
}
