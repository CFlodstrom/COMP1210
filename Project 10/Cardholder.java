import java.util.Arrays;
import java.text.DecimalFormat;

/** This is an abstract class from which other cardholder classes are.
 * derived. This has methods and fields in which other classes derive
 * from.
 *Project 10
 *@author Chris Flodstrom
 *@version 11/9/2018
 */
public abstract class Cardholder implements Comparable<Cardholder> {

    //fields
   protected String category;
   protected String acctNumber;
   protected String name;
   protected double prevBalance;
   protected double payment;
   protected double[] purchases;
   static final double INTEREST_RATE = 0.01;


   /**
    * constructor for the CardHolder class that has the account.
    * number and name on the account. 
    * @param acctNumberIn - used
    * @param nameIn -used
    */
   public Cardholder(String acctNumberIn, String nameIn) {
      setAcctNumber(acctNumberIn);
      name = nameIn;
      purchases = new double[0]; 
   }

   /**
    * the getter method for the Account Number in the cardholder class.
    * @return - used
    */
   public String getAcctNumber() {
      return acctNumber;
   }

   /**
    * the setter method for the Account Number in the Cardholder class.
    * @param acctNumberIn - used
    */
   public void setAcctNumber(String acctNumberIn) {
      acctNumber = acctNumberIn;
   }

   /**
    * the getter method for the name on the account in the Cardholder class.
    * @return - used
    */
   public String getName() {
      return name;
   }

   /**
    * the setter method for the name on the account in the Cardholder class.
    * @param nameIn - used
    */
   public void setName(String nameIn) {
      name = nameIn;
   }

   /**
    * gets the previous balance on the account.
    * @return - used
    */
   public double getPrevBalance() {
      return prevBalance;
   }

   /**
    * sets the previous balance on the account in the cardholder class.
    * @param prevBalanceIn -used
    */
   public void setPrevBalance(double prevBalanceIn) {
      prevBalance = prevBalanceIn;  
   }

   /**
    * gets the payment.
    * @return - used
    */
   public double getPayment() {
      return payment;
   }

   /**
    * sets the payment with the payment parameter.
    * @param paymentIn - used
    */
   public void setPayment(double paymentIn) {
      payment = paymentIn;
   }

   /**
    * gets the purchases array in the Cardholder class.
    * @return - used
    */
   public double[] getPurchases() {
      return purchases;
   }

   /**
    * sets the purchases array.
    * @param purchases1 - used
    */
   public void setPurchases(double[] purchases1) {
      purchases = purchases1;
   }

   /**
    * adds the purchases so length of the array reflects the number.
    * of values in the array
    * @param purchases2 - used
    */
   public void addPurchases(double... purchases2) {
      
      for (double i: purchases2) {
         purchases = Arrays.copyOf(purchases, purchases.length + 1);
         purchases[purchases.length - 1] = i;
      }
   }

   /**
    * deletes purchases which has a length one less than the previous array.
    * so that the length of the array reflects the number of values in the array
    * @param purchases3 - used
    */
   public void deletePurchases(double... purchases3) {
      int index;
      for (double j: purchases3) {
         index = -1;
         for (int k = 0; k < purchases.length; k++) {
            if (purchases[k] == j) {
               index = k;
               break;
            }
         }
         if (index != -1) {
            for (int l = index; l < purchases.length - 1; l++)
            {
               purchases[l] = purchases [l + 1];
            }
            purchases = Arrays.copyOf(purchases, purchases.length - 1);
         }
         
         
      }
   }

   /**
    * calculates the interest to be used throughout the classes.
    * @return - used
    */
   public double interest() {
      return (prevBalance - payment) * INTEREST_RATE;
   }

   /**
    * total purchases that represent the sum of the purchases array.
    * @return - used
    */
   public double totalPurchases() {
      double pur = 0;
      for (double pur1: purchases) {
         pur += pur1;
      } 
      return pur;
   }

   /**
    * returns the current balance after previous balance and interest.
    * plus the total purchase
    * @return - used
    */
   public double balance() {
      return prevBalance + interest() + totalPurchases();
   }

   /**
    * the current balance is calculated by subtracting the previous balance.
    * from the payment + interest + total purchases.
    * @return - used
    */
   public double currentBalance() {
      return prevBalance - payment + interest() + totalPurchases();
         
   }

   /**
    * represents the minimum payment due for the credit card.
    * @return - used
    */
   public double minPayment() {
      return currentBalance() * .03;
   }

   /**
    * reflects the purchasePoints accrewed. 1 point is equivalent to.
    * one dollar spent.
    * @return - used
    */
   public int purchasePoints() {
      return (int) totalPurchases();
   }

   /**
    * prints the summary of the Cardholder Class.
    * @return - used
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
         + "Purchase Points: " + fmt1.format(totalPurchases());
   }
   /** this is the compare to method which compares the two names.
   *@return - used
   *@param other - used
   */
   public int compareTo(Cardholder other) {
      return this.getName().compareToIgnoreCase(other.getName());
   }

}
