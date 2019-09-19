/**
*Chris Flodstrom.
*Version 17 Sep 2018
*This program shows name, location, age, and status
  */

public  class UserInfo
{

/** instance variables.
*/
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;

/** constructor.
* @param firstNameIn - used
* @param lastNameIn - used
*/
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }


/** methods.
* @return output - used
*/
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
         
      return output;
   }
  /** Sets location.
  * @param locationIn - used
  */ 
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /** Sets age.
   * @return age - used
   * @param ageIn - used
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }    
      return isSet;
   } 
   /** Gets age.
   * @return age - used
   */
   public int getAge() {
      return age;
   }
   /** gets location.
   * @return location - used
   */
   public String getLocation() {
      return location;
   }
   /** logoff.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /** logon.
   */
   public void logOn() {
      status = ONLINE;
   }
      



}

