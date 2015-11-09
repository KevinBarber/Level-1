import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class keypressedPractice implements KeyListener {

	JFrame window;
	JLabel label;
	JPanel panel;

	public static void main(String[] args) {
		
		keypressedPractice c = new keypressedPractice();
	}

	

	keypressedPractice() {
		window = new JFrame();
		window = new JFrame("KeyBoard Stuffs");
		window.addKeyListener(this);
		panel = new JPanel();
		window.setVisible(true);
		window.setSize(500, 500);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()=='e'){
			System.out.println("KeyTyped");
		}
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='w'){
			System.out.println("KeyPressed");
		}
	}

	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
	}
}
