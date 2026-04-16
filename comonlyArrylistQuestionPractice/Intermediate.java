package comonlyArrylistQuestionPractice;

//Find the largest number in ArrayList.
//Find the smallest number in ArrayList.
//Count frequency of a number in ArrayList.
//Remove duplicate elements using Set.
//Reverse an ArrayList.
//Sort ArrayList in ascending order.
//Sort ArrayList in descending order.
//Find second largest element.
//Find second smallest element.
//Merge two ArrayLists.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intermediate {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(10);
		list.add(78);
		list.add(93);
		list.add(19);
		list.add(89);
		// Find the largest number in ArrayList.
		int largest = list.get(0);
		for (Integer integer : list) {
			if (integer > largest) {
				largest = integer;

			}
		}
		System.out.println("Largest number in list =" + largest);
		// Find the smallest number in ArrayList.
		int smallest = list.get(0);
		for (Integer integer : list) {
			if (integer < smallest) {
				smallest = integer;

			}
		}
		System.out.println("Smallest element in list =" + smallest);
		// Count frequency of a number in ArrayList.
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer integer : list) {
			if (map.containsKey(integer)) {
				map.put(integer, map.get(integer) + 1);
			} else {
				map.put(integer, 1);
			}
		}
		System.out.println(map);
		// Remove duplicate elements using Set.
		Set<Integer> s = new HashSet<>(list);
		for (Integer integer : s) {
			System.out.print(integer + " ");
		}

		System.out.println();
		System.out.print(list.reversed());
		Collections.reverse(list);
		System.out.print(list);// 3 ways to reverse arrylist
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));

		}
		System.out.println("--------");
		// Sort ArrayList in ascending order.
		System.out.println("BEfore sorting =" + list);
		Collections.sort(list);
		System.out.println("After sorting =" + list);
		// Sort ArrayList in descending order.
		System.out.println("descending order =" + list.reversed());
		// Find second largest element.
		int larg = list.get(0);
		int second_larger = list.get(0);
		for (Integer integer : s) {
			if (larg < integer) {
				second_larger = larg;
				larg = integer;

			}
		}
		System.out.println("Second larger =" + second_larger);
		
	}
}
