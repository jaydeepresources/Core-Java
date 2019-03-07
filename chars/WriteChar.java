package chars;

import java.io.FileWriter;
import java.io.IOException;

public class WriteChar {

	public static void main(String[] args) throws IOException {
		String data = "Java can reduce costs, drive innovation, and improve application services as the programming language of choice for IoT, enterprise architecture, and cloud computing..";

		FileWriter fw = new FileWriter("/Users/jaydeep/Desktop/MLA Java/new_file.txt");

		System.out.println("Writing Data");

		fw.write(data);

		System.out.println("Writing Data Complete");
		fw.close();

	}

}
