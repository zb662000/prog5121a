
package lecture10_bills;
import javax.swing.*;


public class Lecture10_Bills {

    
    public static void main(String[] args) {
       String strName = JOptionPane.showInputDialog(null, "Enter the customer's name");
       double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the minutes talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));
        
        //sends variables to constructor in the bills class
        bills b = new bills(strName, dblMinutesTalked, dblMinutes, dblCostPerMinute);
        
       JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " +
                 b.getName().toUpperCase() + "\n" +
                 "Total Due: R " + b.getTotalBills());
    }
    
}
