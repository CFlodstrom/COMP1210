import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *The Sapphire Cardholder test class is derived from the. 
 *cardholder class. This has all of the same methods
 * except the purchasePoints method.
 *Project 11
 *@author Chris Flodstrom
 *@version 11/12/2018
 */

public class SapphireCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** A test that always fails. **/
   @Test public void getAcctNumberTest() {
      SapphireCardholder sc = new SapphireCardholder("0", "Smith, Sam");
      Assert.assertEquals("0", sc.getAcctNumber());
   }
/**
*Tests the set account number method.
*/

   @Test public void setAcctNumberTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      sc.setAcctNumber("10001");
      Assert.assertEquals("10001", sc.getAcctNumber());
   }
/**
*tests the get name method.
*/

   @Test public void getNameTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      Assert.assertEquals("none", sc.getName());
   }
/**
*tests the set name method.
*/

   @Test public void setNameTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      sc.setName("Smith, Sam");
      Assert.assertEquals("Smith, Sam", sc.getName());
   }
/**
*tests the previous balance method.
*/
   @Test public void prevBalanceTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      sc.setPrevBalance(1200);
      Assert.assertEquals(1200, 1200, sc.getPrevBalance());
   }
/**
*Tests the payment methods.
*/
 
   @Test public void paymentTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      sc.setPayment(1200);
      Assert.assertEquals(1200, 1200, sc.getPayment());
   }
/**
*
*/
 
   @Test public void purchasesTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      double[] pur = {0, 1, 2, 3};
      sc.setPurchases(pur);
      Assert.assertArrayEquals(pur, sc.getPurchases(), 0.00001);
   }
/**
*tests that add purchase method.
*/

   @Test public void addPurchaseTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      double[] pur = {0, 1, 2, 3};
      sc.addPurchases(0, 1, 2, 3);
      Assert.assertArrayEquals(pur, sc.getPurchases(), 0.0001);
   }
   
/**
* tests the delete purchase method.
*/
   @Test public void deletePurchaseTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      double[] pur = {0, 1, 2, 4};
      sc.addPurchases(0, 1, 2, 3, 4);
      sc.deletePurchases(3, 5);
      Assert.assertArrayEquals(pur, sc.getPurchases(), 0.0001);
   }
   
/**
*tests the total purchases method.
*/
   @Test public void totalPurchasesTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      sc.addPurchases(1400);
      Assert.assertEquals(1400, 0, sc.totalPurchases());
   }

/**
* tests the balance method test.
*/
   @Test public void balanceTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      sc.addPurchases(100);
      Assert.assertEquals(100, sc.balance(), 0.0001);
   }  
   
/**
*tests the purchase points method test.
*/
   @Test public void purchasePointsTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "none");
      sc.addPurchases(10);
      Assert.assertEquals(10, sc.purchasePoints());
   }
   
   
/**
*tests the toString method.
*/
   @Test public void toStringTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      Assert.assertEquals("Sapphire Cardholder" + "\n" 
                           + "AcctNo/Name: 10001 Smith, Sam" + "\n"
                           + "Previous Balance: $0.00" + "\n"
                           + "Payment: ($0.00)" + "\n" 
                           + "Interest: $0.00" + "\n" 
                           + "New Purchases: $0.00" + "\n" 
                           + "Current Balance: $0.00" + "\n"
                           + "Minimum Payment: $0.00" + "\n"
                           + "Purchase Points: 0", sc.toString());
   }
   
   
}
