package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TestSort {

	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<>();

		ts.add(new Employee(1, "John", 12345.6f));
		ts.add(new Employee(3, "Mary", 23423.2f));
		ts.add(new Employee(2, "Robert", 16344.7f));

		System.out.println(ts);

		ArrayList<Employee> list1 = new ArrayList<>();

		list1.add(new Employee(1, "John", 12345.6f));
		list1.add(new Employee(3, "Mary", 23423.2f));
		list1.add(new Employee(2, "Robert", 16344.7f));

		Collections.sort(list1);
		System.out.println(list1);

		ArrayList<Employee> list2 = new ArrayList<>();

		list2.add(new Employee(1, "John", 12345.6f));
		list2.add(new Employee(3, "Mary", 23423.2f));
		list2.add(new Employee(2, "Robert", 36344.7f));

		Collections.sort(list2, new IdSorter());
		System.out.println(list2);

		Collections.sort(list2, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				System.out.println("Anonymous Comparator");
				if (o1.salary < o2.salary)
					return -1;
				else if (o1.salary > o2.salary)
					return 1;
				return 0;
			}
		});
		System.out.println(list2);
	}
}
