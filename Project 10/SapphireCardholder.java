/**
 *The Sapphire Cardholder class is derived from the. 
 *cardholder class. This has all of the same methods
 * except the purchasePoints method.
 *@author Chris Flodstrom
 *@version 11/16/2018
 */
public class SapphireCardholder extends Cardholder {

/**
*This is the constructor from which the Cardholder methods.
* are brought over from the other class
*@param acctNumberIn - used
*@param nameIn - used
*/
   public SapphireCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Sapphire Cardholder";
   }
   
   
/**
*purchasePoints method that is specific to the Sapphire class.
*@return - used
*/
   public int purchasePoints() {
      int purchase5 = (int) totalPurchases();
      return purchase5;  
   }



}
