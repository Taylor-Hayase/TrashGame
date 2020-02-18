import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story9 extends World
{

    /**
     * Constructor for objects of class Story9.
     * 
     */
    private int timer = 0;
    public Story9()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        timer++;
       if( timer > 50)
            {
                Greenfoot.setWorld(new Story10());
            }
    }
}
