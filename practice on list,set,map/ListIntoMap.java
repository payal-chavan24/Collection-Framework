import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListIntoMap {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		List<String> list2 = new ArrayList<String>();
		list2.add("payal");
		list2.add("priya");
		list2.add("pankaj");
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < list1.size(); i++) {
			map.put(list1.get(i), list2.get(i));

		}
		System.out.println(map);

	}
}
