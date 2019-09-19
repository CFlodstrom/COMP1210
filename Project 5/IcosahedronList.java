import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

 /** 	
    *This program stores the name of the.
    * list and an Array list of Icosahedron
    * objects, and holds the methods that
    *@author Chris Flodstrom
    *Project 5
    *@version 05 Oct 2018
 */
public class IcosahedronList {
//instance variables
   private String listName;
   private ArrayList<Icosahedron> icosahedronObjects;

/** this is the constructor for the IcosahedronList class.
* it accepts a String parameter and array list parameter
*@param listNameIn -used
*@param icosahedronObjectsIn -used
*/
   public IcosahedronList(String listNameIn,
             ArrayList<Icosahedron> icosahedronObjectsIn) {
      listName = listNameIn;
      icosahedronObjects = icosahedronObjectsIn;
   }

/** returns the listname string of the list for the icosahedron.
*@return listName -used
*/
   public String getName() {
      return listName;
   }
/**This method returns the number of icosahedron objects in the list.
* if there are zero objects, it will return a zero
*@return icosahedronObjects -used.
*/   
   public int numberOfIcosahedrons() {
      return icosahedronObjects.size();
   }
/**this method returns the total surface area for all icosahedron.
* Objects in the list, if there are zero, it returns zero
*@return icosahedronObjects -used.
*/
   public double totalSurfaceArea() {
      int index = 0;
      double sum = 0;
      while (index < icosahedronObjects.size()) {
         Icosahedron num = icosahedronObjects.get(index);
         double surfaceArea = num.surfaceArea(); 
         sum += surfaceArea;
         index++;    
      }
      return sum;
   
   }
/** This method returns the total volume for all icosahedron.
*objects in the list. If there are zero, it returns zero.
*@return icosahedronObjects -used.
*/   
   public double totalVolume() { 
      if (icosahedronObjects.size() == 0) {
         return 0;
      } 
      else {
         int index = 0;
         double sum = 0;
         while (index < icosahedronObjects.size()) {
            Icosahedron num = icosahedronObjects.get(index);
            double totalVolume = num.volume(); 
            sum += totalVolume;
            index++;    
         }
         return sum;
      
      }
   }
/**This method returns the average surface area for all.
* icosahedron objects. In order to find the average, the
* total area is divided by the number of objects.
*@return icosahedronObjects -used.
*/
   public double averageSurfaceArea() {
      if (icosahedronObjects.size() == 0) {
         return 0;
      } 
      else {
         return totalSurfaceArea() / numberOfIcosahedrons();
      }
   }
/**This method returns the average volume for all.
* icosahedron objects. In order to find the average, the
* total volume is divided by the number of objects.
*@return icosahedronObjects -used.
*/   
   public double averageVolume() { 
      if (icosahedronObjects.size() == 0) {
         return 0;
      } 
      else { 
         return totalVolume() / numberOfIcosahedrons();
      }
   }
/**This method returns the average surface to volume ratio.
* for all icosahedron objects. To find this, the sum of
* icosahedron objects are divided by the size.
*@return icosahedronObjects -used.
*/
   public double averageSurfaceToVolumeRatio() {
      if (icosahedronObjects.size() == 0) {
         return 0;
      } 
      else {
         int index = 0;
         double sum = 0;
         while (index < icosahedronObjects.size()) {
            Icosahedron num = icosahedronObjects.get(index);
            double ratio = num.surfaceToVolumeRatio(); 
            sum += ratio;
            index++;    
         }
         return sum / icosahedronObjects.size();
      }
   }
/** This method returns the icosahedron class with a.
* while loop. This method represents line 2-19 in the 
* final product
*@return icosahedronObjects -used.
*/   
   public String toString() {
      String result = listName + "\n";
      int index = 0;
      while (index < icosahedronObjects.size()) {
         result += "\n" + icosahedronObjects.get(index) + "\n"; 
         index++;  
      }   
      return result;
   }
   
/** This method returns the summary items of the.
*icosahedron class. This is represented from lines
* 20-26 in the final code.
*@return icosahedronObjects -used.
*/   
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + listName + " -----"
          + "\n" + "Number of Icosahedrons: " + numberOfIcosahedrons() 
          + "\n" + "Total Surface Area: " + fmt.format(totalSurfaceArea()) 
          + "\n" + "Total Volume: " + fmt.format(totalVolume())
          + "\n" + "Average Surface Area: " + fmt.format(averageSurfaceArea())
          + "\n" + "Average Volume: " + fmt.format(averageVolume())
          + "\n" + "Average Surface/Volume Ratio: " 
          + fmt.format(averageSurfaceToVolumeRatio());
       
   }
   
   
/**************************** New Methods **********************************/
   
   public IcosahedronList readFile(String fileNameIn) 
                                 throws FileNotFoundException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Icosahedron> myList = new ArrayList<Icosahedron>();
      String iListName = "";
      double side1 = 0, side2 = 0, side3 = 0;
      
      listName = scanFile.nextLine(); 
           
      while (scanFile.hasNext()) {
         side1 = Double.parseDouble(scanFile.next());
         side2 = Double.parseDouble(scanFile.next());
         side3 = Double.parseDouble(scanFile.next());
         Icosahedron i = new Icosahedron(side1, side2, side3);
         myList.add(i);           
      }
      
      IcosahedronList iL = new Icosahedron(listName, myList);
      
      return iL;
   }
   
   
   public String getList() {
   }
   
   public double addIcosahedron() {
   }
   
   public String findIcosahedron() {
   }
   
   public String deleteIcosahedron() {
   }
   
   public String editIcosahedron() {
   }
   
  
}
