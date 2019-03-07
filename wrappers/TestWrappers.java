package wrappers;

public class TestWrappers {

	public static void main(String[] args) {

		int i = 1;
		Integer j = new Integer(i);

		i = j.intValue();// unboxing
		i++;
		j = Integer.valueOf(i);// boxing
		
	}
}
