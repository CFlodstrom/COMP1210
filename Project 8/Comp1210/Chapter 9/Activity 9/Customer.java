/** Hello. */
public class Customer implements Comparable<Customer> {

//instance variables
/** Hello. */
   private String name = "";
   private String location = "";
   private double balance = 0;

//Constructor
/** Hello.
   *@param nameIn - used
 */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
    
//methods
/** Hello.
   *@param locationIn - used
 */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
/** Hello.
   *@param city - used
   *@param state - used.
 */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
/** Hello.
   *@param amount - used
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
/** Hello.
   *@return - used
 */
   public String getLocation() {
      return location;
   }
/** Hello.
 *@return - used
 */
   public double getBalance() {
      return balance;
   }
 /** Hello.
 *@return - used
 */
   public String toString() {
      String output = name + "\n" + location + "\n" + "$" + balance;
   
      return output;
   }
/** Hello.
  *@param obj - used
  *@return used
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      } 
      else {
         return 1;
      }
   }
}
