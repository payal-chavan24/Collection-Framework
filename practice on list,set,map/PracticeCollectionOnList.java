//1)Create an ArrayList and add 5 integers to it.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeCollectionOnList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(67);
		list.add(89);
		list.add(78);
		list.add(12);
		list.add(34);

//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		//2)Write a program to display all elements of a List using for-each loop.
//         for (Integer integer : list) {
//			System.out.println(integer);
//		}
		// 3)Add an element at a specific index in an ArrayList.
		list.add(67);
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
		// 4)Remove an element from a List using index.
		list.remove(1);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//5) Find the size of a List.
		System.out.println("Size of list ="+list.size());
		System.out.println("Checking List is empty or not ="+list.isEmpty());
		//6)Retrieve an element from a List using get() method.
		System.out.println(list.get(0));
		
		

	}
}
