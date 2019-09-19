import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** This is the app for the icosahedron.
   * program. The user will input the filename
   * that was downloaded and it will print
   * the result from the other classes in the project.
   * @author Chris Flodstrom
   * Project 6
   * @version 11 Oct 2018
*/

public class IcosahedronListApp {
    
    /** the driver side of user info.
    *@param args - used
    *@throws FileNotFoundException - used
    */
   public static void main(String[] args) throws FileNotFoundException {
      
      String name = "";
      String label = "";
      String color = "";
      double edge = 0;
      
     //array list for icosahedron
      ArrayList<Icosahedron> list = new ArrayList<Icosahedron>();
     //new scanner to read user input
      Scanner scan = new Scanner(System.in);
   
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
     
      Scanner scanFile = new Scanner(new File(fileName));
      name = scanFile.nextLine();
      //while loop that scans the file from other class
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();     
         edge = Double.parseDouble(scanFile.nextLine());
         
         Icosahedron newIcos = new Icosahedron(label, color, edge);
         list.add(newIcos); 
      }
     //prints icosahedron program and the summary of objects
      IcosahedronList listIcos = new IcosahedronList(name, list);
      System.out.println();
      System.out.println(listIcos);
      System.out.println();
      System.out.println(listIcos.summaryInfo());   
              
   }
}