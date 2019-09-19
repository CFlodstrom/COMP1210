import java.util.Scanner;

/** Chris Flodstrom.
*version 17 Sep 2018
*/
public class IcosahedronApp {
    
    /** the driver side of user info.
    *@param args - used
    */
   public static void main(String[] args) {
   
   Scanner scan = new Scanner(System.in);
   String Address = "";
      
             
      System.out.println("Enter label, color, and edge length for an icosahedron.");
            
      System.out.print("\tlabel: ");
      String label = scan.nextLine();
            
      System.out.print("\tcolor: ");
     String color = scan.nextLine();
      
      System.out.print("\tedge: ");
     double edge = Double.parseDouble(scan.nextLine());
      
         if(edge <= 0) {
         System.out.println("Error: edge must be greater than 0.");
         }
         else if(edge > 0) {
             Icosahedron user1 = new Icosahedron(label, color, edge);
             System.out.println("\n" + user1);
             }
      
      
      
 }
}