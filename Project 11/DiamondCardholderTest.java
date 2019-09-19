import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *The Diamond Cardholder test class is derived from the. 
 *cardholder class. This has all of the same methods
 * except the purchasePoints method.
 *Project 11 
 *@author Chris Flodstrom
 *@version 11/30/2018
 */

public class DiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getAcctNumberTest() {
      DiamondCardholder dc = new DiamondCardholder("10001", "Smith, Sam");
      Assert.assertEquals("10001", dc.getAcctNumber());
   }
   
/**.
* tests the set account number test.
*/
   @Test public void setAcctNumberTest() {
      DiamondCardholder dc = new DiamondCardholder("10001", "Smith, Sam");
      dc.setAcctNumber("10001");
      Assert.assertEquals("10001", dc.getAcctNumber());
   }
   
/**.
* tests the get name method test.
*/
   @Test public void getNameTest() {
      DiamondCardholder dc = new DiamondCardholder("10001", "Smith, Sam");
      Assert.assertEquals("Smith, Sam", dc.getName());
   }
   
/**.
* tests the set name method test
*/
   @Test public void setNameTest() {
      DiamondCardholder dc = new DiamondCardholder("10001", "none");
      dc.setName("Smith, Sam");
      Assert.assertEquals("Smith, Sam", dc.getName());
   }
   
/**.
* tests the set discount rate method test.
*/
   @Test public void setDiscountRateTest() {
      DiamondCardholder dc = new DiamondCardholder("10001", "none");
      dc.setDiscountRate(0.5);
      Assert.assertEquals(.5, dc.getDiscountRate(), 0.0001);
   }

/**.
* tests the total purchases method test.
*/
   @Test public void totalPurchaseTest() {
      DiamondCardholder dc = new DiamondCardholder("10001", "none");
      double[] pur = {0, 1, 2, 3, 4, 5, 6, 7};
      dc.addPurchases(0, 1, 2, 3, 4, 5, 6, 7);
      Assert.assertArrayEquals(pur, dc.getPurchases(), 0.0001);
   }
   
/**.
* tests the toString method test.
*/
   @Test public void toStringTest() {
      DiamondCardholder dc = new DiamondCardholder("10001", "Smith, Sam");
      Assert.assertEquals("Diamond Cardholder" + "\n" 
                           + "AcctNo/Name: 10001 Smith, Sam" + "\n"
                           + "Previous Balance: $0.00" + "\n"
                           + "Payment: ($0.00)" + "\n" 
                           + "Interest: $0.00" + "\n" 
                           + "New Purchases: $0.00" + "\n" 
                           + "Current Balance: $0.00" + "\n"
                           + "Minimum Payment: $0.00" + "\n"
                           + "Purchase Points: 0" + "\n"
                           + " (includes 5.0% discount rate"
                           + " applied to New Purchases)", dc.toString());
   }

}