package LambdaExpression;

import java.util.*;

class Product {
	String name;
	double price;
	double rating;
	
	Product(String name, double price, double rating) {
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
}

public class ECommerceSorting {
	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
			new Product("Shoes", 2000, 4.5),
			new Product("Watch", 1500, 4.2),
			new Product("Bag", 1000, 4.8)
		);
		
		System.out.println("Sort by Price:");
		products.sort((a, b) -> Double.compare(a.price, b.price));
		products.forEach(p -> System.out.println(p.name + " - ₹" + p.price));
		
		System.out.println("\nSort by Rating:");
		products.sort((a, b) -> Double.compare(b.rating, a.rating));
		products.forEach(p -> System.out.println(p.name + " - ⭐" + p.rating));
	}
}