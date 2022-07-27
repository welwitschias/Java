package reading_Writing_txt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading_Linebyline {

	public static void main(String[] args) {

		String fileLocation = "C:\\Java\\workspace\\CH19_Reading_Writing\\test.txt";

		/* 한 줄씩 읽기 */
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못함 : " + fileLocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}

	}

}
