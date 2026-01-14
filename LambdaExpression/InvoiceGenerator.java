package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
	String id;
	Invoice(String id) {
		this.id = id;
		System.out.println("Invoice created for Transaction: " + id);
	}
}

public class InvoiceGenerator {
	public static void main(String[] args) {
		List<String> transactionIDs = Arrays.asList("TXN1001", "TXN1002", "TXN1003");
		
		transactionIDs.stream()
			.map(Invoice::new)
			.collect(Collectors.toList());
	}
}