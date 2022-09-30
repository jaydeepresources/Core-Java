package strings;

public class TestStrings {

	public static void main(String[] args) {

		// Different ways of String Creation

		String s1 = "abc";
		String s2 = new String("abc");

		String s3 = "";
		String s4 = new String();
		String s5 = new String("");

		// s6 is null
		String s6;

		String a = "abc";
		a = a.concat("xyz");
		System.out.println(a);

	}

}
