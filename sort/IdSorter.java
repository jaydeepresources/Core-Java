package sort;

import java.util.Comparator;

public class IdSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("Comparator");
		if (o1.id < o2.id)
			return -1;
		else if (o1.id > o2.id)
			return 1;
		return 0;
	}

}
