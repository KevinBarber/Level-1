
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiCalculator implements ActionListener {
	JButton add;
	JButton multiply;
	JPanel panel;
	JTextField left;
	JTextField right;
	JLabel label;
	JFrame window;
	
	public static void main(String[] args) {
		GuiCalculator x = new GuiCalculator();

	}

	GuiCalculator() {
	window = new JFrame("Calculator");
	panel = new JPanel();
	add = new JButton("ADD");
	multiply = new JButton("MULTIPLY");
	add.addActionListener(this);
	multiply.addActionListener(this);
	left = new JTextField(5);
	right = new JTextField(5);
	label = new JLabel();
	window.setVisible(true);
	window.add(panel);
	panel.add(add);
	panel.add(multiply);
	panel.add(left);
	panel.add(right);
	panel.add(label);
	window.setSize(450,450);
	
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
			if(e.getSource()==add){
				System.out.println("add pressed");
				String y = left.getText();
				
			}
			
			if(e.getSource()==multiply){
				System.out.println("Multiply pressed");
				String x = left.getText();
			}
			
	}
}
