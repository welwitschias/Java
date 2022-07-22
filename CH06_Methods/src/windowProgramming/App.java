package windowProgramming;

public class App {

	public static void main(String[] args) {

		Window win = new Window();
		win.setWidth(300);
		win.setHeight(300);
		win.setTop(50);
		win.setLeft(100);
		
		System.out.println(win.getWidth());

	}

}
