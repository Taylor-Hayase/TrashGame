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
    private Speech s;
    private int timer = 0;
    private Trash t;
    
    public Dump(Trash trash, int x, int y)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1);
        GreenfootImage img = new GreenfootImage("dump.png");
        setBackground(img);
        
        t = trash;
        
        prepare();
        if (!trash.visitDump)
        {
            s = new Speech("Grr those darn rats always are stealing my trash...", "black");
            addObject(s, 270, 170);
            prepareTrash();
        }
        addObject(trash, x, y);
        
    }
    
    public void act()
    {
        if (s != null)
            timer++;
            
        if (timer > 200)
        {
            removeObject(s);
            if (t != null)
                t.pause = false;
        }
        else if (timer > 100 && t.pause)
        {
            removeObject(s);
            s = new Speech("Best to avoid them", "black");
            addObject(s, 155, 170);
        } 
    }
    
    private void prepare()
    {
        Dirt dirt = new Dirt(1200, 50);
        addObject(dirt,600,700);
        
        Sign sign = new Sign();
        addObject(sign, 1100, 645);
        
        FlipSign fsign = new FlipSign();
        addObject(fsign, 100, 200);
        
        Rat rat = new Rat();
        addObject(rat, 600, 640);
       
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
        addObject(trash3, 1000, 350);
        
        Trash3 trash4 = new Trash3();
        addObject(trash4, 150, 350);
        
        Trash3 trash5 = new Trash3();
        addObject(trash5, 1050, 200);
    }
}
