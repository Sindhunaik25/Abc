package com.stream.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TransactionTest {

	public static void main(String[] args) {
		
		List<Transaction> list = new ArrayList<Transaction>();
		
		Trader trader1 = new Trader("Sindhu", "Bangalore");
		Trader trader2 = new Trader("Soundarya", "Pune");
		Trader trader3 = new Trader("Megha", "Pune");
		Trader trader4 = new Trader("Sreeja", "Pune");
		Trader trader5 = new Trader("Vaishnavi", "Bangalore");
		Trader trader6 = new Trader("Aishwarya", "Delhi");
		
		list.add(new Transaction(trader1, 1996, 76));
		list.add(new Transaction(trader2, 2011, 67));
		list.add(new Transaction(trader3, 2011, 88));
		list.add(new Transaction(trader4, 2011, 79));
		list.add(new Transaction(trader5, 1996, 10));
		list.add(new Transaction(trader6, 1996, 81));
		
		System.out
				.println("All transactions values from the traders living in Delhi:");
		list.stream()
				.filter(transaction -> transaction.getTrader().getCity() == "Delhi")
				.map(transaction -> transaction.getTrader().getName() + ":"
						+ transaction.getTrader().getCity())
				.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("The highest value of all the transactions:");
		Transaction max = list.stream()
				.max(Comparator.comparing(Transaction::getValue)).get();
		System.out.println(max);
		
		System.out.println();
		
		System.out.println("The smallest value of all the transaction:");
		Transaction min = list.stream()
				.min(Comparator.comparing(Transaction::getValue)).get();
		System.out.println(min);
		
		System.out.println();
		
		System.out.println("The transaction with the smallest value");
		list.stream().filter(transaction->transaction.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.map(transaction->transaction.getYear()+":"+transaction.getValue())
		.forEach(System.out::println);
	}
}
