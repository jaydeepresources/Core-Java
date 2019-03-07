package serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee(1, "John Doe", 12345.6f);

		FileOutputStream fos = new FileOutputStream("/Users/jaydeep/Desktop/MLA Java/serial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("Serializing Employee");
		oos.writeObject(emp);
		System.out.println("Serializing Employee Complete");

	}

}
