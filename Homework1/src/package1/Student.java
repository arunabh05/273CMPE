package package1;

public class Student {

	private int studentId;
	private String name;
	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	private int marks;
	private String grade;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
