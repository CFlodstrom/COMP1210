/** hello. */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
/** hello.
*@param customerNameIn - used 
*@param interestRateIn - used
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
 /** hello.
 *@return loansCreated - used
  */  
   public static int getLoansCreated() {
      return loansCreated;
   }
 /** hello.
  
  */  
   public static void resetLoansCreated() {
      loansCreated = 0;
   } 
 /** hello.
  *@param amount - used
  *@return amount - used
   */  
   public static boolean isAmountValid(double amount) {
      return amount >= 0;   
   }
/** hello.
*@return true
*@param loan 
*/
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
  /** hello.
  *@return wasLoanMade -used
  *@param amount -used
   */ 
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/** hello.
*@return 0 - used
*@param amountPaid - used
 */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
  /** hello.
  *@return balance -used
   */ 
   public double getBalance() {
      return balance;
   }
/** hello.
*@param interestRateIn - used
*@return true -used
 */   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
  /** hello. 
  *@return interestRate - used
  */ 
   public double getInterestRate() {
      return interestRate;
   }
   /** hello. */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
  /** hello.
  *@return output - used
   */ 
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
