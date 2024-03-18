import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements KeyListener{

	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		this.add(label);
		this.setVisible(true);
		

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-10, label.getY());
				break;
			case 'd': label.setLocation(label.getX()+10, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY()-10);
				break;
			case 's': label.setLocation(label.getX(), label.getY()+10);
			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("released :"+ e.getKeyChar());
		System.out.println("released :"+ e.getKeyCode());
	}
}
