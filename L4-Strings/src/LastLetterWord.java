import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    public static void main(String[] args) {


        String word1 = JOptionPane.showInputDialog("enter word 1: ");
        String word2 = JOptionPane.showInputDialog("enter word 2: ");
        String word3 = JOptionPane.showInputDialog("enter word 3: ");

        String output = LastThree(word1) + LastThree(word2) + LastThree(word3);

        JOptionPane.showMessageDialog(null, output);



    }
      public static String LastThree (String word){
        return word.substring(word.length()-3);
      }
}
