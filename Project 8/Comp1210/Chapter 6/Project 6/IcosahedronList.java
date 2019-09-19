import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

 /** 	
    *This program defines icosahedron objects.
    * The user will enter the label, color
    * and the edge length in which
    *the program will enter the digits
    *into a formula and output the correct
    *answer for the given numbers
    *@author Chris Flodstrom
    *Project 4
    *@version 13Sep2018
 */

public class IcosahedronList {

//instance variables
   private String listName;
   private ArrayList<Icosahedron> icosahedronObjects;

/** this is the constructor for thw IcosahedronList class.
*@param listNameIn -used
*@param icosahedronObjectsIn -used
*/
   public IcosahedronList(String listNameIn,
             ArrayList<Icosahedron> icosahedronObjectsIn) {
      listName = listNameIn;
      icosahedronObjects = icosahedronObjectsIn;
   }

/** returns the name of the list for the icosahedron.
*@return listName -used
*/
   public String getName() {
      return listName;
   }
/**
*@return icosahedronObjects -used.
*/   
   public int numberOfIcosahedrons() {
      return icosahedronObjects.size();
   }
/**
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
/**
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
/**
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
/**
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
/**
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
   
   
   
/**
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
   
/**
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
   
   /***************************** NEW METHODS**************************************/
   
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
         Icosahedron i = new Icosahedron();
         myList.add(i);           
      }
      IcosahedronList iL = new IcosahedronList(listName, myList);
      
      return iL;
   }
   

   public String getList() {
      return null;
   }
   
   public String readFile() {
   }
   
   public double addIcosahedron(){
   }
   
   public String findIcosahedron(String label) {
   }
      
      
      
      
      
      
      
           
}
