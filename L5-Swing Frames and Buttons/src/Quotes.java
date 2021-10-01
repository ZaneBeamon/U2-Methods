import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    public static void main(String[] args) {
        JFrame window = new JFrame("My three quotes");
        JPanel panel = new JPanel();
        JButton button = new JButton("quote 1");
        JButton button2 = new JButton("quote 2");
        JButton Button3 = new JButton("quote 3");

        window.setSize(150, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        panel.add(button);
        panel.add(button2);
        panel.add(Button3);
        window.add(panel);
        button.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener2());
        Button3.addActionListener(new ButtonListener3());



    }
    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(null, "we accept this memory, and will move beyond it reach");
        }
    }
    private static class ButtonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(null, "ignore what you are and focus on who you are");
        }
    }
    private static class ButtonListener3 implements ActionListener{
        public void actionPerformed(ActionEvent e){JOptionPane.showMessageDialog(null, "to find acceptance in another, you must accept yourself first");
        }
    }
}



    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */


