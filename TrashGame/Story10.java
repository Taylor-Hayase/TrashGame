import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story10 extends World
{

    /**
     * Constructor for objects of class Story10.
     * 
     */
    private int timer = 0;
    public Story10()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        timer++;
       if( timer > 60)
            {
                Greenfoot.setWorld(new Story11());
            }
    }
}
