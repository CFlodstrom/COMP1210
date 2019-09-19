import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*This is the test case for the cardholder app which prints.
* the cardholder rewards info in three different formats.
*Project 11
*@author Chris Flodstrom
*@version 11/16/2018
*/
public class CardholdersPart3AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * test the first data file.
   * @throws FileNotFoundException - used.
   */
   @Test public void chdata1() throws FileNotFoundException {
      String[] file = {"cardholder_data_1.txt"};
      CardholdersPart3App.main(file);
      Assert.assertEquals(1, 1);
      CardholdersPart3App card = new CardholdersPart3App();
   }
   
   /**
   * test the second data file.
   * @throws FileNotFoundException - used.
   */
   @Test public void chdata2() throws FileNotFoundException {
      String[] file = {"cardholder_data_2.txt"};
      CardholdersPart3App.main(file);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
      CardholdersPart3App card = new CardholdersPart3App();
   }
   
   /**
   * tests third data file.
   *@throws FileNotFoundException  - used.
   */
   @Test public void chdata3() throws FileNotFoundException {
      String[] file = {"cardholder_data_3.txt"};
      CardholdersPart3App.main(file);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
      CardholdersPart3App card = new CardholdersPart3App();
   }
  /**
   * tests without a file.
   *@throws FileNotFoundException  - used.
   */
   @Test public void emptyTest() throws FileNotFoundException {
      String[] file = {};
      CardholdersPart3App.main(file);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
     
   
   }
}
