import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Barrel here.
 * 
 * @author Chris Flodstrom
 * @version 18 October 2018
 */
public class Barrel extends Actor
{
    private int width;
    private int height;
    private int oldWidth;
    private int oldHeight;
    private int xcoord;
    private int ycoord;
    private int mushroomsEaten;
    private final double SCALE_FACTOR = 1.05;
    private final int MAX_SIZE = 25;
    GreenfootImage img = getImage();

    /**
     * Automatically called by Greenfoot whenever a Barrel object
     * is placed in a world. In this assigment, we use it to remember
     * the initial state of this barrel - its (x,y) position and its
     * original image size.
     */
    public void addedToWorld(World world) {
        oldWidth = img.getWidth();
        oldHeight = img.getHeight();
        width = oldWidth;
        height = oldHeight;
        xcoord = getX();
        ycoord = getY();
        
    }
    
    /**
     * Returns how many mushrooms this barrel has stored.
     */
    public int getMushrooms() {
        return mushroomsEaten; 
    }
    
    /**
     * Follows mouse drag-and-drop motion. Eats nearby mushrooms when
     * dropped and increases its current image scale by 25%. If this barrel
     * stores more than 10 mushrooms, this barrel has itself removed from
     * this world.
     */
    public void act() {
        if (Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if (Greenfoot.mouseDragEnded(this)) {
            List<Mushroom> mushrooms = getObjectsInRange(75, Mushroom.class);
            for(Mushroom m : mushrooms) {
                    mushroomsEaten++;
                    width = (int)(width * SCALE_FACTOR);
                    height = (int)(height * SCALE_FACTOR);
                    img.scale(width, height);
                    getWorld().removeObject(m);
        }
            if(mushroomsEaten > 10) {
                getWorld().removeObject(this);
            }
        }
        

    }   
    
    /**
     * Returns this barrel to its original (x,y) location and its
     * original image scale.
     */
    public void reset() {
        img.scale(oldWidth, oldHeight);
        setLocation(xcoord, ycoord);
        mushroomsEaten = 0;
    }
 
}
