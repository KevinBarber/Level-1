import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.util.Random;

public class SlotMachine implements ActionListener {

	JFrame window;
	JPanel panel;
	JButton button;
	JLabel left;
	JLabel mid;
	JLabel right;
	String something = "";
	Random random;
	int r1;
	int r2;
	int r3;

	public static void main(String[] args) {

		SlotMachine watermelon = new SlotMachine();

	}

	SlotMachine() {
	
		window = new JFrame("Slot Machine");
		window.getContentPane().setBackground(Color.YELLOW);
		panel = new JPanel();
		button = new JButton("Press Me!");
		button.setBackground(Color.RED);
		button.setOpaque(true);
		random = new Random();

		left = new JLabel();
		mid = new JLabel();
		right = new JLabel();
		
		left.setBackground(Color.GREEN);
		left.setOpaque(true);
		mid.setBackground(Color.GREEN);
		mid.setOpaque(true);
		right.setBackground(Color.MAGENTA);
		right.setOpaque(true);
		button.addActionListener(this);

		window.setVisible(true);

		window.add(panel);
		panel.add(button);
		panel.add(left);
		panel.add(right);
		panel.add(mid);
		window.setSize(500, 500);
	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button)
			;
		

		r1 = random.nextInt(3);
		left.setText("" + r1);

		r2 = random.nextInt(3);
		right.setText("" + r2);
		
		r3 = random.nextInt(3);
		mid.setText("" + r3);
		if (r1 == r1 && r2 == r3 &&r1==r3) {
			JOptionPane.showMessageDialog(null, "You win $100,000");
		}

	}
}
