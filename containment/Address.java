package containment;

public class Address {

	String state;
	String city;
	String pincode;
	String line;

	public Address() {

	}

	public Address(String state, String city, String pincode, String line) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.line = line;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public void printAddress() {
		System.out.println(line + ", " + city + ", " + state + ", " + pincode);
	}

}
