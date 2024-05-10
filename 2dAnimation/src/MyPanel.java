import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image icon;
	Timer timer;
	double xVelocity = 1.23;
	double yVelocity = 2.44;
	int x = 0;
	int y = 0;
	
	
	MyPanel(){
	    this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	    this.setBackground(Color.lightGray);
	    icon = new ImageIcon("icon.png").getImage();
	    timer = new Timer(3, this);
	    timer.start(); // Start the timer
	}
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(icon, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(x>=PANEL_WIDTH-icon.getWidth(null) || x<0) {
			xVelocity = xVelocity *-1; 
		}
		x += xVelocity; // Update x position
		
		if(y>=PANEL_HEIGHT-icon.getHeight(null) || y<0) {
			yVelocity = yVelocity *-1;
		}
	   
	    y += yVelocity; // Update y position
	    repaint(); // Trigger repaint
		
	}
	
}
