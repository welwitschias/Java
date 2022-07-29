package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {

		// HashSet(순서없음), LinkedHashSet(입력된 순서대로), TreeSet(정렬)
		// HashMap(순서없음), LinkedHashMap(입력된 순서대로), TreeMap(정렬)

		/* HashMap */
		Map<Integer, String> month1 = new HashMap<>();

		month1.put(2, "2월");
		month1.put(3, "3월");
		month1.put(9, "9월");
		month1.put(12, "12월");
		month1.put(6, "6월");

		month1.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

		/* LinkedHashMap */
		Map<Integer, String> month2 = new LinkedHashMap<>();

		month2.put(1, "1월");
		month2.put(9, "9월");
		month2.put(8, "8월");
		month2.put(3, "3월");
		month2.put(6, "6월");

		month2.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

		/* TreeMap */
		Map<Integer, String> month3 = new TreeMap<>();

		month3.put(5, "5월");
		month3.put(10, "10월");
		month3.put(2, "2월");
		month3.put(11, "11월");
		month3.put(8, "8월");

		month3.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
