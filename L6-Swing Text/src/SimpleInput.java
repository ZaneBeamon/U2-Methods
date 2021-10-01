import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simpleinput {

    static int clickCount = 0;
    static JLabel clickCountLabel;;
    static JTextField input;

    public static void main(String[] args) {
        JFrame window = new JFrame ("head pats");
        JPanel panel = new JPanel();
        clickCountLabel = new JLabel("CLick Count: ");
        JLabel inputLabel = new JLabel("enter a name");
        input = new JTextField(15);
        JButton Button = new JButton("click for Head pats :3");

        window.setSize(250, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        Button.addActionListener(new ButtonListener());

        panel.add(inputLabel);
        panel.add(input);
        panel.add(clickCountLabel);
        panel.add(Button);

        window.add(panel);
        window.setVisible(true);
    }
    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e);
        String product = input.getText();

        clickCount++;

        clickCountLabel.setText


        }
    }
}
