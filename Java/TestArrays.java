package package1;

import org.junit.Test;

import junit.framework.TestCase;

public class TestArrays extends TestCase {

	@Test
	public void testArrays() {
		ArraysGrades ag = new ArraysGrades();
		Student[] stuArray = new Student[3];
		Student stu1 = new Student(1, "ABC", 97);
		Student stu2 = new Student(2, "DEF", 94);
		Student stu3 = new Student(3, "GHI", 87);

		stuArray[0] = stu1;
		stuArray[1] = stu2;
		stuArray[2] = stu3;

		try {
			ag.setGrades(stuArray);
		} catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}
	}
}
