
public class EmployeeTest {
	public static void HikeCalculator(double NormalSalary) {
		double HikedSalary;
		HikedSalary = NormalSalary * 1.1;
		System.out.println(HikedSalary);
	}

	public static void empDetails(Employee emp_temp) {
		System.out.println("First name: " + emp_temp.FirstName);
		System.out.println("Last name: " + emp_temp.LastName);
		System.out.println("Salary before hike: " + emp_temp.Salary);
		System.out.print("hiked salary: ");
		HikeCalculator(emp_temp.Salary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("rida", "oosman", 40000);
		Employee emp2 = new Employee("rafia", "fatima", 35000);
		System.out.println("employee datails");
		System.out.println("employee 1");
		empDetails(emp1);
		System.out.println("employee2");
		empDetails(emp2);

	}
}
