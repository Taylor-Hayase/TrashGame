import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story2 extends World
{

    /**
     * Constructor for objects of class Story2.
     * 
     */
    private int timer = 0;
    public Story2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        timer++;
       if( timer > 70)
            {
                Greenfoot.setWorld(new Story3());
            }
    }
}
