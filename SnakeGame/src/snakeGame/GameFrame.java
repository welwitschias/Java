package snakeGame;

import javax.swing.JFrame;

@SuppressWarnings("all") // 모든 경고창 무시하기
public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private int mode = 1;

	/* 플레이어가 선택한 난이도에 따라 게임이 실행됨 */
	public GameFrame(int mode) {

		this.mode = mode;

		if (mode == 1) {
			add(new GamePanel(80, 5));
		}
		if (mode == 2) {
			add(new GamePanel(60, 6));
		}
		if (mode == 3) {
			add(new GamePanel(40, 7));
		}

		/* 프레임창 설정 */
		setTitle("Enjoy~ Snake Game!");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pack(); // 구성 요소들의 크기를 화면 크기에 맞춰 자동으로 조절
		setLocationRelativeTo(null); // 컴퓨터 화면 중앙에 창을 띄움

	}

}