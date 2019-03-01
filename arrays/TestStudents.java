package arrays;

import java.util.Scanner;

public class TestStudents {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of students");

		Student[] students = new Student[scan.nextInt()];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println("Enter id");
			students[i].setId(scan.nextInt());
			System.out.println("Enter name");
			students[i].setName(scan.next());

			System.out.println("Enter number of exams");
			Exam[] exams = new Exam[scan.nextInt()];
			for (int j = 0; j < exams.length; j++) {
				exams[j] = new Exam();
				System.out.println("Enter exam name");
				exams[j].setExamName(scan.next());
				System.out.println("Enter exam max marks");
				exams[j].setMaxMarks(scan.nextInt());
				System.out.println("Enter exam obtained marks");
				exams[j].setObtMarks(scan.nextInt());
			}
			students[i].setExams(exams);
			students[i].setReportCard(new ReportCard());
			students[i].calculatePercentage();
		}

		for (Student student : students) {
			student.printStudent();
		}
	}
}
