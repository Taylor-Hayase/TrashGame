import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    private int timer = 0;
    
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 350, 1); 
    }
    
    public void act()
    {
        timer++;
       if(timer > 50 && (Greenfoot.isKeyDown("enter")))
            {
                Greenfoot.setWorld(new Story0());
            }
    }
}
