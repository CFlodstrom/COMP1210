import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


public class CardholderProcessor {

   private Cardholder[] objarr;
   private String[] invalidrec;


   public CardholderProcessor() {
      objarr = new Cardholder[0];
      invalidrec = new String[0];
   
   }

//methods

   public Cardholder[] getCardholdersArray() {
      return objarr;
   }

   public String[] getInvalidRecordsArray() {
      return invalidrec;
   }

   public void addCardholder(Cardholder object) {
      int prevCnt = objarr.length;
      objarr = Arrays.copyOf(objarr, prevCnt + 1);
      objarr [prevCnt] = object;
      
   }

   public void addInvalidRecord(String invalidrecIn) {
      int prevCnt = invalidrec.length;
      invalidrec = Arrays.copyOf(invalidrec, prevCnt + 1);
      invalidrec [prevCnt] = invalidrecIn;
   }

   public void readCardholderFile(String file) throws FileNotFoundException {
      int tempcategoryNum;
      String tempacctNum;
      String tempName;
      double tempprevBalance;
      double tempPayment;
      double tempPurchase;
      Cardholder temporaryCard;
      Scanner scanFile = new Scanner(new File(file));
         
      while (scanFile.hasNext()) {
         String listname = scanFile.nextLine();
         Scanner scan = new Scanner(listname).useDelimiter(";");
         tempcategoryNum = scan.nextInt();
         tempacctNum = scan.next();
         tempName = scan.next();
         
         if (tempcategoryNum == 1) {
            temporaryCard = new SapphireCardholder(tempacctNum, tempName);
         }
         
         else if (tempcategoryNum == 2) {
            temporaryCard = new DiamondCardholder(tempacctNum, tempName);
         }
         
         else if (tempcategoryNum == 3) {
            temporaryCard = new BlueDiamondCardholder(tempacctNum, tempName);
         }
         
         else {
            addInvalidRecord(listname);
            continue;
         }
         
         tempprevBalance = Double.parseDouble(scan.next());
         temporaryCard.setPrevBalance(tempprevBalance);
         tempPayment = Double.parseDouble(scan.next());
         temporaryCard.setPayment(tempPayment);
         
        
        //change around
         while (scan.hasNext()) {
            tempPurchase = Double.parseDouble(scan.next());
            temporaryCard.addPurchases(tempPurchase);
         }
         //especially this one.
         addCardholder(temporaryCard);
                 
      
      }
        
   }
//change around
   public String generateReport() {
      String values = "----------------------------"
         + "\nMonthly Cardholder Report"
         + "\n----------------------------";
      
      for(int j = 0; j < objarr.length; j++) {
         values += "\n" + objarr[j].toString() + "\n";
      }
         
      return values + "\n";
    
    
   }

   public String generateReportByName() {
      Arrays.sort(objarr);
      String values = "--------------------------------------"
                     + "\nMonthly Cardholder Report (by Name)"
                     + "\n--------------------------------------";
     
      for (Cardholder individual:objarr) { 
         values += "\n" + individual.toString() + "\n";
      }
      return values + "\n";
                  
   }

   public String generateReportByCurrentBalance() {
      Arrays.sort(objarr, new CurrentBalanceComparator());
      String values = "---------------------------------------"
                     + "\nMonthly Cardholder Report (by Current Balance)"
                     + "\n---------------------------------------";
   
      for (Cardholder individual:objarr) {
         values += "\n" + individual.toString() + "\n";
         
      }
      return values + "\n";
   }
   
   


}