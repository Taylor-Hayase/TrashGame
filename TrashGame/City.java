import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class City here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class City extends World
{

    /**
     * Constructor for objects of class City.
     * 
     */
    public City(Trash trash)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        GreenfootImage img = new GreenfootImage("city.jpg");
        setBackground(img);
        prepare();
        
        addObject(trash, 25, 640);
    }
    
    private void prepare() 
    {
        Cement cement = new Cement(1200, 50);
        addObject(cement, 600, 700);
    }
        
}
