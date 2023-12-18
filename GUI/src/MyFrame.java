import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		// TODO Auto-generated method stub

		
		this.setTitle("JFrame title");
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		this.setSize(800,450);
		this.setResizable(false);
		
		//changing image of frame
		ImageIcon image = new ImageIcon("icon.png");
		this.setIconImage(image.getImage());
		
		//background
		this.getContentPane().setBackground(new Color(255,255,255));
	}
}
