import java.text.DecimalFormat;

 /** 	
    *This program defines Icosahedron objects.
    * The user will enter the label, color
    * and the edge length in which
    *the program will enter the digits
    *into a formula and output the correct
    *answer for the given numbers
    *@author Chris Flodstrom
    *Project 6
    *@version 11 Oct 2018
 */

public  class Icosahedron
{

// instance variables
   private String label = "";
   private String color = "";
   private double edge = 0;
   
/** 
   *This will accept three parameters:
   *the label, color, and edge.
   *this creates constructor objects
   *@param labelIn - determines size of Icosahedron
   *@param colorIn - determines color of Icosahedron
   *@param edgeIn - determines length of Icosahedron
*/
   public Icosahedron(String labelIn, String colorIn, double edgeIn) {
   
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);   
   }

/**
   *This modifies the instance variables for the program.
   *@return label
*/
   public String getLabel() {
      return label;
   }

/**
   *This takes the string and returns.
   *a boolean and trims if there are spaces
   *@param labelIn 
   *@return isSet
*/
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
/**
   *has no parameters; this represents the color.
   *field and returns a string
   *@return color
*/
   public String getColor() {
      return color; 
   }
   
/**
   *takes the string and returns a boolean.
   *will be trimmed if any spaces are found
   *@param colorIn used
   *@return isSet
*/
   public boolean setColor(String colorIn) {
      boolean isSet = false;
      if (colorIn != null) {
         color = colorIn.trim();
         isSet = true;
      }
      return isSet;
   }  
   
/**
   *Accepts no params. and returns a double
   *that represents edge
   *@return edge
*/   
   public double getEdge() {
      return edge;
   }
 
 /**
   *takes a double param and returns a boolean.
   * if edge > 0 the edge double returns true
   *if not, it returns false
   *@param edgeIn used
   *@return true
*/
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn > 0) {
         edge = edgeIn;
         isSet = true;
      }
      
      return isSet;
   }
     
     
   
/**
   *accepts no parameters and returns.
   *value for total surface area using
   *edge value
   *@return area
*/   
   public double surfaceArea() {
      double area;
      area = 5 * (Math.sqrt(3)) * Math.pow(edge, 2);  
      return area;
   }
   
/**
   *accepts no parameters and returns.
   *volume calculated using the edge
   *value
   *@return volume
*/         
   public double volume() {
      double volume;
      volume = (5 * (3 + (Math.sqrt(5))) / 12) * (Math.pow(edge, 3));
      return volume;
   }

/**
   *does not accept parameters and returns.
   *the total value of surface area divided
   *by the volume to find the surface
   *to volume ratio
   *@return surfaceToVolumeRatio
*/      
   public double surfaceToVolumeRatio() {
      double surfaceToVolumeRatio;
      surfaceToVolumeRatio = surfaceArea() / volume(); 
      return surfaceToVolumeRatio;
   }

/**
   *returns a string that contains all the information.
   *about the Icosahedron using the correct decimal 
   *formatting.
   *@return output
*/     
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0#####");  
      String output = "Icosahedron \"" + label + "\" is \"" + color 
          + "\" with 30 edges of length " + edge + " units.\n"; 
          
      output += "\tsurface area = " + fmt.format(surfaceArea()) 
          + " square units\n";
      
      output += "\tvolume = " + fmt.format(volume()) + " cubic units\n";
      
      output += "\tsurface/volume ratio = " 
          + fmt.format(surfaceToVolumeRatio());
     
      return output;
     
   }
     
}