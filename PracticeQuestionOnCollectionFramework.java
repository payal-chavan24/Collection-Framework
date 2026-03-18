import java.util.ArrayList;

public class PracticeQuestionOnCollectionFramework {
	public static void main(String[] args) {
		// Create an ArrayList and add 5 integers to it.
		ArrayList list = new ArrayList();
//	list.add(1);
//	list.add(2);
//	list.add(3);
//	list.add(4);
//	list.add(5);
		// System.out.println(list);
		// Write a program to display all elements of a List using for-each loop.
		list.add("Payal");
		list.add(22);
		list.add(true);
		list.add('f');
		list.add(5);
		for (Object object : list) {
			System.out.println(object);
		}
		// Add an element at a specific index in an ArrayList.
		System.out.println("Before adding elements =" + list);

		list.add(1, "pune");
		System.out.println("After adding elements =" + list);
		// Remove an element from a List using index.
        list.remove(2);
        System.out.println(list);
        //Find the size of a List.
         int size= list.size();
         System.out.println("Size of ArrayList ="+size);
         //Check whether a List is empty or not.
          System.out.println(list.isEmpty());
          //Retrieve an element from a List using get() method.
         System.out.println(list.get(1));
          
        		 
	}
}
