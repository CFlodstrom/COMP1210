import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/** This class provides the following methods in order to read.
 *in the given data files and format them in three different 
 *orders which prioritizes the name, balance, and natural info.
 *Project 11
 *@author Chris Flodstrom
 *@version 11/30/2018
 */
public class CardholderProcessor {

   private Cardholder[] objarr;
   private String[] invalidrec;

   /** This constructor initializes the cardholder and string array.
   * to length 0.
   */
   public CardholderProcessor() {
      objarr = new Cardholder[0];
      invalidrec = new String[0];
   
   }

   /** this method returns a cardholder array field.
   *@return objarr - used.
   */
   public Cardholder[] getCardholdersArray() {
      return objarr;
   }
   /** this method returns a string array for the invalid records field.
   *@return invalid rec - used.
   */
   public String[] getInvalidRecordsArray() {
      return invalidrec;
   }
   /** this method accepts a cardholder object and increases the capacity.
   *of the invalidRecords array by one.
   *@param object - used
   */
   public void addCardholder(Cardholder object) {
      int prevCnt = objarr.length;
      objarr = Arrays.copyOf(objarr, prevCnt + 1);
      objarr [prevCnt] = object;   
   }
   /** this method accepts a String and increases the capacity of.
   *the invalidRecords array by one.
   *@param invalidrecIn - used.
   */
   public void addInvalidRecord(String invalidrecIn) {
      int prevCnt = invalidrec.length;
      invalidrec = Arrays.copyOf(invalidrec, prevCnt + 1);
      invalidrec [prevCnt] = invalidrecIn;
   }
   /** this method accepts the data file name as a String and throws a File Not.
   *Found exception. It also creates a scanner object to scan one line at a
   *time.for each line read, the appropriate Cardholder object is created and
   *added to the Cardholder array field.
   *@param file - used
   *@throws FileNotFoundException - used
   */ 
   public void readCardholderFile(String file) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(file));
      int tempcategoryNum;
      String tempacctNum;
      String tempName;
      double tempprevBalance;
      double tempPayment;
      double tempPurchase;
      Cardholder temporaryCard;
         
      while (scanFile.hasNext()) {
         String listname = scanFile.nextLine();
         Scanner scan = new Scanner(listname).useDelimiter(";");
         tempcategoryNum = scan.nextInt();
         tempacctNum = scan.next();
         tempName = scan.next();
         try {   
            if (tempcategoryNum == 1) {
               temporaryCard = new SapphireCardholder(tempacctNum, tempName);
               tempprevBalance = Double.parseDouble(scan.next());
               temporaryCard.setPrevBalance(tempprevBalance);
               tempPayment = Double.parseDouble(scan.next());
               temporaryCard.setPayment(tempPayment);
            
               while (scan.hasNext()) {
                  tempPurchase = Double.parseDouble(scan.next());
                  temporaryCard.addPurchases(tempPurchase);
               }
            
               addCardholder(temporaryCard);
            }
            
            else if (tempcategoryNum == 2) {
               temporaryCard = new DiamondCardholder(tempacctNum, tempName);
               tempprevBalance = Double.parseDouble(scan.next());
               temporaryCard.setPrevBalance(tempprevBalance);
               tempPayment = Double.parseDouble(scan.next());
               temporaryCard.setPayment(tempPayment);
               
               while (scan.hasNext()) {
                  tempPurchase = Double.parseDouble(scan.next());
                  temporaryCard.addPurchases(tempPurchase);
               }
            
               addCardholder(temporaryCard);
            }
            
            else if (tempcategoryNum == 3) {
               temporaryCard = new BlueDiamondCardholder(tempacctNum, tempName);
               tempprevBalance = Double.parseDouble(scan.next());
               temporaryCard.setPrevBalance(tempprevBalance);
               tempPayment = Double.parseDouble(scan.next());
               temporaryCard.setPayment(tempPayment);
            
               while (scan.hasNext()) {
                  tempPurchase = Double.parseDouble(scan.next());
                  temporaryCard.addPurchases(tempPurchase);
               }
            
               addCardholder(temporaryCard);
            }
            
            else {
               throw new InvalidCategoryException();
            }
         }  
         catch (InvalidCategoryException invcat) {
            addInvalidRecord(listname + " " + invcat.
                     getMessage()); //.getmessage
                           
         }
          
         catch (NumberFormatException numfor) {
            addInvalidRecord(listname 
               + " *** invalid numeric value ***"); //.getmessage
         }           
      
      }
        
   }
   
   /** this method processes the array using the original order in the file.
    * which then returns the specific string
    *@return values - used.
    */
   public String generateReport() {
      String values = "----------------------------"
         + "\nMonthly Cardholder Report"
         + "\n----------------------------";
      
      for (int j = 0; j < objarr.length; j++) {
         values += "\n" + objarr[j].toString() + "\n";
      }
         
      return values + "\n";
   }
   /** this method sorts the cardholder array by the natural ordering.
   *in order to generate the monthly rewards club reprot as a string.
   *@return values - used
   */
   public String generateReportByName() {
      String values = "--------------------------------------"
                     + "\nMonthly Cardholder Report (by Name)"
                     + "\n--------------------------------------";
      Arrays.sort(objarr);
      for (Cardholder individual:objarr) { 
         values += "\n" + individual.toString() + "\n";
      }
      return values + "\n";
                  
   }
   /** this method returns the cardholder monthly report by the.
   *current balance and returns the given report as a String.
   *@return values - used
   */
   public String generateReportByCurrentBalance() {
      String values = "---------------------------------------"
                     + "\nMonthly Cardholder Report (by Current Balance)"
                     + "\n---------------------------------------";
      Arrays.sort(objarr, new CurrentBalanceComparator());
      for (Cardholder individual:objarr) {
         values += "\n" + individual.toString() + "\n";
         
      }
      return values + "\n";
   }
   /** this method will generate the invalid record report.
   * ordering for the cardholder records class.
   *@return values -used
   */
   public String generateInvalidRecordsReport() {
      String values = "-----------------------"
         + "\nInvalid Records Report"
         + "\n-----------------------";
        
      for (String individual:invalidrec) {
         values += "\n" + individual.toString() + "\n";
         
      }
      return values + "\n";
   }
         
 

}