

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleQuiz implements ActionListener {

	JFrame Window;
	JPanel panel;
	JLabel label;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JTextField jtf;

	public static void main(String[] args) {
		SimpleQuiz watermelon = new SimpleQuiz();
	}

	SimpleQuiz() {
		Window = new JFrame("Multiple Choice Quiz");
		panel = new JPanel();
		label = new JLabel("What is 9 + 10?");
		button1 = new JButton("A");
		button2 = new JButton("B");
		button3 = new JButton("C");
		button4 = new JButton("D");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		Window.setVisible(true);
		Window.setSize(500, 500);
		Window.add(panel);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
