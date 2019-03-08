package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestMaps {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "John");
		hm.put(12, "Jane");
		hm.put(9, "Mike");
		hm.put(14, "Mary");
		hm.put(10, "Brad");
		hm.put(18, "Tom");
		hm.put(16, "Pierce");
		hm.put(27, "Chris");
		hm.put(35, "Roy");
		hm.put(43, "John");

		System.out.println(hm);

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(1, "John");
		lhm.put(12, "Jane");
		lhm.put(9, "Mike");
		lhm.put(14, "Mary");
		lhm.put(10, "Brad");
		lhm.put(18, "Tom");
		lhm.put(16, "Pierce");
		lhm.put(27, "Chris");
		lhm.put(35, "Roy");
		lhm.put(43, "John");

		System.out.println(lhm);

		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(1, "John");
		tm.put(12, "Jane");
		tm.put(9, "Mike");
		tm.put(14, "Mary");
		tm.put(10, "Brad");
		tm.put(18, "Tom");
		tm.put(16, "Pierce");
		tm.put(27, "Chris");
		tm.put(35, "Roy");
		tm.put(43, "John");

		System.out.println(tm);
	}
}
