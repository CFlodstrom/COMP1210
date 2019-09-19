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
	  	double num = 0;     
	  	
       //User is asked to enter value they want computed 
	  	System.out.print("Enter a value for x: ");
      num = scan.nextDouble();

      double abs = Math.sqrt(Math.abs(((3.9) * (Math.pow(num, 5)))
         - (Math.pow(num, 3)) + (1)));
	  	
       //the given formula   
	   double numerator = (1000 * num) + abs; 
      double denominator = ((1.6) * Math.pow(num, 2)) + (2.7 * num) + (3.8);
      double answer = (numerator) / (denominator); 
	  	
       //prints out result of formula
      System.out.println("Result: " + answer);
       
	  	
       //Finds answer in correct decimal format
 	  	String variable = Double.toString(answer);
      //names variables for new string
      //w finds where the decimal is
      int w = variable.indexOf('.');
      //l finds the length of the string from 0 to the decimal
      int l = variable.length();
      String left = variable.substring(0, w);
      int leftLength = left.length();
      
      System.out.println("# of characters to left of"
         + " decimal point: " + leftLength);
       
      //Finds the info for the right side of the string 
      String right = variable.substring(w, variable.length() - 1);
      int rightLength = right.length(); 
      
      System.out.println("# of characters to right of"
         + " decimal point: " + rightLength);
       
       //puts the result into a 5 digit from the decimal rounded number
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");  
      
      System.out.println("Formatted Result: " + fmt.format(answer));

   
   }
 	  	  	
}