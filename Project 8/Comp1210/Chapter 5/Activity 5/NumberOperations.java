/** class numberoperations. */
public class NumberOperations {
   private int number;
   
   /** numberops.
   *@param numberIn - used
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /** getValue.
   *@return number -used
   */
   public int getValue()
   {
      return number; //placeholder return
   }
   /** oddsUnder.
   *@return output - used
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;   
      }
      return output;
   }
   /** powersTwoUnder.
   *@return output - used
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
     
      while (powers < number) {
         output += powers + "\t"; //concatenate to output
         powers = powers * 2; //get next power of 2
      }
      return output;
   }
   /** isgreater.
   *@return used
   *@param compareNumber - used
   */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
  /** toString.
  *@return number - used
  */ 
   public String toString() {
      return number + "";
   } 
   
}