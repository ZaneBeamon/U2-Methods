import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        double Radius; Double.parseDouble(JOptionPane.showInputDialog("what is the Radius"));
        Area(4);
        Circumference(4,3);
    }




        //call the area method

        //call the circumference method

    }

    //write a method to calculate a circle's area
    public static void Area(double Radius){
        DecimalFormat round = new DecimalFormat("#.##");



        double area = Math.PI * Math.pow(Radius, 2);

        JOptionPane.showMessageDialog(null, "the area is " + area);


    }


    //write a method to calculate a circle's circumference
    public static void Circumference(double Radius, double circumference){
        DecimalFormat round = new DecimalFormat("#.##");

        double circumference = 2 * Math.PI * Radius;

        JOptionPane.showMessageDialog(null, "the area is " + circumference);



    }
