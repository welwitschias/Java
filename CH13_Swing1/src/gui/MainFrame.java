package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L; // 경고창 없애기

	public MainFrame(String title) {
		super(title);

		// 레이아웃 설정
		setLayout(new BorderLayout());
		add(new Toolbar(), BorderLayout.NORTH); // 위쪽에 툴바 붙이기
		add(new MainPanel(), BorderLayout.CENTER); // 가운데에 메인패널 붙이기
		
		setSize(1080, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
