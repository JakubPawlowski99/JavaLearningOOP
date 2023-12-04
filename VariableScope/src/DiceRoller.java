import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceRoller {
    private Random random;
    private int number;

    public DiceRoller() {
        random = new Random();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Dice Roller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton rollButton = new JButton("Roll");
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                roll();
                JOptionPane.showMessageDialog(null, "You rolled: " + number, "Dice Roll Result", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel panel = new JPanel();
        panel.add(rollButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    private void roll() {
        number = random.nextInt(6) + 1;
        System.out.println("You rolled: " + number);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DiceRoller();
            }
        });
    }
}