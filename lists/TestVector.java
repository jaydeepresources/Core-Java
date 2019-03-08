package lists;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.addElement("John");
		v.addElement("Jane");
		v.addElement("Julian");

		System.out.println(v);

		for (String name : v) {
			System.out.println(name);
		}
	}

}
