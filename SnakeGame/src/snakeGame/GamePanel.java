package snakeGame;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	/* 변수 설정하기 */
	private int screenWidth = 1500;
	private int screenHeight = 900;
	private int gridSize = 60;
	private int grids = (screenWidth / gridSize) * (screenHeight / gridSize);
	private int x[] = new int[grids];
	private int y[] = new int[grids];

	private int foodsEaten = 0;
	private int foodX;
	private int foodY;

	private char direction = 'R';
	private boolean running = false;

	public int speed;
	public int bodyLength;

	Timer timer;
	Random random = new Random();

	/* 패널화면 설정 */
	GamePanel(int speed, int bodyLength) {

		this.speed = speed;
		this.bodyLength = bodyLength;

		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		setFocusable(true);
		addKeyListener(new MyKeyAdapter());
		startGame();

	}

	public void startGame() {
		newFood();
		running = true;
		timer = new Timer(speed, this);
		timer.start();
	}

	/* 새로운 음식이 화면에 랜덤으로 나타나게 하기(보이지는 않음) */
	public void newFood() {
		foodX = random.nextInt(screenWidth / gridSize) * gridSize;
		foodY = random.nextInt(screenHeight / gridSize) * gridSize;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // 패널에서 이전에 그려진 잔상을 지워줌
		draw(g);
	}

	public void draw(Graphics g) {
		if (running) {
			/* 화면에 격자 표시하기 */
			for (int i = 0; i < screenWidth / gridSize; i++) {
				g.drawLine(0, i * gridSize, screenWidth, i * gridSize); // 가로 격자
				g.drawLine(i * gridSize, 0, i * gridSize, screenHeight); // 세로 격자
			}

			/* 음식을 화면에 보이게 하기 */
			g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
			g.fillRect(foodX, foodY, gridSize, gridSize);

			/* 뱀(플레이어)을 화면에 나타내기 */
			for (int i = 0; i < bodyLength; i++) {
				if (i == 0) {
					g.setColor(Color.GREEN);
					g.fillRect(x[i], y[i], gridSize, gridSize);
				} else {
					g.setColor(Color.WHITE);
					g.fillRect(x[i], y[i], gridSize, gridSize);
				}
			}

			/* 화면 가운데 상단에 점수 표시하기 */
			g.setColor(Color.WHITE);
			g.setFont(new Font("SanSerif", Font.BOLD, 30));
			FontMetrics metrics1 = getFontMetrics(g.getFont());
			g.drawString("Score : " + foodsEaten, (screenWidth - metrics1.stringWidth("Score : " + foodsEaten)) / 2,
					gridSize);
		} else {
			gameOver(g);
		}
	}

	public void move() {
		for (int i = bodyLength; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}

		/* U → Up, D → Down, L → Left, R → Right */
		switch (direction) {
		case 'U':
			y[0] = y[0] - gridSize;
			break;
		case 'D':
			y[0] = y[0] + gridSize;
			break;
		case 'L':
			x[0] = x[0] - gridSize;
			break;
		case 'R':
			x[0] = x[0] + gridSize;
			break;
		}
	}

	/* 뱀이 음식을 먹었을 때 */
	public void eatFood() {
		if ((x[0] == foodX) && (y[0] == foodY)) {
			bodyLength++;
			foodsEaten++;
			newFood();
		}
	}

	/* 뱀이 충돌했을 때 */
	public void collisions() {
		/* 머리가 자신의 몸이랑 충돌했을 때 */
		for (int i = bodyLength; i > 0; i--) {
			if (x[0] == x[i] && y[0] == y[i]) {
				running = false;
			}
		}

		/* 벽에 충돌했을 때 */
		if ((x[0] < 0) || (x[0] > screenWidth) || (y[0] < 0) || (y[0] > screenHeight)) {
			running = false;
		}

		if (!running) {
			timer.stop();
		}
	}

	public void gameOver(Graphics g) {
		/* 점수 표시하기 */
		g.setColor(Color.WHITE);
		g.setFont(new Font("SanSerif", Font.BOLD, 30));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Score : " + foodsEaten, (screenWidth - metrics2.stringWidth("Score : " + foodsEaten)) / 2,
				gridSize);

		/* 게임종료 표시하기 */
		g.setColor(Color.RED);
		g.setFont(new Font("SanSerif", Font.BOLD, 80));
		FontMetrics metrics3 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (screenWidth - metrics3.stringWidth("Game Over")) / 2, screenHeight / 2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			eatFood();
			collisions();
		}
		repaint();
	}

	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 상하좌우 방향키는 유니코드가 아니므로 getKeyCode() 사용
			switch (keyCode) {
			case KeyEvent.VK_LEFT:
				if (direction != 'R') {
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if (direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if (direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if (direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}

}