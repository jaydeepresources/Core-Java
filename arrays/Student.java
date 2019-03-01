package arrays;

public class Student {

	private int id;
	private String name;
	private ReportCard reportCard;
	private Exam[] exams;

	public Student() {

	}

	public Student(int id, String name, ReportCard reportCard, Exam[] exams) {
		this.id = id;
		this.name = name;
		this.reportCard = reportCard;
		this.exams = exams;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	public void calculatePercentage() {
		float totalMarks = 0.0f;
		float grandTotal = 0.0f;

		for (Exam exam : exams) {
			totalMarks += exam.getMaxMarks();
			grandTotal += exam.getObtMarks();
		}

		reportCard.setPer(grandTotal / totalMarks * 100.0f);
		reportCard.calculateGrade();
	}

	public void printStudent() {
		System.out.println("Student Id= " + id);
		System.out.println("Student Name= " + name);
		reportCard.printReportCard();
		for (Exam exam : exams) {
			exam.printExam();
		}
	}
}
