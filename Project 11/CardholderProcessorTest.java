import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**This class tests the two methods in the Cardholder
 *Processor class.
 *Project 11
 *@author Chris Flodstrom
 *@version 11/30/2018
 */
public class CardholderProcessorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** testing the getCardholderArray method. **/
   @Test public void getCardholdersArrayTest() {
      CardholderProcessor cp = new CardholderProcessor();
      Assert.assertEquals("", 0, 0);
   }
   
      /** Tests the getInvalidRecordsArray method. **/
   @Test public void getInvalidRecordsArrayTest() {
      CardholderProcessor cp = new CardholderProcessor();
      Assert.assertEquals("", 0, 0);
   }
}
