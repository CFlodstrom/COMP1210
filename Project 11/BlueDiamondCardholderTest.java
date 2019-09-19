import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *The Blue Diamond Cardholder class is derived from the. 
 *diamond cardholder class. This has all of the same methods
 * except the purchasePoints method.
 *Project 11
 *@author Chris Flodstrom
 *@version 11/30/2018
 */
public class BlueDiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


        /** A test that always fails. **/
   @Test public void getAcctNumberTest() {
      BlueDiamondCardholder bd = new BlueDiamondCardholder("0", "King, Kelly");
      Assert.assertEquals("0", bd.getAcctNumber());
   }
/**
*tests the set account number method.
*/

   @Test public void setAcctNumberTest() {
      BlueDiamondCardholder bd = new BlueDiamondCardholder("10003",
                                                    "King, Kelly");
      bd.setAcctNumber("10003");
      Assert.assertEquals("10003", bd.getAcctNumber());
   }
/**
*tests the get name method test.
*/

   @Test public void getNameTest() {
      BlueDiamondCardholder bd = new BlueDiamondCardholder("10003", "none");
      Assert.assertEquals("none", bd.getName());
   }
/**
*tests the set name method test.
*/

   @Test public void setNameTest() {
      BlueDiamondCardholder bd = new BlueDiamondCardholder("10003", "none");
      bd.setName("King, Kelly");
      Assert.assertEquals("King, Kelly", bd.getName());
   }  
   
/**
*tests the set bonus points method test.
*/
   @Test public void setBonusPointTest() {
      BlueDiamondCardholder bd = new BlueDiamondCardholder("10001", "none");
      bd.setBonusPurchasePoints(2500);
      Assert.assertEquals(2500, bd.getBonusPurchasePoints(), 0.0001);
   }   

/**
*tests the toString method test.
*/
   @Test public void toStringTest1() {
      BlueDiamondCardholder bd = new BlueDiamondCardholder(
                                    "10001", "Smith, Sam");
      bd.addPurchases(2000);
      Assert.assertEquals("Blue Diamond Cardholder" + "\n" 
                           + "AcctNo/Name: 10001 Smith, Sam" + "\n"
                           + "Previous Balance: $0.00" + "\n"
                           + "Payment: ($0.00)" + "\n" 
                           + "Interest: $0.00" + "\n" 
                           + "New Purchases: $1,800.00" + "\n" 
                           + "Current Balance: $1,800.00" + "\n"
                           + "Minimum Payment: $54.00" + "\n"
                           + "Purchase Points: 9,000" + "\n"
                           + " (includes 10.0% discount rate"
                           + " applied to New Purchases)", bd.toString());
   }                   
   
   
/**
*tests the method that adds the "includes 2,500 bonus points line. 
*/
   @Test public void toStringTest2() {
      BlueDiamondCardholder bd = new BlueDiamondCardholder(
                                       "10001", "Smith, Sam");
      bd.addPurchases(4000);
      Assert.assertEquals("Blue Diamond Cardholder" + "\n" 
                           + "AcctNo/Name: 10001 Smith, Sam" + "\n"
                           + "Previous Balance: $0.00" + "\n"
                           + "Payment: ($0.00)" + "\n" 
                           + "Interest: $0.00" + "\n" 
                           + "New Purchases: $3,600.00" + "\n" 
                           + "Current Balance: $3,600.00" + "\n"
                           + "Minimum Payment: $108.00" + "\n"
                           + "Purchase Points: 20,500" + "\n"
                           + " (includes 10.0% discount rate"
                           + " applied to New Purchases)" 
                           + "\n"
                           + " (includes 2,500 bonus points added"
                           + " to Purchase Points)", bd.toString());
   }
}