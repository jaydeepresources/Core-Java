package bytes;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("/Users/jaydeep/Desktop/MLA Java/file.txt");
		System.out.println("Opening File");
		int ch = 0;
		while ((ch = fis.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fis.close();

	}

}
