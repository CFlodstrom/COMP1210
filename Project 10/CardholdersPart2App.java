import java.io.FileNotFoundException;
   
 /** This class has the main method for running the overall
 *cardholder program.
 *Project 10
 *@author Chris Flodstrom
 *@version 11/9/2018
 */
public class CardholdersPart2App {

   /** this is the main method that accepts a file as a command line.
   *argument and creates a cardholder processor object and invokes
   *the method to read the file and generate the three different 
   *formats to be printed in the app.
   *@param args - not used
   *@throws FileNotFoundException - used
   */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length != 0) {
         CardholderProcessor cardholderprocessor = new CardholderProcessor();
         cardholderprocessor.readCardholderFile(args[0]);
         System.out.println(cardholderprocessor.generateReport());
         System.out.println(cardholderprocessor.generateReportByName());
         System.out.println(cardholderprocessor.
                     generateReportByCurrentBalance());
         return;
      }
   
      System.out.println("File name expected as command line argument.");
      System.out.println("Program ending.");
   }

}