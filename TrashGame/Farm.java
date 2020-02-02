import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farm extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Farm()
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
        Grass grass = new Grass();
        addObject(grass,25,720);
        
        Grass grass2 = new Grass();
        addObject(grass2,75,720);

        Grass grass3 = new Grass();
        addObject(grass3,125,720);
        
        Grass grass4 = new Grass();
        addObject(grass4,175,720);
        
        Grass grass5 = new Grass();
        addObject(grass5,225,720);
    
        Grass grass6 = new Grass();
        addObject(grass6,275,720);

        Grass grass7 = new Grass();
        addObject(grass7,325,720);
 
        Grass grass8 = new Grass();
        addObject(grass8,375,720);
 
        Grass grass9 = new Grass();
        addObject(grass9,425,720);
  
        Grass grass10 = new Grass();
        addObject(grass10,475,720);

        Grass grass11 = new Grass();
        addObject(grass11,525, 720);
    
        Grass grass12 = new Grass();
        addObject(grass12,575,720);
       
        Grass grass13 = new Grass();
        addObject(grass13,625,720);

        Grass grass14 = new Grass();
        addObject(grass14,675,720);
      
        Grass grass15 = new Grass();
        addObject(grass15,725,720);
 
        Grass grass16 = new Grass();
        addObject(grass16,775,720);

        Grass grass17 = new Grass();
        addObject(grass17,825,720);
       
        Grass grass18 = new Grass();
        addObject(grass18,875,720);
       
        Grass grass19 = new Grass();
        addObject(grass19,925,720);

        Grass grass20 = new Grass();
        addObject(grass20,975,720);
      
        Grass grass21 = new Grass();
        addObject(grass21,1025,720);
    
        Grass grass22 = new Grass();
        addObject(grass22,1075,720);
      
        Grass grass23 = new Grass();
        addObject(grass23,1125,720);
  
        Grass grass24 = new Grass();
        addObject(grass24,1175,720);

        Grass grass25 = new Grass();
        addObject(grass25,1225,720);

    }
}
