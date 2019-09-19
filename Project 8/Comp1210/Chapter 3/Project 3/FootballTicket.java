import  java.util.Scanner;
import java.text.DecimalFormat;

 /** 	
    *This program takes football ticket information.
    *into a program that lists the price of the ticket,	
    *category, time, date, seat, row, and section. 
    *Followed by the discount price.
    *@author Chris Flodstrom
    *@version 13Sep2018
 */
  	
public class FootballTicket  	
{ 
  	static final double STUDENT_DISCOUNT = 0.67;
   static final double FACULTY_STAFF_DISCOUNT = 0.20;
 /**	
     * After the ticket info is inputted, the.
     * program will display the complete info
     * about the football game on the ticket
     * based off the order of numbers on the ticket.
     *
     * @param args Command line arguments (not used).
     */
     
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
	   String input = "";

     //All of the variables used throughout the program  
      char cat = 'n'; //category
      double pce = 0; //price
      double cst = 0; //cost

       //Strings
      String priceString = "";
      String t = ""; //time
      String d = ""; //date
      String s = ""; //seat
      String r = ""; //row
      String sec = ""; //section
      String game = ""; //game

    //Decimal format for how pricing should be       
      DecimalFormat pceformat = new DecimalFormat("$##0.00");

    //Prompts user to enter code for football ticket    
      System.out.print("Enter your ticket code: ");
      input = scan.nextLine();
      input = input.trim();

    //Will say it cannot read if not enough characters
      if (input.length() < 25) {
         System.out.println("");
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 25 characters.");
      }

       /**If the statement passes the test, the following will
        *execute
        */
      else if (input.length() > 25) {
          //first letter in input lists category
         cat = input.charAt(0);
          //the price is given from line 1-6 
         priceString = input.substring(1, 6);
          //Divides the listed price by 100 for dollar value
         pce = (Double.parseDouble(priceString)) / 100.00;

         if (cat == 's') {
            cst = pce - pce * STUDENT_DISCOUNT;
         }
         else if (cat == 'f') { 
            cst = pce - pce * FACULTY_STAFF_DISCOUNT;
         }
         else if (cat == 'r') { 
            cst = pce;
         }
         else { 
            System.out.print("Invalid Ticket Code");
            System.exit(0);
         }

       /*
       * The numbers in the parenthesis represent
       * where the numbers on the ticket represent
       * the given category.
       */
         t = input.substring(6, 10); //time
 	  	   d = input.substring(10, 18); //date
 	  	   s = input.substring(18, 20); //seat
 	  	   r = input.substring(20, 22); //row
 	  	   sec = input.substring(22, 24); //section

         if (sec.charAt(0) == '0') {
            sec = sec.substring(1, 2);
         }
         game = input.substring(24); 
 	  	
      /*
      * prints the program so the user can see the broken down
      * categories on the ticket number
      */
         System.out.println("");
         System.out.print("Game: " + game +    "   Date: "
            + d.substring(0, 2)
            + "/" + d.substring(2, 4) + "/" + d.substring(4, 8));
             
             
         System.out.println("   Time: " + t.substring(0, 2) + ":" 
            + t.substring(2, 4));
	  	
         System.out.println("Section: " + sec + "   Row: " + r
            + "   Seat: " + s);
	  	
         System.out.println("Price: " + pceformat.format(pce)
            + "   Category: " + cat + "   Cost: " 
            + pceformat.format(cst));
 	  
         System.out.println("Prize Number: " 
            + (int) (Math.random() * 10000000));
	  	
      }
   }	
}