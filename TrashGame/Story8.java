import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story8 extends World
{

    /**
     * Constructor for objects of class Story8.
     * 
     */
    private int timer = 0;
    public Story8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        timer++;
       if( timer > 70)
            {
                Greenfoot.setWorld(new Story9());
            }
    }
}
