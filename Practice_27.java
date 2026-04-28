package com.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Practice_27 {
	public static void main(String[] args) {
		// 🔹 1.

//Given a list of integers, print all elements using Stream API.
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(10);
		list.add(78);
		list.add(93);
		list.add(19);
		list.add(89);
		list.stream().forEach(i -> System.out.print(i + " "));
		System.out.println();
		// Print only even numbers from a list using filter().
		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		System.out.println();
		// Print numbers greater than 50 using Stream.
		list.stream().filter(i -> i > 50).forEach(System.out::println);
		System.out.println();
		// Multiply each element by 2 using map() and print the result.
		list.stream().map(i -> i * 2).forEach(System.out::println);
		// Convert a list of strings to uppercase using map().
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("madam");
		list2.add("java");
		list2.add("aba");
		list2.add("code");
		list2.stream().map(i -> i.toUpperCase()).forEach(System.out::println);
		System.out.println();
		// Sort a list of integers using sorted().
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		// From a list of integers, print only odd numbers and then multiply them by 3.
		list.stream().filter(i -> i % 2 == 1).map(i -> i * 3).forEach(System.out::println);
		System.out.println();
		// Count how many elements are greater than 10 using Stream.
		list.stream().filter(i -> i > 10).forEach(System.out::println);
		System.out.println();
		// Find the maximum number in a list using Stream.
		int c = list.stream().max((a, b) -> Integer.compareUnsigned(a, b)).get();
		System.out.println(c);
		// From a list of strings, print only those starting with letter 'A'.
		list2.stream().filter(i -> i.startsWith("a")).forEach(System.out::println);

	}
}
