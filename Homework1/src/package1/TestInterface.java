package package1;

import org.junit.Test;

import junit.framework.TestCase;

public class TestInterface extends TestCase {

	GradStudent gs1 = new GradStudent(1, "Rajesh", "CS", 115);
	GradStudent gs2 = new GradStudent(2, "Rohit", "CE", 106);
	UnderGradStudent ugs1 = new UnderGradStudent(11, "John", "CS", 444);
	UnderGradStudent ugs2 = new UnderGradStudent(12, "Mike", "CE", 380);

	@Test
	public void testInterface() {

		System.out.println(gs1.getStudentId() + " -->" + gs1.getName() + " -->" + gs1.getGPA(gs1.getMarks()));
		System.out.println(gs2.getStudentId() + " -->" + gs2.getName() + " -->" + gs2.getGPA(gs2.getMarks()));

		System.out.println(ugs1.getStudentId() + " -->" + ugs1.getName() + " -->" + ugs1.getGPA(ugs1.getMarks()));
		System.out.println(ugs2.getStudentId() + " -->" + ugs2.getName() + " -->" + ugs2.getGPA(ugs2.getMarks()));

	
	
	
	
	}
}
