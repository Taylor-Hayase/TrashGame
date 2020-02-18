import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story1 extends World
{

    private int timer = 0;
    /**
     * Constructor for objects of class Story1.
     * 
     */
    public Story1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        timer++;
       if( timer > 50)
            {
                Greenfoot.setWorld(new Story2());
            }
    }
}
