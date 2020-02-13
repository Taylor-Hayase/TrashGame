import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Objects
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {   
        GreenfootImage img = getImage();
        img.scale(500, 300);
        
    }
    
    public void act()
    {
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
