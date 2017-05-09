package package1;

import java.util.Set;
import java.util.TreeSet;

public class GenericsExample {

	public <E> void printData(Set<E> stuDetails) {

		for (E i : stuDetails) {
			if(i.getClass().toString().equals("class java.lang.Integer") )
			{
			System.out.println("Student Marks: " + i);
			}
			if(i.getClass().toString().equals("class java.lang.String"))
			{
			System.out.println("Student Name: " + i);
			}
		}
	}

	public static void main(String args[]) {
		Set<Integer> stuMarks = new TreeSet<>();

		stuMarks.add(78);
		stuMarks.add(51);
		stuMarks.add(97);
		stuMarks.add(28);
		stuMarks.add(85);
		stuMarks.add(44);

		Set<String> stuName = new TreeSet<>();

		stuName.add("Abhay");
		stuName.add("Bob");
		stuName.add("Carl");
		stuName.add("Dinesh");
		stuName.add("Edd");
		stuName.add("Finn");

		GenericsExample ge = new GenericsExample();
		 ge.printData(stuMarks);
		ge.printData(stuName);
	}

}
