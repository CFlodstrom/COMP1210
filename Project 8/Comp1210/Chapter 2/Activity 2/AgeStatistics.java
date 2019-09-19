import java.util.Scanner;

/**  
 * @author Chris Flodstrom
 * @version 09/05/18
 */
 
public  class AgeStatistics {

/**
    * Displays info about someone's name, age, and gender,
    *along with calculations for age in minutes and centuries
    *as well as max heart rate based on age and gender.
    * @param args Command line arguments (not used).
    */
   
   public static void main(String[] args) {
   
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
        //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age in minutes:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      //convert age in centuries\
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      //display max heart rate
      System.out.print("Your max heart rate is ");
         
      if (gender == 1) { //calculate MHR
         System.out.print(maxHeartRate + 209 - (0.7 * ageInYears));
      
         
      }
      else { //calculate male MHR
         System.out.print(maxHeartRate + 214 - (0.8 * ageInYears));  
      }
      System.out.print(" beats per minute.");
         
   }   
      
   
}