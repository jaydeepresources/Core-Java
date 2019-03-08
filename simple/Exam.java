package simple;

public class Exam<T> {

	private T code;

	public T getCode() {
		return code;
	}

	public void setCode(T code) {
		this.code = code;
	}

	public Exam(T code) {
		this.code = code;
	}

	public void printExam() {
		System.out.println("Type of Exam Code= " + code.getClass().getSimpleName());
		System.out.println("Exam Code= " + code);
	}
}

