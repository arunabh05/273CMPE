package package1;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class TestMultithreading extends TestCase {

	@Test
	public void testInterface() {
		Student stu1 = new Student(1, "ABC", 97);
		Student stu2 = new Student(2, "DEF", 94);
		Student stu3 = new Student(3, "GHI", 87);
		Student stu4 = new Student(4, "JKL", 84);

		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu4);

		Thread t1 = new Thread() {

			public void run() {

				for (Student s : stuList) {
					System.out.println("Name of Student " + s.getStudentId() + " : " + s.getName());
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {

				for (Student s : stuList) {
					System.out.println("Marks of Student " + s.getStudentId() + " : " + s.getMarks());
				}
			}
		};
		t1.start();
		t2.start();
	}
}