public  class Icosahedron
{

// instance variables
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   int age = 0;
   int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;

//constructor
   public Icosahedron(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }


//methods
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: " + status;
      return output;
   }
   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if(ageIn > 0) {
         age = ageIn;
         isSet = true;
      }    
      return isSet;
   } 
   

}