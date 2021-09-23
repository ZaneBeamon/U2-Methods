import javax.swing.*;

public class SplitPs {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("enter a word with Ps in it");


        String output = Drip(word);

        JOptionPane.showMessageDialog(null, output);

    }

    public static String Drip(String word ){


        int pIndex = word.indexOf("p");

        String split = word.substring(pIndex + 1, pIndex + 4);
        return "p" + split;
    }
    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
}
