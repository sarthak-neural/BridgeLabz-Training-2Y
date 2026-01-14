package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("piyush", "riya", "amit");
		
		List<String> upperNames = names.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		
		upperNames.forEach(System.out::println);
	}
}