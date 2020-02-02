import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 1200, 1); 
        GreenfootImage img = new GreenfootImage("farm.jpg");

        setBackground(img);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dirt dirt = new Dirt();
        addObject(dirt,25,720);
        
        Dirt dirt2 = new Dirt();
        addObject(dirt2,75,720);

        Dirt dirt3 = new Dirt();
        addObject(dirt3,125,720);
        
        Dirt dirt4 = new Dirt();
        addObject(dirt4,175,720);
        
        Dirt dirt5 = new Dirt();
        addObject(dirt5,225,720);
    
        Dirt dirt6 = new Dirt();
        addObject(dirt6,275,720);

        Dirt dirt7 = new Dirt();
        addObject(dirt7,325,720);
 
        Dirt dirt8 = new Dirt();
        addObject(dirt8,375,720);
 
        Dirt dirt9 = new Dirt();
        addObject(dirt9,425,720);
  
        Dirt dirt10 = new Dirt();
        addObject(dirt10,475,720);

        Dirt dirt11 = new Dirt();
        addObject(dirt11,525, 720);
    
        Dirt dirt12 = new Dirt();
        addObject(dirt12,575,720);
       
        Dirt dirt13 = new Dirt();
        addObject(dirt13,625,720);

        Dirt dirt14 = new Dirt();
        addObject(dirt14,675,720);
      
        Dirt dirt15 = new Dirt();
        addObject(dirt15,725,720);
 
        Dirt dirt16 = new Dirt();
        addObject(dirt16,775,720);

        Dirt dirt17 = new Dirt();
        addObject(dirt17,825,720);
       
        Dirt dirt18 = new Dirt();
        addObject(dirt18,875,720);
       
        Dirt dirt19 = new Dirt();
        addObject(dirt19,925,720);

        Dirt dirt20 = new Dirt();
        addObject(dirt20,975,720);
      
        Dirt dirt21 = new Dirt();
        addObject(dirt21,1025,720);
    
        Dirt dirt22 = new Dirt();
        addObject(dirt22,1075,720);
      
        Dirt dirt23 = new Dirt();
        addObject(dirt23,1125,720);
  
        Dirt dirt24 = new Dirt();
        addObject(dirt24,1175,720);

        Dirt dirt25 = new Dirt();
        addObject(dirt25,1225,720);

    }
}
