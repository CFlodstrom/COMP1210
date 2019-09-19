import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author Chris Flodstrom 
 * @version 18 October 2018
 */
public class Pig extends Actor
{
    /** Keeps track of how many mushrooms this pig has eaten. */
    private int shrooms;
    
    /** 
     * Constructs a Pig object and initializes it as having
     * eaten no mushrooms. 
     */
    public Pig() {
        shrooms = 0;
    }
    
    /**
     * Follows the mouse movement and eats mushrooms on mouse clicks.
     * Stops the scenario once this pig has eaten at least 15 mushrooms.
     */
    public void act() 
    {
        if (Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if (Greenfoot.mouseClicked(null)) {
            Mushroom m = (Mushroom) getOneIntersectingObject(Mushroom.class);
            if (m != null) {
                shrooms++;
                getWorld().removeObject(m);
            }
        }
        if (shrooms > 29) {
            Greenfoot.stop();
        }
        if (Greenfoot.mouseClicked(null)) {
                MouseInfo click = Greenfoot.getMouseInfo();
                if(click.getButton() == 3){
                    Barrel barrel = (Barrel) getOneIntersectingObject(Barrel.class);
                    shrooms = shrooms + barrel.getMushrooms();
                    barrel.reset();
                }
            }
    }    
}
