package com.stream.assignment;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewsTest {

	public static void main(String[] args) {
		List<News> list = new ArrayList<News>();
		list.add(new News(100, "Sindhu", "Madhu", "budget Average"));
		list.add(new News(101, "Sreeja", "Harshita", "Good"));
		list.add(new News(102, "Madhu", "Sindhu", "Awesome"));
		list.add(new News(103, "Megha", "Megha", "good"));
		list.add(new News(104, "Vaishnavi", "Megha", "worst budget"));

		System.out.println("Number of times the word 'budget' repeated:");
		long count = list.stream()
				.filter(news -> news.comment.contains("budget")).count();
		System.out.println(count);

		System.out.println();
		
		System.out.println("Number of comments by commentByUser;");
		Map<String, Long> n = list
				.stream()
				.map(news -> news.commentByUser)
				.collect(
						Collectors.groupingBy(Function.identity(),
								Collectors.counting()));
		System.out.println(n);
	}

}
