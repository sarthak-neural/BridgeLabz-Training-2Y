package LambdaExpression;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
	public static void main(String[] args) {
		
		List<String> alerts = Arrays.asList("Emergency", "Normal Checkup", "Critical", "Routine");
		
		Predicate<String> criticalOnly = alert -> alert.equalsIgnoreCase("Critical") || alert.equalsIgnoreCase("Emergency");
		
		System.out.println("Important Alerts:");
		alerts.stream().filter(criticalOnly).forEach(System.out::println);
	}
}