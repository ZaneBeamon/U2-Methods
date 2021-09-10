import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    public static void main(String[] args) {
        withdraw();
        Deposit(); 
        System.exit(0);


    }
    public static void deposit(){
        double Balance; Double.parseDouble(JOptionPane.showInputDialog("please enter your Balance."));
        double Deposit; Double.parseDouble(JOptionPane.showInputDialog("please enter the amount of your deposit"));

        Balance += Deposit;

        JOptionPane.showMessageDialog(null, "your new balance is: " + Balance);
    }
    public static void Withdraw(){
        double Balance; Double.parseDouble(JOptionPane.showInputDialog("please enter your balance"));
        double withdraw; Double.parseDouble(JOptionPane.showInputDialog("how much would you like to withdraw"));

        Balance -= withdraw;

        JOptionPane.showMessageDialog(null, "your new balance is: " + Balance);
    }

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */


    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */
}
