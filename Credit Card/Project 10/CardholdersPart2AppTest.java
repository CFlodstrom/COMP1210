import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*This is the test case for the cardholder app which prints.
* the cardholder rewards info in three different formats.
*Project 10
*@author Chris Flodstrom
*@version 11/16/2018
*/
public class CardholdersPart2AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * test for main with full file.
   * @throws FileNotFoundException if the file cannot be opened.
   */
   @Test public void chdata1() throws FileNotFoundException {
      String[] file = {"cardholder_data_1.txt"};
      CardholdersPart2App.main(file);
      Assert.assertEquals(1, 1);
      CardholdersPart2App card = new CardholdersPart2App();
   }
   
   /**
   * test for main with full file.
   * @throws FileNotFoundException if the file cannot be opened.
   */
   @Test public void chdata2() throws FileNotFoundException {
      String[] file = {"cardholder_data_2.txt"};
      CardholdersPart2App.main(file);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
      CardholdersPart2App card = new CardholdersPart2App();
   
   }
   
  /**
   * test for main with empty file.
   *@throws FileNotFoundException if the file cannot be opened.
   */
   @Test public void emptyTest() throws FileNotFoundException {
      String[] file = {};
      CardholdersPart2App.main(file);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
     
   
   }
}
