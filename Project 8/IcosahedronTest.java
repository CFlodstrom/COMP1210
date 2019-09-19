import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


 /** 	
    *This program tests every method.
    *inside the Icosahedron class
    *@author Chris Flodstrom
    *Project 8
    *@version 24 Oct 2018
 */
public class IcosahedronTest {


   /** Fixture initialization (common initialization.
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test getting the Icosahedron Label. **/
   @Test public void getLabelTest() {
      Icosahedron icos = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", "a", icos.getLabel());
      
   }
      /** A test getting the Icosahedron Label when the.
      * if statement is true. 
      */
   @Test public void setLabelTestTrue() {
      Icosahedron icos2 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", true, icos2.setLabel("i"));
   }
      /** A test getting the Icosahedron Label when the.
      * if statement is false. 
      */
   @Test public void setLabelTestFalse() {
      Icosahedron icos3 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", false, icos3.setLabel(null));
   }
    /** A test getting the Icosahedron color. */
   @Test public void getColorTest() {
      Icosahedron icos4 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", "b", icos4.getColor());
      
   }
    /** A test getting the Icosahedron Color when the.
      * if statement is true. 
      */
   @Test public void setColorTestTrue() {
      Icosahedron icos5 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", true, icos5.setColor("i"));
      
   }
   /** A test getting the Icosahedron Color when the.
      * if statement is false. 
      */
   @Test public void setColorTestFalse() {
      Icosahedron icos6 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", false, icos6.setColor(null));
      
   }
   /** A test getting the Icosahedron edge. */
   @Test public void getEdgeTest() {
      Icosahedron icos7 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", 5, icos7.getEdge(), 0.00001);
      
   }
   /** A test getting the Icosahedron edge when the.
      * if statement is true. 
      */
   @Test public void setEdgeTestTrue() {
      Icosahedron icos8 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", true, icos8.setEdge(5));
      
   }
   /** A test getting the Icosahedron edge when the.
      * if statement is false. 
      */
   @Test public void setEdgeFalse() {
      Icosahedron icos9 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", false, icos9.setEdge(0));
      
   }
   /** A test getting the Icosahedron surface area. */
   @Test public void surfaceAreaTest() {
      Icosahedron icos10 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", 216.506, icos10.surfaceArea(), 0.001);
      
   }
   /** A test getting the Icosahedron volume. */
   @Test public void volumeTest() {
      Icosahedron icos11 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", 272.711, icos11.volume(), 0.001);
        
   }
   /** A test getting the Icosahedron surface to volume ratio. */
   @Test public void surfaceToVolumeRatioTest() {
      Icosahedron icos12 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", .7939, icos12.surfaceToVolumeRatio(), 0.001);
      
   }
   /** A test that resets the Icosahedron count test. */  
   @Test public void resetCountTest() {
      Icosahedron icos14 = new Icosahedron("a", "b", 5);
      Icosahedron.resetCount();
      Assert.assertEquals(" ", 0, Icosahedron.getCount());
      
   }
   /** A test that gets the Icosahedron count test. */
   @Test public void getCountTest() {
      Icosahedron.resetCount();
      Icosahedron icos15 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", 1, Icosahedron.getCount());
      
   } 
   /** A test that equals the Icosahedron when true. */
   @Test public void equalsTestTrue() {
      Icosahedron icos16 = new Icosahedron("a", "b", 5);
      Assert.assertEquals(" ", true, icos16.equals(icos16));
      
   }
   /** A test that equals the Icosahedron when false. */
   @Test public void equalsTestFalse1() {
      Icosahedron icos17 = new Icosahedron("a", "b", 5);
      Icosahedron icos18 = new Icosahedron("b", "b", 5);
      Assert.assertEquals(" ", false, icos17.equals(icos18));
      
   }
   /** A test that equals the Icosahedron when the second.
      *false statement is read. */
   @Test public void equalsTestFalse2() {
      Icosahedron icos19 = new Icosahedron("a", "b", 5);
      Icosahedron icos20 = new Icosahedron("a", "c", 5);
      Assert.assertEquals(" ", false, icos19.equals(icos20));
      
   }
    /** A test that equals the Icosahedron when the third.
      *false statement is read. */
   @Test public void equalsTestFalse3() {
      Icosahedron icos21 = new Icosahedron("a", "b", 5);
      Icosahedron icos22 = new Icosahedron("a", "b", 6);
      Assert.assertEquals(" ", false, icos21.equals(icos22));
      
   }
    /** This is the Icosahedron toString test from the.
         *Icosahedron class. */
   @Test public void toStringTest() {
      Icosahedron icos23 = new Icosahedron("a", "b", 5);
      Assert.assertEquals("Icosahedron \"a\" is \"b\"" 
               + " with 30 edges of length 5.0 units."
               + "\n\tsurface area = 216.506351 square units"
               + "\n\tvolume = 272.711874 cubic units"
               + "\n\tsurface/volume ratio = 0.793901", icos23.toString());
      
   }
  
   
}


