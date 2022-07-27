package reading_Writing_txt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_Linebyline {

	public static void main(String[] args) {

		String fileLocation = "C:\\Java\\workspace\\CH19_Reading_Writing\\text.txt";

		/* 한 줄씩 쓰기 */
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation));
			br.write("오렌지");
			br.newLine(); // 한 줄 띄움
			br.write("사과");
			br.newLine();
			br.write("바나나");
			br.newLine();
			br.write("배");
			br.close(); // 파일을 닫음
		} catch (IOException e) {
			// 파일을 쓸 때 파일이 없으면 새로 만듬
			System.out.println("파일을 쓸 수 없음 : " + fileLocation);
		}

		System.out.println("파일 쓰기 완료 : " + fileLocation);

	}

}
