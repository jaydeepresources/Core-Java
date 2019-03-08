package raw;

public class Exam {

	private Object code;

	public Object getCode() {
		return code;
	}

	public void setCode(Object code) {
		this.code = code;
	}

	public Exam(Object code) {
		this.code = code;
	}

	public void printExam() {
		System.out.println("Type of Exam Code= " + code.getClass().getSimpleName());
		System.out.println("Exam Code= " + code);
	}
}
