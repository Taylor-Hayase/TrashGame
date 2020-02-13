import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends Actor
{
    
    public Controls()
    {
        GreenfootImage img = getImage();
        img.scale(500, 480);
    }
    /**
     * Act - do whatever the Controls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if( Greenfoot.isKeyDown("down") ||
            Greenfoot.isKeyDown("up") ||
            Greenfoot.isKeyDown("left") ||
            Greenfoot.isKeyDown("right") ||
            Greenfoot.isKeyDown("c") ||
            Greenfoot.isKeyDown("C") ||
            Greenfoot.mousePressed(this))
            {
                getWorld().removeObject(this);
                
            }
    }    
}