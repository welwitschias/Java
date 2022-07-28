package example;

public class Split_String {

	public static void main(String[] args) {

		String text1 = "Hydro-energy storage is a type of renewable power storage that is a form of two water reservoirs at different heights that generates power as water moves up and down from one to the other, passing through the turbine.";
//		String text2 = "인천 송도국제도시는 2020년 완성을 목표로 2003년부터 개발하기 시작한 신도시다. 일자리·학군·생활 인프라 등 자족기능을 갖추긴 했지만 서울까지 1시간 넘게 걸릴 정도로 대중교통 접근성이 떨어지는 것이 단점으로 꼽혔다. 하지만, GTX-B 개통 호재에 지난해에만 집값이 44% 가까이 급등했다.";

		String[] words = text1.split("[^a-zA-Z]+"); // 영어만 분리
//		String[] words = text2.split("[^가-힣]+"); // 한글만 분리

		for (String w : words) {
			if (w.length() < 2)
				continue; // 1글자는 제거
			System.out.println(w);
		}

	}

}
