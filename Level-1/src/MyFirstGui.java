
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFirstGui implements ActionListener {

	JFrame window;
	JPanel panel;
	JButton button;
	JButton button2;
	JTextField jtf;
	JLabel label;

	public static void main(String[] args) {
		MyFirstGui watermelon = new MyFirstGui();
	}

	MyFirstGui() {
		System.out.println("Test");
		window = new JFrame("#Ruoya4Lyfe");
		panel = new JPanel();
		button = new JButton("Button");
		button2 = new JButton("Button");
		jtf = new JTextField(10);
		label = new JLabel("TextField");
		button.addActionListener(this);
		button2.addActionListener(this);
		window.setVisible(true);
		window.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(jtf);
		panel.add(label);
		window.setSize(500, 500);
		// memorize below
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			label.setText(jtf.getText());

			System.out.println("First Button Pressed");
		} else if (e.getSource() == button2) {
			System.out.println("Secondary Button Pressed");
			JOptionPane.showMessageDialog(null, jtf.getText());
		}

	}
}
