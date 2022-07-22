package windowProgramming;

public class Window {

	private int width;
	private int height;
	private int top;
	private int left;
	private boolean isVisible;

//	public Window() {
//		// 기본 생성자라서 생략되어 있음
//	}

	// 마우스 우클릭 → Source → Generate getters and setters... : 자동 만들기
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
}
