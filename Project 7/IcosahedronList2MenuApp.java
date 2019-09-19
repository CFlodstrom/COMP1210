import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
* This program gives eight options for a user to evaluate an icosahedron.
* list file
* Project 6
* @author Chris Flodstrom 
* @version 17 Oct 2018
*/
public class IcosahedronList2MenuApp
{

/**
* the list menu app will allow user to edit Icosahedron info
* after importing a java data file.
* @param args not used.
* @throws FileNotFoundException - used
*/
   public static void main(String[] args) throws FileNotFoundException
   {
   
      String fileName = "no file name";
      char choice = 'Q'; 
      String label = "";
      String color = "";
      double edge = 0.0;
      String icosahedronListName = "*** no listname assigned ***";
      
      ArrayList<Icosahedron> noIcosahedron = new ArrayList<Icosahedron>();
      IcosahedronList2 noIcosahedronList = new IcosahedronList2(
            icosahedronListName, noIcosahedron);
   
            
      String input = "";
      Scanner scan = new Scanner(System.in);
      
   // Prints options for user to choose 
      System.out.println("Icosahedron List System Menu"
         + "\nR - Read File and Create Icosahedron List"
         + "\nP - Print Icosahedron List"
         + "\nS - Print Summary"
         + "\nA - Add Icosahedron"
         + "\nD - Delete Icosahedron"
         + "\nF - Find Icosahedron"
         + "\nE - Edit Icosahedron"
         + "\nQ - Quit");
      
         
      do
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = scan.nextLine().toUpperCase(); //reads choice user makes
         choice = input.charAt(0);
         
         //Switch routes the user choice to the list file
         switch (choice)
         {
            case 'R': //reads the file
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               
               noIcosahedronList = noIcosahedronList.readFile(fileName);
               
               System.out.println("\tFile read in and " + "Icosahedron" 
                              + " List created\n");
                              
               break;
               
            case 'P'://prints the file
               System.out.println(noIcosahedronList.toString());
               break;
               
            case 'S'://prints a summary of the file
               System.out.println("");
               System.out.println(noIcosahedronList.summaryInfo());
               System.out.println("");
               break;
               
            case 'A': //adds icosahedron to list
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
                  
               noIcosahedronList.addIcosahedron(label, color, edge);
               System.out.println("\t*** Icosahedron added ***\n");
            
               break;
               
            case 'D': //deletes icosahedron from list
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (noIcosahedronList.findIcosahedron(label) != null)
               {
                  label = noIcosahedronList.findIcosahedron(label).getLabel();
                  noIcosahedronList.deleteIcosahedron(label);
                  System.out.println("\t\"" + label
                     + "\" deleted\n");
               }
               else
               {
                  System.out.println("\t\""
                     + label + "\" not found\n");
               }
            
               break;
               
            case 'F':// finds the icosahedron
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (noIcosahedronList.findIcosahedron(label) != null)
               {
                  System.out.print(noIcosahedronList.findIcosahedron(label)
                     + "\n");
                  System.out.print("\n");
               }
               else
               {
                  System.out.println("\t\""
                     + label + "\" not found\n");
               }
               break;
               
            case 'E': //edits the icosahedron
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               System.out.print("\tColor: ");
               color = scan.nextLine();
               
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               Icosahedron i = noIcosahedronList.findIcosahedron(label);
               if (i != null) {
                  noIcosahedronList.editIcosahedron(label, color, edge);
                  System.out.println("\t\"" + label
                     + "\" successfully edited\n");
               }
                  
               else
               {
                  System.out.println("\t\"" + label
                     + "\" not found\n");
               }
               break;
               
            case 'Q'://quits the app
               break;
               
            default:
               System.out.println("\t*** invalid code ***");
               System.out.println("");
               break;
         }
      
      }
      while (!input.equalsIgnoreCase("Q"));
      
      
   }
}