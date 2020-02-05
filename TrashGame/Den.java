import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Den here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Den extends World
{

    /**
     * Constructor for objects of class Den.
     * 
     */
    public Den()
    {
        super(1200, 700, 1); 
        GreenfootImage img = new GreenfootImage("den.jpg");
        setBackground(img);
        prepare();
    }
    
    public Den(Trash trash)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        GreenfootImage img = new GreenfootImage("den.jpg");
        setBackground(img);
        
        addObject(trash, 1125, 640);
        Dirt dirt = new Dirt(1200, 50);
        addObject(dirt, 600, 700);
    }
    
    private void prepare() 
    {
        Trash trash = new Trash();
        addObject(trash, 50, 640);
        
        Dirt dirt = new Dirt(1200, 50);
        addObject(dirt, 600, 700);
    }
}
