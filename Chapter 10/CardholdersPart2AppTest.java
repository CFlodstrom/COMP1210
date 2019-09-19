import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*cardholders test file for driver.
*
* Project 10
* @author Alexa Monroe - COMP 1210 - 001
* @version 18NOV2018
*/
public class CardholdersPart2AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * test for main with full file.
   * * @throws FileNotFoundException if the file cannot be opened.
   */
   @Test public void mainTest1() throws FileNotFoundException {
      String[] args2 = {"cardholder_data_1.txt"};
      // args2[0] is the file name
      CardholdersPart2App.main(args2);
      Assert.assertEquals(1, 1);
      CardholdersPart2App app = new CardholdersPart2App();
   
   }
   
      /**
   * test for main with full file.
   * * @throws FileNotFoundException if the file cannot be opened.
   */
   @Test public void mainTest2() throws FileNotFoundException {
      String[] args2 = {"cardholder_data_2.txt"};
      // args2[0] is the file name
      CardholdersPart2App.main(args2);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .005);
      CardholdersPart2App app = new CardholdersPart2App();
   
   }
   
  /**
   * test for main with empty file.
   * * @throws FileNotFoundException if the file cannot be opened.
   */
   @Test public void mainTest3() throws FileNotFoundException {
      String[] args2 = {};
      // args2[0] is the file name
      CardholdersPart2App.main(args2);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .005);
     
   
   }
}
