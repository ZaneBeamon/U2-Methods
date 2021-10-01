import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleFrame
{

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Head Pat Simulator");
        JPanel panel = new JPanel();
        JButton button = new JButton("click for head pats :3");


        window.setSize(600, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        panel.add(button);
        window.add(panel);
        button.addActionListener(new ButtonListener());


    }
    private static class ButtonListener implements ActionListener{

    public void actionperformed(ActionEvent e) {
    JOptionPane.showMessageDialog(null, "yay, head pats");
    }
    }
}
