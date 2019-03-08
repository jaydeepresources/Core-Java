package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add("four");

		System.out.println(list);

		list.add(2, 3.0f);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.remove(3.0f);
		System.out.println(list);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Jane");
		names.add("Julian");
		System.out.println(names);
		
		Iterator<String> iter = names.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}

}
