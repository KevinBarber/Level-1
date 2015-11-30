

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class ArrowButtons implements ActionListener {
	
		int u = 0;
		int d = 1;
		int l = 2;
		int r = 3;
		int lastClicked = -1;
		
	JFrame window;
	JLabel label;
	JPanel panel;
	JButton up;
	JButton down;
	JButton left;
	JButton right;
	
	
	
	public static void main(String[] args) {
		ArrowButtons watermelon = new ArrowButtons();
		
	}
	
	ArrowButtons(){
		window = new JFrame();
		window.setVisible(true);
		window.setSize(500,500);
		
		panel = new JPanel();
		
		up = new JButton("UP");
		down = new JButton("DOWN");
		left = new JButton("LEFT");
		right = new JButton("RIGHT");
		
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		
		window.add(panel);
		
		panel.add(up);
		panel.add(down);
		panel.add(left);
		panel.add(right);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==up){
			if(lastClicked!= u){
				System.out.println("UP");
				lastClicked = u;
			}
				
		}
		if(e.getSource()==down){
			if(lastClicked!=d){
				System.out.println("DOWN");
				lastClicked = d;
			}
		
			}
		if(e.getSource()==left){
			if(lastClicked!=l){
				System.out.println("LEFT");
				lastClicked = l;
			}
		
			}
		if(e.getSource()==right){
			if(lastClicked!=r){
				System.out.println("RIGHT");
				lastClicked = r;
			}
			
			}
		
	}
}
