import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.swing.*;
import java.awt.even.ActionEvent;
import java.awt.ActionListener;

public class BasicCalculator {





    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    static JTextField Number1, Number2;
    static JLabel resultLabel;

    public static void main (String[] args){

     JFrame window = new JFrame("Calculator");
     JPanel panel = new JPanel();
     JLabel InputLabel1 = new JLabel("enter first number");
     JLabel InputLabel2 = new JLabel("enter second number");
     Number1 = new JTextField(10);
     Number2 = new JTextField(10);

     JButton subButton = new JButton("Subtract");
     JButton Mulitply = new JButton("multiply");
     JButton addButton = new JButton("add");
     JButton Divide = new JButton("Divide");

     resultLabel = new JLabel("0.00");

     window.setSize(200, 400);
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.setLocationRelativeTo(null);

     addButton.addActionListener(new addListener());
     subButton.addActionListener(new subListener());
     Mulitply.addActionListener(new MultiListener();
     Divide.addActionListener(new DivisionListener());

     panel.add(inputLabel);
     panel.add(Number1);
     panel.add(inputlabel2);
     panel.add(Number2);

     panel.add(resultLabel);
     panel.add(subButton);
     panel.add(Mulitply);
     panel.add(addButton);
     panel.add(Divide);

     window.add(panel);
     window.setVisible(true);

    }
    private static class addListener implements ActionListener{

     public void actionperformed(ActionEvent e){
      double number1 = Double.parseDouble(Number1.getText());
      double number2 = Double.parseDouble(Number2.getText());

      resultLabel.setText(String.valueOf(number1 + number2));
     }
    }
 private static class subListener implements ActionListener{

  public void actionperformed(ActionEvent e){
   double number1 = Double.parseDouble(Number1.getText());
   double number2 = Double.parseDouble(Number2.getText());

   resultLabel.setText(String.valueOf(number1 - number2));
  }
}
