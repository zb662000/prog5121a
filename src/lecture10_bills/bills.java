
package lecture10_bills;


public class bills {
    private String strCustomer;
    private double dblMinutes, dblCost;
    
    //constructor receiving variables
    public bills (String strName, double dblMinutes, double dblCostPerMinute, double dblMinutesTalked){
            strCustomer = strName;
    dblMinutes = dblMinutesTalked;
    dblCost = dblCostPerMinute;
    
    }
    public String getName(){
        return strCustomer;
    }
     public double getTotalBills(){
         return (dblMinutes * dblCost);
     }
    
}
