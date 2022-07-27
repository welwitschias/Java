package reading_Writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {

		String text = "헬로우!\nHow Are You?";

		/* 파일에 쓰기 */
		Path path = Paths.get("text.txt"); // 파일경로 객체, 상대경로
		// Files.write(파일경로, 내용) : 파일에 내용 쓰기
		Files.write(path, text.getBytes());

		/* 파일을 읽기 */
		String recivedText = Files.readString(path);
		System.out.println(recivedText);

	}

}
