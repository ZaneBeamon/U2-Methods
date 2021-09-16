import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    public static void main(String[] args) {
        //1.
        double radius = getInput("please enter the radius");

        //2.
        double area = area(radius);

        //3.
        double circumference = circumference(radius);

        //4.
        JOptionPane.showMessageDialog(null, displayresults(area, circumference));
    }

    //method to get input from user
        public static double getInput(String message){
            return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area (double radius){
        
        return Math.pow(radius, 2) * Math.PI;

    }
    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double Circumference(double radius){
       return 2 * Math.PI * radius;
    }
    public static getInput(String message){



    }
    public static String displayresults(double area, double perimeter){
    DecimalFormat round = new DecimalFormat("#.##");
    String message = "the area is: " + area;
    message += "\nthe circumforence is :" + round.format(perimeter);


    return message;



    }
}
