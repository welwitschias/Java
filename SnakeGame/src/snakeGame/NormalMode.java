package snakeGame;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class NormalMode extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	/* 변수 설정하기 */
	private int screenWidth = 1500;
	private int screenHeight = 900;

	private int gridSize = 60;
	private int grids = (screenWidth / gridSize) * (screenHeight / gridSize);

	private int x[] = new int[grids];
	private int y[] = new int[grids];

	private int speed = 60;
	private int bodyLength = 6;

	private int foodsEaten;
	private int foodX, foodY;

	private char direction = 'R';
	private boolean running = false;

	Timer timer = new Timer(speed, this);
	Random random = new Random();

	/* 패널화면 설정 */
	NormalMode() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		setFocusable(true);
		addKeyListener(new MyKeyAdapter());
		startGame();
	}

	public void startGame() {
		newFood();
		running = true;
		timer.start();
	}

	/* 새로운 음식이 화면에 랜덤으로 나타나게 하기(보이지는 않음) */
	public void newFood() {
		foodX = random.nextInt(screenWidth / gridSize) * gridSize;
		foodY = random.nextInt(screenHeight / gridSize) * gridSize;
	}

	/* Swing Component가 자신의 모양을 그리는 method */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // 패널에서 이전에 그려진 잔상을 지움
		draw(g);
	}

	public void draw(Graphics g) {
		if (running) {
			/* 화면에 Grid(격자) 표시하기 */
			for (int i = 0; i < screenWidth / gridSize; i++) {
				g.drawLine(0, i * gridSize, screenWidth, i * gridSize); // 가로 격자
				g.drawLine(i * gridSize, 0, i * gridSize, screenHeight); // 세로 격자
			}

			/* 음식을 화면에 보이게 하기 */
			g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
			g.fillRect(foodX, foodY, gridSize, gridSize);

			/* 뱀을 화면에 나타내기 */
			for (int i = 0; i < bodyLength; i++) {
				if (i == 0) {
					g.setColor(Color.PINK);
					g.fillRect(x[i], y[i], gridSize, gridSize);
				} else {
					g.setColor(Color.WHITE);
					g.fillRect(x[i], y[i], gridSize, gridSize);
				}
			}

			/* 화면 위에 점수(score) 표시하기 */
			g.setColor(Color.WHITE);
			g.setFont(new Font("SanSerif", Font.BOLD, 20));
			g.drawString("Score : " + foodsEaten, (screenWidth / 2) - gridSize, 30);
		} else {
			gameOver(g);
		}
	}

	public void move() {
		for (int i = bodyLength; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}

		switch (direction) {
		case 'U': // up
			y[0] = y[0] - gridSize;
			break;
		case 'D': // down
			y[0] = y[0] + gridSize;
			break;
		case 'L': // left
			x[0] = x[0] - gridSize;
			break;
		case 'R': // right
			x[0] = x[0] + gridSize;
			break;
		}
	}

	/* 뱀이 음식을 먹었을 때 */
	public void checkFood() {
		if ((x[0] == foodX) && (y[0] == foodY)) {
			bodyLength++;
			foodsEaten++;
			newFood();
		}
	}

	/* 뱀이 충돌했을 때 */
	public void checkCollisions() {
		/* 머리가 자신의 몸이랑 충돌했을 때 */
		for (int i = bodyLength; i > 0; i--) {
			if (x[0] == x[i] && y[0] == y[i]) {
				running = false;
				timer.stop();
			}
		}

		/* 벽에 충돌했을 때 */
		if ((x[0] < 0) || (x[0] > screenWidth) || (y[0] < 0) || (y[0] > screenHeight)) {
			running = false;
			timer.stop();
		}
	}

	public void gameOver(Graphics g) {
		/* 점수(score) 표시하기 */
		g.setColor(Color.WHITE);
		g.setFont(new Font("SanSerif", Font.BOLD, 20));
		g.drawString("Score : " + foodsEaten, (screenWidth / 2) - gridSize, 30);

		/* 게임종료 표시하기 */
		g.setColor(Color.WHITE);
		g.setFont(new Font("SanSerif", Font.BOLD, 60));
		FontMetrics metrics = getFontMetrics(g.getFont());
		g.drawString("Game Over", (screenWidth - metrics.stringWidth("Game Over")) / 2, screenHeight / 2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			checkFood();
			checkCollisions();
		}
		repaint();
	}

	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 상하좌우 key는 유니코드가 아니므로 사용
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
