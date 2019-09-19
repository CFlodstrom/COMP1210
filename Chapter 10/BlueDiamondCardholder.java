import java.text.DecimalFormat;
/**
 *The Blue Diamond Cardholder class is a class derived from the. 
 *Diamond cardholder class.
 *@author Chris Flodstrom
 *@version 11/12/2018
 */
public class BlueDiamondCardholder extends DiamondCardholder {

//fields
   private int bonusPurchasePoints = 2500;

/**
*This is the constructor from which the Cardholder methods.
* are brought over from the diamond cardholder class
*@param acctNumberIn - used
*@param nameIn - used
*/

   public BlueDiamondCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Blue Diamond Cardholder";
      discountRate = .10;
   }  
   
/**
* this method gets bonus points to the blue diamond cardholder.
*@return - used
*/

   public int getBonusPurchasePoints() {
      return bonusPurchasePoints;
   }
   
/**
*this method sets the bonus purchase points in the class.
*@param bonusPurchasePointsIn - used
*/
   public void setBonusPurchasePoints(int bonusPurchasePointsIn) {
      bonusPurchasePoints = bonusPurchasePointsIn;
   }
   
/**
* this method adds 2500 purchase points if the total purchases price.
* exceeds $2500.
*@return - used
*/
   public int purchasePoints() {
      int purpoints = (int) totalPurchases() * 5;
      if (totalPurchases() >= 2500) {
         int purpoints1 = purpoints + bonusPurchasePoints;
         return purpoints1;  
      }
      return purpoints;
   }
   
/**
* The toString method prints out the same things.
* that it did in the  diamond cardholder class, but it also
* adds the line that tells customers they saved 10% on discounts.
* and added 2500 bonus points if it exceeded $2500 spent.
*@return - used
*/
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt1 = new DecimalFormat("#,##0");
      if (totalPurchases() < 2500) {
         return category + "\n"
            + "AcctNo/Name: " + acctNumber + " " + name + "\n"
            + "Previous Balance: " + fmt.format(prevBalance) + "\n"
            + "Payment: " + "(" + fmt.format(payment) + ")\n"
            + "Interest: " + fmt.format(interest()) + "\n"
            + "New Purchases: " + fmt.format(totalPurchases()) + "\n"
            + "Current Balance: " + fmt.format(currentBalance()) + "\n"
            + "Minimum Payment: " + fmt.format(minPayment()) + "\n"
            + "Purchase Points: " + fmt1.format(purchasePoints()) + "\n"
            + " (includes" + (discountRate * 100) + "% discount rate applied to New Purchases)"; 
      }    
      else {
         return category + "\n"
            + "AcctNo/Name: " + acctNumber + " " + name + "\n"
            + "Previous Balance: " + fmt.format(prevBalance) + "\n"
            + "Payment: " + "(" + fmt.format(payment) + ")\n"
            + "Interest: " + fmt.format(interest()) + "\n"
            + "New Purchases: " + fmt.format(totalPurchases()) + "\n"
            + "Current Balance: " + fmt.format(currentBalance()) + "\n"
            + "Minimum Payment: " + fmt.format(minPayment()) + "\n"
            + "Purchase Points: " + fmt1.format(purchasePoints()) + "\n"
            + " (includes" + (discountRate * 100) + "% discount rate applied to New Purchases)" + "\n" 
            + " (includes 2,500 bonus points added to Purchase Points)";
      }
   }

}