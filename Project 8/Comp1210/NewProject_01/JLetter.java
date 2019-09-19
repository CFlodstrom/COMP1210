/** 
 * Prints the letter "J" with  a large block letter with the word "JAVA" with a width of 12 characters and a height of 10 lines 
 * @author Chris Flodstrom
 * @version 8/29/2018
 */
 
public class JLetter 
{

   /**
    * Prints course information to std output.
    * @param args Command line arguments (not used).
    */
  
  
  
   public static void main(String[] args) {
   
      //first two lines of "JAVA" block lettering
      System.out.println("JAVAJAVAJAVA");
      System.out.println("JAVAJAVAJAVA");
      
      //lists line 3-6 lettering of "JAVA"
      System.out.println("      JAVA");
      System.out.println("      JAVA");
      System.out.println("      JAVA");
      System.out.println("      JAVA");
      
      //lists line 7 of JAVA block lettering
      System.out.println("J     JAVA");

      //lists line 8 of JAVA block lettering
      System.out.println("JA    JAVA");
      
      //lists line 9 of JAVA block lettering
      System.out.println(" JAVAJAVA");
      
      //lists line 10 of JAVA block lettering
      System.out.println("  JAVAJA");

   }
}