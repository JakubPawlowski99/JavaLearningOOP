import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(-150,150,0); //min,max,start
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		
		slider.setPaintLabels(true);
		
		slider.setOrientation(SwingConstants.VERTICAL);

		label.setText("Value = "+ slider.getValue());
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("Value = "+ slider.getValue());
	}

}
