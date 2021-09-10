import javax.swing.*;

public class LemonadeStand {
    static double price16 = 0.50;
    static double price20 = 0.99;
    static double tax = 7.5;
         /* Global callouts, can be used anywhere
    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {
Lemonade();

    }
    public static void Lemonade(double num16, double num20){
        double cost16 = num16 * price16;
         double cost20 = num20 * price20;

         double total16 = cost16 (1 * (tax/100.00));
         double total20 =  cost20 (1 *(tax/100.00));

         double total = total16 + total20;

         String message = "your Order: ";
         message += "\n\t16 oz " + round.format(num16);
         message += "\n\t20 oz " + round.format(num20);
         message += "\n\n\tTotal: " + round.format(Total);

    }

}
