package file_Class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {

		File currentDirectory = new File(".");

		// File에 입력된 절대경로
		System.out.println(currentDirectory.getAbsolutePath());

		// Resolved된(./, ../ 정리) 절대경로
		System.out.println(currentDirectory.getCanonicalPath());

	}

}
