import java.util.ArrayList;

/** public class temp. */
public class Temperatures {

//instance variables
   private ArrayList<Integer> temperatures;

/**constructor.
*@param temperaturesIn - used
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

/**methods.
*@return low - used
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {  
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;  
   }
/** getHighTemp.
*@return low - used
 */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
/** getHighTemp.
*@return low - used
*@param lowIn - used
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
/** getHighTemp.
*@return low - used
*@param highIn - used
 */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
/** getHighTemp.
*@return low - used
 */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }


}