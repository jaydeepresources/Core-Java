package containment;

public class Certificate {

	String name;
	String issuerName;
	String grade;

	public Certificate() {

	}

	public Certificate(String name, String issuerName, String grade) {
		this.name = name;
		this.issuerName = issuerName;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void printCertificate() {
		System.out.println("Certificate Name= " + name);
		System.out.println("Issuer Name= " + issuerName);
		System.out.println("Certificate Grade= " + grade);
	}

}
