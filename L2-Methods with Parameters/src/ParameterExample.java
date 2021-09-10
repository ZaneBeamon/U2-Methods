import javax.swing.*;

public class ParameterExample {

    public static void main(String[] args) {




        areaREC(4,3);
        perimeterREC(4,3);
    }

    public static void areaREC(double width, double length){

        double area = width * length;
        JOptionPane.showMessageDialog(null, "The area is " + area);
    }

    public static void perimeterREC(double width, double length){

        double perimeter = 2 * width + 2 *  length;
        JOptionPane.showMessageDialog(null, "The area is " + perimeter);
    }
}
