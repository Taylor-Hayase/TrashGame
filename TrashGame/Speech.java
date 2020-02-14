import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Speech here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Speech extends Objects
{
    /**
     * Act - do whatever the Speech wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Speech(String text, String color) {
        
        if (color.equals("black"))
            setImage(new GreenfootImage(text, 20, Color.BLACK, Color.WHITE));
            
        if (color.equals("red"))
            setImage(new GreenfootImage(text, 20, Color.RED, Color.WHITE));
    }
}
