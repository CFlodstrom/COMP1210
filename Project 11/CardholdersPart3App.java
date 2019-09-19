import java.io.FileNotFoundException;
   
 /** This class has the main method for running the overall
 *cardholder program.
 *Project 11
 *@author Chris Flodstrom
 *@version 11/30/2018
 */
public class CardholdersPart3App {

   /** this is the main method that accepts a file as a command line.
   *argument and creates a cardholder processor object and invokes
   *the method to read the file and generate the three different 
   *formats to be printed in the app.
   *@param args - not used
   *@throws FileNotFoundException - used
   */
   public static void main(String[] args) {
      try {
         if (args.length != 0) {
            CardholderProcessor cardholderprocessor = new CardholderProcessor();
            cardholderprocessor.readCardholderFile(args[0]);
            System.out.print(cardholderprocessor.generateReport());
            System.out.print(cardholderprocessor.generateReportByName());
            System.out.print(cardholderprocessor.
                     generateReportByCurrentBalance());
            System.out.print(cardholderprocessor.
                     generateInvalidRecordsReport());
            return;
         }
         else {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         }
      
      }
      
      catch (FileNotFoundException fnf) {
         System.out.println(" *** Attempted to read file: " + args[0]
                           + " (No such file or directory)");
      }
      
   }

}