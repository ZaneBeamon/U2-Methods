import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {

    /*


    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     */

    public static void main(String[] args) {
        int X1 = getInput("point 1, X-cooridinate");
        int Y1 = getInput("point 1, Y-cooridinate");

        int X2 = getInput("point 2, X-cooridinate");
        int Y2 = getInput("point 2, Y-cooridinate");

        double distance1 = distance(X1, X2, Y1, Y2);
        double distance2 = distance(X2, X2, Y1, Y2);
        double distance3 = distance(X1, X2, Y1, Y2);

    }
    public static int getInput (String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
    public static double distance(int X1, int Y1, int X2, int Y2){
    Math.sqrt(Math.pow(X2 - X1, 2 ) + Math.pow(Y2 - Y1, 2));

    }
    public static double perimeter (double side, double side2, double side3){
    return side + side2 + side3;

    }
    public static void outputResults(double perimeter) {

        DecimalFormat round = new DecimalFormat("#,##.00");

        JOptionPane.showMessageDialog(null, "the perimeter is:" + round.format(perimeter));



    }
}
