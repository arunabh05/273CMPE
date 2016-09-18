package package1;

public class ArraysGrades {

	void setGrades(Student[] stuArray) {
		// System.out.println(stuArray.length);
		for (int i = 0; i < stuArray.length; i++) {

			if (stuArray[i].getMarks() > 95) {
				stuArray[i].setGrade("A+");
			} else if ((stuArray[i].getMarks() >= 90) && (stuArray[i].getMarks() < 95)) {
				stuArray[i].setGrade("A");
			} else if ((stuArray[i].getMarks() >= 85) && (stuArray[i].getMarks() < 90)) {
				stuArray[i].setGrade("B+");
			} else if ((stuArray[i].getMarks() >= 80) && (stuArray[i].getMarks() < 85)) {
				stuArray[i].setGrade("B");
			} else if ((stuArray[i].getMarks() >= 75) && (stuArray[i].getMarks() < 80)) {
				stuArray[i].setGrade("C+");
			} else if ((stuArray[i].getMarks() >= 70) && (stuArray[i].getMarks() < 75)) {
				stuArray[i].setGrade("C");
			} else if ((stuArray[i].getMarks() >= 65) && (stuArray[i].getMarks() < 70)) {
				stuArray[i].setGrade("D+");
			} else if ((stuArray[i].getMarks() >= 60) && (stuArray[i].getMarks() < 65)) {
				stuArray[i].setGrade("D");
			} else {
				stuArray[i].setGrade("F");
			}
			System.out.println(stuArray[i].getName() + " scored :" + stuArray[i].getGrade());
		}

	}

	public static void main(String args[]) {

		ArraysGrades ag = new ArraysGrades();
		Student[] stuArray = new Student[8];
		Student stu1 = new Student(1, "ABC", 97);
		Student stu2 = new Student(2, "DEF", 94);
		Student stu3 = new Student(3, "GHI", 87);
		Student stu4 = new Student(4, "JKL", 84);
		Student stu5 = new Student(5, "MNO", 77);
		Student stu6 = new Student(6, "PQR", 74);
		Student stu7 = new Student(7, "STU", 67);
		Student stu8 = new Student(8, "VWX", 64);

		stuArray[0] = stu1;
		stuArray[1] = stu2;
		stuArray[2] = stu3;
		stuArray[3] = stu4;
		stuArray[4] = stu5;
		stuArray[5] = stu6;
		stuArray[6] = stu7;
		stuArray[7] = stu8;
		try {
			ag.setGrades(stuArray);
		} catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}
	}
}
