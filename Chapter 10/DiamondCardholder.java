import java.text.DecimalFormat;
/**
 *The Diamond Cardholder class is a class derived from the. 
 *cardholder class.
 *@author Chris Flodstrom
 *@version 11/12/2018
 */
public class DiamondCardholder extends Cardholder {



   protected double discountRate = .05;


/**
   *This is the constructor from which the Cardholder methods.
   * are brought over from the other class
   *@param acctNumberIn - used
   *@param nameIn - used
   */

   public DiamondCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Diamond Cardholder";
   }
   
   

/**
*The getDiscount Rate method adjusts the discount rate. 
* for the diamond card holders. It is 5%.
*@return - used
*/

   public double getDiscountRate() {
      return discountRate;
   }
   
/**
* the set discount rate sets the discount rate at 5%.
*@param discountRateIn - used
*/

   public void setDiscountRate(double discountRateIn) {
      discountRate = discountRateIn;
   }
   
/**
* this method adjusts the purchase points to make every.
* dollar spent equate to three bonus points.
*@return - used
*/
   public int purchasePoints() {
      return (int) totalPurchases() * 3;
   } 
   
/**
*This finds the total purchase price by subtracting.
* the price from the price times the discount rate.
*@return - used
*/
   public double totalPurchases() {
      double pur = 0;
      for (double pur1: purchases) {
         pur += pur1;
      } 
      return (pur) - (pur * discountRate);
   }
   
/**
* The toString method prints out the same things.
* that it did in the cardholder class, but it also
*adds the line that tells customers they saved 5% on discounts.
*@return - used
*/
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt1 = new DecimalFormat("#,##0");
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
}