package view;

import java.awt.BorderLayout;

import javax.swing.*;

public class View_demo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public View_demo() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void Show_Demo(String title, int height, int width) {
		this.setTitle(title);
		this.setLayout(new BorderLayout());
		this.add(new JLabel("Hello World"), BorderLayout.LINE_START);
		this.pack();
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		View_demo view = new View_demo();
		
		view.Show_Demo("Dem mo Chương trình", 450, 300);
		
	}
}
