import java.util.HashSet;
import java.util.Set;

public class PracticeQuestionOnSet {
	public static void main(String[] args) {
		//7) Create a HashSet and add 5 string values.
		Set<String> set = new HashSet<String>();
		set.add("Payal");
		set.add("Neha");
		set.add("Deepika");
		set.add("Priya");
		set.add("Riya");
		set.add("Pari");
		System.out.println(set);
		// 8)Try to add duplicate elements in a Set and observe the output.
		set.add("Payal");
		System.out.println(set);// set dont allowed duplicates elements
		//9) Display all elements of a Set using for-each loop.
//	for(String str:set) {
//		System.out.println(str);
//		
//	}
		//10) Check whether a specific element exists in a Set.
		System.out.println(set.contains("Payal"));
		set.remove("Payal");
		for (String str : set) {
			System.out.println(str);

		}
		//11)Find total number of elements in a Set.
		int count=0;
		for(String str:set) {
			count++;
			
		}System.out.println("Count of elements ="+count);
	}
}
