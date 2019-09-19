import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

 /** 	
    * This program stores the name of the.
    * list and an Array list of Icosahedron
    * objects, and holds the methods that
    * @author Chris Flodstrom
    * Project 8
    * @version 24 Oct 2018
 */
public class IcosahedronList2 {
//instance variables
   private String listName;
   private Icosahedron[] icosahedronObjects = new Icosahedron[100];
   private int icosahedronNumbers;

/** this is the constructor for the IcosahedronList2 class.
* it accepts a String parameter and array list parameter
*@param listNameIn -used
*@param icosahedronObjectsIn -used
*@param icosahedronNumbersIn - used
*/
   public IcosahedronList2(String listNameIn,
             Icosahedron[] icosahedronObjectsIn,
             int icosahedronNumbersIn) {
      listName = listNameIn;
      icosahedronObjects = icosahedronObjectsIn;
      icosahedronNumbers = icosahedronNumbersIn;
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
      return icosahedronNumbers;
   }
/**this method returns the total surface area for all icosahedron.
* Objects in the list, if there are zero, it returns zero
*@return icosahedronObjects -used.
*/
   public double totalSurfaceArea() {
      int index = 0;
      double sum = 0;
      
      if (index > icosahedronNumbers) {
         return 0;
      }
      while (index < icosahedronNumbers) {
      
         sum += icosahedronObjects[index].surfaceArea();
         index++;    
      }
      return sum;
      
   }
/** This method returns the total volume for all icosahedron.
*objects in the list. If there are zero, it returns zero.
*@return icosahedronObjects -used.
*/   
   public double totalVolume() { 
      if (icosahedronNumbers == 0) {
         return 0;
      } 
      else {
         int index = 0;
         double sum = 0;
         while (index < icosahedronNumbers) {
            
            sum += icosahedronObjects[index].volume();
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
      if (icosahedronNumbers == 0) {
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
      if (icosahedronNumbers == 0) {
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
      if (icosahedronNumbers == 0) {
         return 0;
      } 
      else {
         int index = 0;
         double sum = 0;
         while (index < icosahedronNumbers) {
            Icosahedron num = icosahedronObjects[index];
            double ratio = num.surfaceToVolumeRatio(); 
            sum += ratio;
            index++;    
         }
         return sum / icosahedronNumbers;
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
      while (index < numberOfIcosahedrons()) {
         result += "\n" + icosahedronObjects[index].toString() + "\n"; 
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
   
   /**
   * returns the array list of icoshaedrons.
   *@return array -used
   */
   public Icosahedron[] getList() {
      return icosahedronObjects;
   }
  /** 
  *reads the icosahedron files when r is inputted in the menu app.
  *@throws FileNotFoundException for scanning Icosahedrons.
  *@param fileName - used
  *@return icosahedronlist -used
  */ 
   public IcosahedronList2 readFile(String fileName) 
               throws FileNotFoundException
   {
      String icosahedronListName = "";
      String label = "";
      String color = "";
      double edge = 0;
      int icosnums = 0;
      
      Scanner scanFile = new Scanner(new File(fileName));
      icosahedronListName = scanFile.nextLine();
         
      while (scanFile.hasNext()) { //while loop reads info of icosahedron
                  
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
               
         Icosahedron newIcosahedron = new Icosahedron(label, color, edge);
         icosahedronObjects[icosnums] = newIcosahedron;
         icosnums++;
      }
      scanFile.close();
      IcosahedronList2 newIcosahedronList2
         = new IcosahedronList2(icosahedronListName, icosahedronObjects, 
                  icosnums);
      
      return newIcosahedronList2;
   }
  /** 
  *adds icosahedron to array list when "a" is pressed on the app.
  *@param label -used.
  *@param color - used
  *@param edge -used
  */ 
   public void addIcosahedron(String label, String color, double edge) {
      Icosahedron newIcosahedron = new Icosahedron(label, color, edge);
      icosahedronObjects[icosahedronNumbers] = newIcosahedron;
      icosahedronNumbers++;  
   
   }
  /** 
  *finds an icosahedron in the array list when f is pressed.
  *@param label - used
  *@return result of icosahedrons in the list
  */ 
   public Icosahedron findIcosahedron(String label) {
      /**Icosahedron result = null;
      for(int i = 0; i<icosahedronNumbers;i++){
         if(icosahedronObjects[i].getLabel().equalsIgnoreCase(label)){
            result = icosahedronObjects[i];
            break;
         }
      }
      return null;
       */
       
      for (int i = 0; i < icosahedronNumbers; i++) {
         if (icosahedronObjects[i].getLabel().equalsIgnoreCase(label)) {
            return icosahedronObjects[i];
         }
      }
      return null;
   }
  /** 
  *Deletes icosahedrons in the list when d is pressed.
  *@param label - used
  *@return icosahedrons found in the list 
  */ 
   public Icosahedron deleteIcosahedron(String label) {
      for (int i = 0; i < icosahedronNumbers; i++) {
         if (icosahedronObjects[i].getLabel().equalsIgnoreCase(label))
         {
            Icosahedron number = icosahedronObjects[i];
            for (int j = i; j < icosahedronNumbers - 1; j++)
            {
               icosahedronObjects[j] = icosahedronObjects [j + 1];
            }
            icosahedronObjects[icosahedronNumbers - 1] = null;
            icosahedronNumbers--;
            return number;
         }
         
       
      }
      return null;
   }
      
  /** 
  *edits icosahedrons in the list when e is pressed on the app.
  *@param label - used
  *@param color - used
  *@param edge - used
  *@return the icosahedron selected in the list
  */  
   public boolean editIcosahedron(String label, String color, double edge) {
      boolean found = false;
      for (Icosahedron name : icosahedronObjects) {
         if (name.getLabel().equalsIgnoreCase(label)) {
            name.setColor(color);
            name.setEdge(edge);
            return true;
         }
      }
      return found;
   }
}
