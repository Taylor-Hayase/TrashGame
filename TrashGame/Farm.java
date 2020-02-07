import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farm extends World
{
    private static boolean firstApp = true;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Farm(Trash trash)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        GreenfootImage img = new GreenfootImage("farm.jpg");
        setBackground(img);
        prepare();
        addObject(trash, 25, 640);
    }
    
    public Farm(Trash trash, int x, int y)
    {
        super(1200, 700, 1); 
        GreenfootImage img = new GreenfootImage("farm.jpg");
        setBackground(img);
        
        addObject(trash, x, y);
        
        if (firstApp)
        {
            prepare();
            firstApp = false;
        }
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

      
        Grass grass = new Grass(1200, 50);
        addObject(grass, 600, 700);
        
        //Platform 1
        Grass grass2 = new Grass();
        addObject(grass2, 300, 560);
        
        Grass grass3 = new Grass();
        addObject(grass3, 350, 560);
        
        Grass grass4 = new Grass();
        addObject(grass4, 400, 560);
        
        Grass grass5 = new Grass();
        addObject(grass5, 450, 560);
        
        //Platform 2
        Grass grass6 = new Grass();
        addObject(grass6, 25, 420);
        
        Grass grass7 = new Grass();
        addObject(grass7, 75, 420);
        
        Grass grass8 = new Grass();
        addObject(grass8, 125, 420);
        
        Grass grass9 = new Grass();
        addObject(grass9, 175, 420);
        
        //Platform 3
        Grass grass10 = new Grass();
        addObject(grass10, 300, 280);
        
        Grass grass11 = new Grass();
        addObject(grass11, 350, 280);
        
        Grass grass12 = new Grass();
        addObject(grass12, 400, 280);
        
        Grass grass13 = new Grass();
        addObject(grass13, 450, 280);
        
        Grass grass14 = new Grass();
        addObject(grass14, 500, 280);
        
        Grass grass15 = new Grass();
        addObject(grass15, 550, 280);
        
        Grass grass16 = new Grass();
        addObject(grass16, 600, 280);
        
        Grass grass17 = new Grass();
        addObject(grass17, 650, 280);
        
        Grass grass18 = new Grass();
        addObject(grass18, 700, 280);
        
        //Platform 4
        Grass grass19 = new Grass();
        addObject(grass19, 480, 160);
        
        Grass grass20 = new Grass();
        addObject(grass20, 530, 160);
        
        //Platform5
        Grass grass21 = new Grass();
        addObject(grass21, 560, 480);
        
        Grass grass22 = new Grass();
        addObject(grass22, 610, 480);
        
        Grass grass23 = new Grass();
        addObject(grass23, 660, 480);
        
        Grass grass24 = new Grass();
        addObject(grass24, 710, 480);
        
        Grass grass25 = new Grass();
        addObject(grass25, 760, 480);
        
        Grass grass26 = new Grass();
        addObject(grass26, 810, 480);
        
        //Platform 6
        Grass grass27 = new Grass();
        addObject(grass27, 900, 380);
        
        Grass grass28 = new Grass();
        addObject(grass28, 950, 380);
        
        Grass grass29 = new Grass();
        addObject(grass29, 1000, 380);
        
        Grass grass30 = new Grass();
        addObject(grass30, 1050, 380);
        
        //Platform 7
        Grass grass31 = new Grass();
        addObject(grass31, 1175, 250);
        
        Grass grass32 = new Grass();
        addObject(grass32, 1125, 250);
        
        //place trash into world
        Trash1 trash = new Trash1();
        addObject(trash, 50, 370);
        
        Trash2 trash2 = new Trash2();
        addObject(trash2, 380, 510);
        
        Trash3 trash3 = new Trash3();
        addObject(trash3, 680, 430);
        
        Trash2 trash4 = new Trash2();
        addObject(trash4, 1150, 200);
        
        Trash1 trash5 = new Trash1();
        addObject(trash5, 980, 330);
        
        Trash3 trash6 = new Trash3();
        addObject(trash6, 400, 230);
        
        Trash2 trash7 = new Trash2();
        addObject(trash7, 500, 230);
        
        Trash3 trash8 = new Trash3();
        addObject(trash8, 600, 230);
        
        Trash1 trash9 = new Trash1();
        addObject(trash9, 505, 110);
        
        Trash1 trash10 = new Trash1();
        addObject(trash10, 1150, 650);

    }
}
