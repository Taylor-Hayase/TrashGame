import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dump extends World
{

    /**
     * Constructor for objects of class Dump.
     * 
     */
    public Dump(Trash trash)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1);
        GreenfootImage img = new GreenfootImage("dump.jpg");
        setBackground(img);
        
        prepare();
        addObject(trash, 25, 640);
        
    }
    
    private void prepare()
    {
        Dirt dirt = new Dirt(1200, 50);
        addObject(dirt,600,700);
       

    }
}
