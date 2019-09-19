import java.util.Comparator;

/** This class implements the comparator interface for the cardholder.
 *objects. This defines the ordering from the highest balance to lowest.
 *based on the current balance.
 *Project 10
 *@author Chris Flodstrom
 *@version 11/9/2018
 */
public class CurrentBalanceComparator implements Comparator<Cardholder> {

   /** this main method accepts a file as a command line argument.
   *and invokes the method to read the file and process the records
   *which prints the three different reports shown in the app.
   *@param card1 - used
   *@param card2 - used
   *@return - used
   */
   public int compare(Cardholder card1, Cardholder card2) {
      if (card1.currentBalance() < card2.currentBalance()) {
         return 1;
      }
         
      else if (card1.currentBalance() > card2.currentBalance()) {
         return -1;
      }
         
      else {
         return 0;
      }
      
   
   }
}