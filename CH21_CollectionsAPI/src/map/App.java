package map;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {

		// HashMap<key, value>
		// Map형 : index 없음, key로 index 대체, key 중복 불가, value 중복 가능
		HashMap<Integer, String> people = new HashMap<>();

		// 추가 : add 대신 put 사용
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); // 덮어쓰기
		people.put(10, "수지");

		// value 불러오기 : key 사용(
		System.out.println(people.get(4)); // key가 String이면 String 넣어야 함

		String person = people.get(10);
		System.out.println(person);
		System.out.println();

		// 람다식으로 출력
		people.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});
		System.out.println();

		// for 사용하여 value만 출력
		for (String s : people.values()) {
			System.out.println("value : " + s);
		}
		System.out.println();

		// for 사용하여 key만 출력
		for (Integer k : people.keySet()) {
			System.out.println("key : " + k);
		}
		System.out.println();

		// for 사용하여 key와 value 동시에 출력
		// var = Map.Entry<key, value>, java 11부터 사용 가능
		for (var entry : people.entrySet()) {
			var key = entry.getKey();
			var value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
