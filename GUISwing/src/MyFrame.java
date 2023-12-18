import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class MyFrame extends JFrame{
	
	MyFrame(){
		
		ImageIcon image = new ImageIcon("icon.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		 JLabel label = new JLabel("Sample text", image, JLabel.CENTER); // Create label with text and icon
	        label.setHorizontalTextPosition(JLabel.CENTER);
	        label.setVerticalTextPosition(JLabel.TOP); // Adjust vertical position of text
	        label.setForeground(new Color(123, 77, 2));
	        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
	        label.setIconTextGap(20); // Adjust the gap between icon and text
	        label.setBackground(Color.white);
	        label.setOpaque(true);
	        label.setBorder(border);
	        label.setVerticalAlignment(JLabel.CENTER);
	        

	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //this.setSize(800, 800);
	        //this.setLayout(new FlowLayout()); // Use a layout manager to control component placement
	        this.setVisible(true);
	        this.add(label, BorderLayout.CENTER);
	        this.pack(); //use at the end
	    }



}
