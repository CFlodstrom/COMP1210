import java.io.FileNotFoundException;

public class CardholdersPart2App {

   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
         return;
      }
   
      CardholderProcessor cardholderprocessor = new CardholderProcessor();
      cardholderprocessor.readCardholderFile(args[0]);
      System.out.println(cardholderprocessor.generateReport());
      System.out.println(cardholderprocessor.generateReportByName());
      System.out.println(cardholderprocessor.generateReportByCurrentBalance());
   }

}