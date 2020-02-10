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
        prepare2();
    }
    
    private void prepare() 
    {
        Trash trash = new Trash();
        addObject(trash, 500, 640);
        
        Dirt dirt = new Dirt(1200, 50);
        addObject(dirt, 600, 700);
        
        Child1 child1 = new Child1();
        addObject(child1, 100, 650);
        
        Child2 child2 = new Child2();
        addObject(child2, 170, 650);
        
        Child3 child3 = new Child3();
        addObject(child3, 240, 650);
        
        Speech speech1 = new Speech("Hungry!");
        addObject(speech1, 90, 620);
        
        Speech speech2 = new Speech("Feed us!");
        addObject(speech2, 160, 590);
        
        Speech speech3 = new Speech("Trash please!");
        addObject(speech3, 230, 620);
    }
    
    private void prepare2()
    {
        Dirt dirt = new Dirt(1200, 50);
        addObject(dirt, 600, 700);
        
        Child1 child1 = new Child1();
        addObject(child1, 100, 650);
        
        Child2 child2 = new Child2();
        addObject(child2, 170, 650);
        
        Child3 child3 = new Child3();
        addObject(child3, 240, 650);
    }
}
