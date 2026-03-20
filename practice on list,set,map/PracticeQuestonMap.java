import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticeQuestonMap {
	public static void main(String[] args) {
		// 14)Create a HashMap and store Roll No as key and Name as value.
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Payal");
		map.put(2, "Pari");
		map.put(3, "Raju");
		map.put(4, "Ram");
		System.out.println(map);
		// 15)Display all key–value pairs using entrySet().
		for (Entry<Integer, String> str : map.entrySet()) {

			System.out.println(str.getKey() + " " + str.getValue());
		}
		//16)Retrieve a value using a key from Map.
		// String str = map.get(1);
		// System.out.println("value of key 1 is =" + str);
		// 17)Check whether a key exists in Map.
		int key = 3;
		if (map.containsKey(key)) {
			System.out.println("Key Exists in map");
		} else {
			System.out.println("Key does  not exist   in map");
		}
		// 18)Check whether a value exists in Map.
		String value = "Payal";
		if (map.containsValue(value)) {
			System.out.println("Value exist in map");
		} else {
			System.out.println("Value does not exist in map");
		}
		// 19)Find the size of a Map.
		System.out.println(map.size());
		//20) Remove an entry from Map using key.
		String a = map.remove(2);
		System.out.println("After removing map =" + map);
	}

}
