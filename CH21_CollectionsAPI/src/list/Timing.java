package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing {

	public static void main(String[] args) {

		// 둘 다 기능은 동일하나 특정 상황에 따라 처리 시간이 다름
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		long arrayTime = timeOperation(arrayList);
		long linkedTime = timeOperation(linkedList);

		// 일반적인 작업은 arrayList가 더 빠름
		System.out.println("측정 시간(array) : " + arrayTime + "ms");
		System.out.println("측정 시간(linked) : " + linkedTime + "ms");

	}

	private static long timeOperation(List<Integer> list) {
		long start = System.currentTimeMillis(); // ms(0.001초)

		for (int i = 0; i < 1000000; i++) {
			list.add(i); // 순서대로 계속 추가
//			list.add(0, i); // 인덱스 0번 자리에 계속 추가 → arrayList는 한자리씩 밀리면서 추가됨 → 느림
		}

		return System.currentTimeMillis() - start;
	}

}
