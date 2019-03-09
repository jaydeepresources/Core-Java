package joiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class TestStringJoiner {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(",", "(", ")");
		sj.add("John").add("Mary").add("Roy");
		String joinedNames = sj.toString();
		System.out.println(joinedNames);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		String commaSeparatedNumbers = numbers.stream().map(i -> i.toString()).collect(Collectors.joining(", "));
		System.out.println(commaSeparatedNumbers);

	}

}
