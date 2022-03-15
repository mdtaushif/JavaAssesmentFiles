
public class Student {
	String name;
	String department;

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return this.name;

	}
 
	public String getDepartment() {
		return this.department;
	}

	public Student(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public static void main(String[] args) {
	 Student student1=new Student("Taushif ahmed","Electrical and electronics");
	 System.out.println(student1.getName());
	 
	}
}
