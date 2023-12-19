import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	int pressCount;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("icon.png");
		ImageIcon icon2 = new ImageIcon("icon2.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,200,150);
		label.setVisible(false);
		label.setText("You clicked 0 times");
		
		button  = new JButton();
		button.setBounds(150, 100, 100, 50);
		button.addActionListener(this);
		button.setText("Button");
		button.setFocusable(false);
		button.setSize(200,100);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Arial", Font.BOLD, 25));
		button.setIconTextGap(0);
		button.setForeground(Color.black);
		button.setBackground(Color.white);
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		button.setEnabled(true);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 int limiter = 4;
		
        if (e.getSource() == button && pressCount < limiter) {
            pressCount++;
            System.out.println("Button was pressed " + pressCount + " times");
            label.setText("You clicked " + pressCount + " times");

            if (pressCount == limiter) {
                button.setEnabled(false);
                label.setVisible(true);
            }
        }

		
	}
}
