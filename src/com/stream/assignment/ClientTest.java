package com.stream.assignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ClientTest {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("Apple", 350, 110, "Red"));
		list.add(new Fruit("Watermelon", 159, 60, "Green"));
		list.add(new Fruit("Grapes", 10, 80, "Light Green"));
		list.add(new Fruit("Kiwi", 59, 250, "Green"));
		list.add(new Fruit("Mango", 229, 150, "Yellow"));
		list.add(new Fruit("Cherry", 350, 10, "Red"));
		
		System.out.println("Sorted based on the calory:");
		list.stream().filter(fruit -> fruit.getCalory() < 100)
				.sorted(Comparator.comparing(Fruit::getName).reversed())
				.forEach(System.out::println);

		System.out.println();

		System.out.println("Sorted based on the Colors:");
		list.stream().sorted(Comparator.comparing(Fruit::getColor))
				.map(color -> color.getName() + ":" + color.getColor())
				.forEach(System.out::println);

		System.out.println();

		System.out.println("Sorted based on the red color");
		list.stream()
				.filter(color -> color.getColor() == "Red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(color -> color.getName() + ":" + color.getColor() + ":"
						+ color.getPrice()).forEach(System.out::println);

	}
}
