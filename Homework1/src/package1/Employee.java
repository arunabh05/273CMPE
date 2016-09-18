package package1;

public class Employee {

	private int empId;
	private String name;
	private int age;
	private String project;
	private int year;

	public Employee() {
		super();
	}

	public Employee(int empId, String name, int age, String project, int year) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.project = project;
		this.year = year;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
