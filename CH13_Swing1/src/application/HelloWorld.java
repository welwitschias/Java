package application;

import javax.swing.JFrame;

public class HelloWorld {

	public static void main(String[] args) {

		// JFrame은 윈도우 창
		JFrame mainFrame = new JFrame(); // 새 창 생성

		mainFrame.setSize(1080, 720); // 창 크기
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료시 프로그램 종료
		mainFrame.setVisible(true); // 창을 보이게 하기

	}

}
