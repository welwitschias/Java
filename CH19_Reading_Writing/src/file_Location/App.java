package file_Location;

import java.io.File;

public class App {

	public static void main(String[] args) {

		String fileLocation = "C:\\Java\\workspace\\CH19_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists()); // 파일 존재 확인
		System.out.println();

	}

}
