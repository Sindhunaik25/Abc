package com.stream.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TraderTest {

	public static void main(String[] args) {
		List<Trader> list = new ArrayList<Trader>();
		list.add(new Trader("dfeg", "Bangalore"));
		list.add(new Trader("Soundarya", "Pune"));
		list.add(new Trader("Megha", "Pune"));
		list.add(new Trader("Sreeja", "Pune"));
		list.add(new Trader("Vaishnavi", "Bangalore"));
		list.add(new Trader("Aishwarya", "Bangalore"));

		System.out.println("The unique cities where traders work:");
		list.stream().map(transaction -> transaction.getCity()).distinct()
				.forEach(System.out::println);

		System.out.println();

		System.out.println("The traders working in Pune");
		list.stream().filter(name -> name.getCity() == "Pune")
				.sorted(Comparator.comparing(Trader::getName))
				.map(name -> name.getName() + ":" + name.getCity())
				.forEach(System.out::println);

		System.out.println();

		System.out.println("Alphabetical sorting of the names:");
		list.stream().sorted(Comparator.comparing(Trader::getName))
				.map(name -> name.getName() + ":" + name.getCity())
				.forEach(System.out::println);

		System.out.println();
		
		System.out.println("The traders based in Indore:");
		boolean indore = list.stream().anyMatch(
				transaction -> transaction.getCity().equals("Indore"));
		System.out.println(indore);
	}

}
