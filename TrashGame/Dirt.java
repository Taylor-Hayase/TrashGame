import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dirt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dirt extends Ground
{
    /**
     * Act - do whatever the dirt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dirt()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
