  	
 import java.util.Scanner;  	
 import java.text.DecimalFormat; 		
 /** 
 * This program will compute an entered value through an equation	  	
 * to find teh result, # of entered characters from	  	
 * the left and right side, as well as format the number  	
 * to fit the given value
 *	  	
 *@author Chris Flodstrom
 *@version 9/13/2018
 */
  	
 public  class FormulaEval
	  	
 {
	  	
/**	  	
  * The user will enter the number
  * that needs to be computed below
  *
  * @param args Command line arguments (not used).
  */
 public static void main(String[] args)
	  	
    {
	  	
       Scanner scan = new Scanner(System.in);
	  	 String input = ""; 
	  	 double num;     
	  	 double answer, answer1, answer2, finalanswer;

       //User is asked to enter value they want computed 
	  	
       System.out.print("Enter a value for x: ");
       num = scan.nextDouble();

       double pow = Math.pow(3.9 * num, 5);
       double pow1 = Math.pow(1 * num, 3);
       double pow2 = Math.pow(1.6 * num, 2);
       double abs = Math.abs(pow - pow1 + 1);

	  	
       //the given formula   
	  	
       answer = (1000 * num);
       answer1 = Math.sqrt(abs);
       answer2 = (Math.pow(1.6 * num, 2)) + 2.7 * num + 3.8;
       finalanswer = ((answer + answer1) / answer2);
	  	
       //prints out result of formula
       System.out.println("Result: " + finalanswer);
	  	
       //Finds answer in correct decimal format
 	  	
       System.out.println("# of characters to the left of decimal point: ");
       System.out.println("# of characters to the right of decimal point: ");
       DecimalFormat fmt = new DecimalFormat("#,##0.0####");  
       System.out.println("Formatted Result: " + fmt.format(finalanswer));

       //System.out.println("\n" + result);

    }
 	  	  	
 }