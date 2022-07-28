package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_List {

	public static void main(String[] args) {

		/* 숫자 정렬하기 */
		ArrayList<Double> doubles = new ArrayList<>();

		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);

		Collections.sort(doubles); // 정렬

		for (Double d : doubles) {
			System.out.println(d);
		}
		System.out.println();

		/* 문자열 정렬하기 */
		ArrayList<Person> people = new ArrayList<>();

		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));

		// 문자열은 기본적으로 정렬할 수 없음
		// Person class → Comparable 인터페이스 추가 → 비교 기준 추가
		Collections.sort(people);

		for (Person p : people) {
			System.out.println(p);
		}

	}

}
