package arrays;

public class Exam {

	private String examName;
	private float maxMarks;
	private float obtMarks;

	public Exam() {

	}

	public Exam(String examName, float maxMarks, float obtMarks) {
		this.examName = examName;
		this.maxMarks = maxMarks;
		this.obtMarks = obtMarks;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public float getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(float maxMarks) {
		this.maxMarks = maxMarks;
	}

	public float getObtMarks() {
		return obtMarks;
	}

	public void setObtMarks(float obtMarks) {
		this.obtMarks = obtMarks;
	}

	public void printExam() {
		System.out.println("Exam Name= " + examName);
		System.out.println("Exam Max Marks= " + maxMarks);
		System.out.println("Exam Obt Marks= " + obtMarks);
	}
}
