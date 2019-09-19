import java.text.DecimalFormat;

/** Chris Flodstrom
*Version 21Sep18
*/

public  class Icosahedron
{

// instance variables
   private String label = "";
   private String color = "";
   private double edge = 0;
   
//constructor
   public Icosahedron(String labelIn, String colorIn, double edgeIn) {
   
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);   
   }

//methods
   public String getLabel() {
       return label;
   }

   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
      label = labelIn.trim();
      
     }
      return true;
 }
   public String getColor() {
      return color; 
   }

   public boolean setColor(String colorIn) {
      if (colorIn != null) {
      color = colorIn;
      }
      return true;
 }  
   
   public double getEdge() {
     return edge;
   }
 
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
      edge = edgeIn;
      }
      return true;
 }  
   
   public double surfaceArea() {
      double area;
      area = 5 * (Math.sqrt (3)) * Math.pow (edge, 2);  
      return area;
   }
         
   public double volume() {
      double volume;
      volume = (5 * (3 + (Math.sqrt (5))) / 12) * (Math.pow (edge, 3));
      return volume;
   }
      
   public double surfaceToVolumeRatio() {
      double surfaceToVolumeRatio;
      surfaceToVolumeRatio = surfaceArea() / volume(); 
      return surfaceToVolumeRatio;
   }
     
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0#####");  
      String output = "Icosahedron \""+ label + "\" is \"" + color + "\" with 30 edges of length \"" + edge + "\" units.\n"; 
      output += "\tsurface area = " + fmt.format(surfaceArea()) + " square units\n";
      output += "\tvolume = " + fmt.format(volume()) + " cubic units\n";
      output += "\tsurface/volume ratio = " + fmt.format(surfaceToVolumeRatio());
     
     return output;
     
   }
     
}