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
        GreenfootImage img = new GreenfootImage("dump.png");
        setBackground(img);
        
        prepare();
        prepareTrash();
        addObject(trash, 25, 200);
        
    }
    
    private void prepare()
    {
        Dirt dirt = new Dirt(1200, 50);
        addObject(dirt,600,700);
       
        //Platform 1
        Dirt dirt2 = new Dirt();
        addObject(dirt2, 25, 250);
        
        Dirt dirt3 = new Dirt();
        addObject(dirt3, 75, 250);
        
        Dirt dirt4 = new Dirt();
        addObject(dirt4, 125, 250);
        
        Dirt dirt5 = new Dirt();
        addObject(dirt5, 175, 250);
        
        //Platform 2
        Dirt dirt6 = new Dirt();
        addObject(dirt6, 300, 150);
        
        Dirt dirt7 = new Dirt();
        addObject(dirt7, 325, 150);
        
        Dirt dirt8 = new Dirt();
        addObject(dirt8, 375, 150);
        
        Dirt dirt9 = new Dirt();
        addObject(dirt9, 425, 150);
        
        //Platform 3
        Dirt dirt10 = new Dirt();
        addObject(dirt10, 125, 400);
        
        Dirt dirt11 = new Dirt();
        addObject(dirt11, 175, 400);
        
        Dirt dirt12 = new Dirt();
        addObject(dirt12, 225, 400);
        
        Dirt dirt13 = new Dirt();
        addObject(dirt13, 275, 400);
        
        Dirt dirt14 = new Dirt();
        addObject(dirt14, 325, 400);
        
        Dirt dirt15 = new Dirt();
        addObject(dirt15, 375, 400);
        
        //Platform 4
        Dirt dirt16 = new Dirt();
        addObject(dirt16, 450, 550);
        
        Dirt dirt17 = new Dirt();
        addObject(dirt17, 500, 550);
        
        Dirt dirt18 = new Dirt();
        addObject(dirt18, 550, 550);
        
        Dirt dirt19 = new Dirt();
        addObject(dirt19, 600, 550);
        
        Dirt dirt20 = new Dirt();
        addObject(dirt20, 650, 550);
        
        Dirt dirt21 = new Dirt();
        addObject(dirt21, 700, 550);
        
        Dirt dirt22 = new Dirt();
        addObject(dirt22, 750, 550);
        
        //Platform5
        Dirt dirt23 = new Dirt();
        addObject(dirt23, 850, 400);
        
        Dirt dirt24 = new Dirt();
        addObject(dirt24, 900, 400);
        
        Dirt dirt25 = new Dirt();
        addObject(dirt25, 950, 400);
        
        Dirt dirt26 = new Dirt();
        addObject(dirt26, 1000, 400);
        
        Dirt dirt27 = new Dirt();
        addObject(dirt27, 1050, 400);
        
        //Platform 6
        Dirt dirt28 = new Dirt();
        addObject(dirt28, 1025, 250);
        
        Dirt dirt29 = new Dirt();
        addObject(dirt29, 1075, 250);
        
        Dirt dirt30 = new Dirt();
        addObject(dirt30, 1125, 250);
        
        Dirt dirt31 = new Dirt();
        addObject(dirt31, 1175, 250);
        
        //Platform 7
        Dirt dirt32 = new Dirt();
        addObject(dirt32, 800, 150);
        
        Dirt dirt33 = new Dirt();
        addObject(dirt33, 825, 150);
        
        Dirt dirt34 = new Dirt();
        addObject(dirt34, 875, 150);
        
        Dirt dirt35 = new Dirt();
        addObject(dirt35, 925, 150);
        
    }
    
    private void prepareTrash()
    {
        //place trash into world
        Trash1 trash = new Trash1();
        addObject(trash, 325, 100);
        
        Trash2 trash2 = new Trash2();
        addObject(trash2, 800, 100);

        Trash2 trash3 = new Trash2();
        addObject(trash3, 250, 350);
        
        Trash3 trash4 = new Trash3();
        addObject(trash4, 150, 350);
        
        Trash1 trash5 = new Trash1();
        addObject(trash5, 325, 650);
        
        Trash3 trash6 = new Trash3();
        addObject(trash6, 600, 500);
        
        Trash3 trash7 = new Trash3();
        addObject(trash7, 1050, 200);
        
        Trash1 trash8 = new Trash1();
        addObject(trash8, 1, 350);
    }
}
