/** Chris Flodstrom.
*version 17 Sep 2018
*/
public class IcosahedronApp {
    
    /** the driver side of user info.
    *@param args - used
    */
   public static void main(String[] args) {
      
      IcosahedronApp user1 = new IcosahedronApp("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2); 
   }
}