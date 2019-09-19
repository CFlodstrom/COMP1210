import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** 
   *@author Chris Flodstrom
   *Project 5
   *@version 13Sep2018
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
      ArrayList<Icosahedron> list = new ArrayList<Icosahedron>();
    
      Scanner scan = new Scanner(System.in);
   
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
     
      Scanner scanFile = new Scanner(new File(fileName));
      name = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();     
         edge = Double.parseDouble(scanFile.nextLine());
         
         Icosahedron newIcos = new Icosahedron(label, color, edge);
         list.add(newIcos); 
      }
     
      IcosahedronList listIcos = new IcosahedronList(name, list);
      System.out.println();
      System.out.println(listIcos);
      System.out.println();
      System.out.println(listIcos.summaryInfo());   
              
   }
}