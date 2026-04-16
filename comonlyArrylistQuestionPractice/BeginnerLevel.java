package comonlyArrylistQuestionPractice;

import java.util.ArrayList;

public class BeginnerLevel {
	public static void main(String[] args) {
		//beginner level
		// Create an ArrayList of integers and print all elements.
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(8);
		list.add(10);
		list.add(67);
		list.add(89);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		// Add 5 names into an ArrayList and display them.
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Payal");
		list1.add("Neha");
		list1.add("Shital");
		list1.add("Saniya");
		list1.add("Vaishnavi");
		System.out.println();
		for (String string : list1) {
			System.out.print(string + " ");
		}
		System.out.println();
		// Find size of an ArrayList.
		int size = list1.size();
		System.out.println("Size of list1 =" + size);
		// Add elements at a specific index.

		list1.add(3, "Samay");
		for (String string : list1) {
			System.out.print(string + " ");
		}
		System.out.println();
		// Remove an element by value.
		list1.remove(0);
		for (String string : list1) {
			System.out.print(string + " ");
		}
		System.out.println();
		// Check if an element exists in ArrayList.
		String check = "Vaishnavi";
		for (String string : list1) {
			if (string.equals(check)) {
				System.out.println("element exist");
				break;
			}
		}
		// Get element at a particular index.
		System.out.print(list1.get(3));
		System.out.println(" ");
		System.out.println("------");

		// Replace an element in ArrayList.
		list1.set(4, "Shubham");
		for (String string : list1) {
			System.out.println(string);
		}
		System.out.println("-----");
		// Clear all elements from ArrayList.
		list1.removeAll(list1);
		for (String string : list1) {
			System.out.print(string);
		}
	}
}
