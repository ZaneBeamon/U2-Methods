import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FeetToMeters {
    public static void main(String[] args) {
        JFrame window = new JFrame("measurement conversions");
        JPanel panel = new JPanel();
        JButton Feet2Meters = new JButton("feet - meters");
        JButton Meters2Feet = new JButton("meters - feet");

        window.setSize(150, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        panel.add(Feet2Meters);
        panel.add(Meters2Feet);
        window.add(panel);
        Feet2Meters.addActionListener(new Quotes.());
        Meters2Feet.addActionListener(new Quotes.());

    }
    private static class Feet implements ActionListener{
        public void actionPerformed(ActionEvent e) {

           double number = Double.ParseDouble(JOptionPane.showInputDialog("enter Feet"));
           double result = number / 3.28;

           JOptionPane.showMessageDialog(null, result + "in meters");
        }
    }
    private static class Meters implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            double number = Double.ParseDouble(JOptionPane.showInputDialog("enter Meters"));
            double result = number * 3.28;

            JOptionPane.showMessageDialog(null, result + "in Feet");

        }


    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
}
