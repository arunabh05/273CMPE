package package1;

public class GradStudent implements StudentInterface {

	private int StudentId;
	private String name;
	private String major;
	private int marks;

	public GradStudent(int StudentId, String name, String major, int marks) {
		super();
		this.StudentId = StudentId;
		this.name = name;
		this.major = major;
		this.marks = marks;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public float getGPA(int marks) {
		// TODO Auto-generated method stub
	
		final float GradTotalCredits = 30;
		float creditsEarned = marks;
		System.out.println(creditsEarned);
		float GPA = creditsEarned/GradTotalCredits;
		System.out.println(GPA);
		return GPA;
	}
	

}
