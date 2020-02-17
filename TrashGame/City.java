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
    private Trash tra;
    private int timer = 0;
    private Speech s;
    
    public City(Trash trash)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        GreenfootImage img = new GreenfootImage("city.jpg");
        setBackground(img);
        prepare();
        s = new Speech("This is the last place I am visiting today.", "black");
        if (!trash.visitCity)
        {
            prepare2();
            Trap t = new Trap();
            addObject(t, 1100, 500);
            addObject(s, 250, 610);
        }
        tra = trash;
            
        addObject(trash, 75, 640);
    }
    
    public void act()
    {
        if (s != null)
            timer++;
            
        if (timer > 200)
        {
            removeObject(s);
            if (tra != null)
                tra.pause = false;
        }
        else if (timer > 100)
        {
            removeObject(s);
            s = new Speech("My children need me!", "black");
            addObject(s, 155, 610);
        } 
    }
    
    private void prepare() 
    {
        Cement cement = new Cement(1200, 50);
        addObject(cement, 600, 700);
        
        FlipSign sign = new FlipSign();
        addObject(sign, 100, 645);
        
        Rat rat = new Rat();
        addObject(rat, 350, 640);
        
        Rat rat2 = new Rat();
        addObject(rat2, 550, 640);
        
        Rat rat3 = new Rat();
        addObject(rat3, 750, 640);
        
        //Platform 1
        Cement cement2 = new Cement();
        addObject(cement2, 25, 570);
        
        Cement cement3 = new Cement();
        addObject(cement3, 75, 570);
        
        Cement cement4 = new Cement();
        addObject(cement4, 125, 570);
        
        //Platform 2
        Cement cement5 = new Cement();
        addObject(cement5, 225, 450);
        
        Cement cement6 = new Cement();
        addObject(cement6, 275, 450);
        
        Cement cement7 = new Cement();
        addObject(cement7, 325, 450);
        
        Cement cement8 = new Cement();
        addObject(cement8, 375, 450);
        
        Cement cement9 = new Cement();
        addObject(cement9, 425, 450);
        
        Cement cement10 = new Cement();
        addObject(cement10, 475, 450);
        
        Cement cement11 = new Cement();
        addObject(cement11, 525, 450);
        
        Cement cement12 = new Cement();
        addObject(cement12, 575, 450);
        
        Cement cement13 = new Cement();
        addObject(cement13, 625, 450);
        
        Cement cement14 = new Cement();
        addObject(cement14, 675, 450);
        
        Cement cement15 = new Cement();
        addObject(cement15, 725, 450);
        
        Cement cement16 = new Cement();
        addObject(cement16, 775, 450);
        
        //Platform 3
        Cement cement17 = new Cement();
        addObject(cement17, 25, 300);
        
        Cement cement18 = new Cement();
        addObject(cement18, 75, 300);
        
        Cement cement19 = new Cement();
        addObject(cement19, 125, 300);
        
        Cement cement20 = new Cement();
        addObject(cement20, 175, 300);
        
        //Platform 4
        Cement cement21 = new Cement();
        addObject(cement21, 250, 170);
        
        Cement cement22 = new Cement();
        addObject(cement22, 300, 170);
        
        Cement cement23 = new Cement();
        addObject(cement23, 350, 170);
        
        //Platform 5
        Cement cement24 = new Cement();
        addObject(cement24, 470, 170);
        
        Cement cement25 = new Cement();
        addObject(cement25, 520, 170);
        
        Cement cement26 = new Cement();
        addObject(cement26, 570, 170);
        
        //Platform 6
        Cement cement27 = new Cement();
        addObject(cement27, 720, 250);
        
        Cement cement28 = new Cement();
        addObject(cement28, 770, 250);
        
        Cement cement29 = new Cement();
        addObject(cement29, 820, 250);
        
        //Platform 7
        Cement cement30 = new Cement();
        addObject(cement30, 950, 300);
        
        Cement cement31 = new Cement();
        addObject(cement31, 1000, 300);
        
        Cement cement32 = new Cement();
        addObject(cement32, 1050, 300);
    }
    
    private void prepare2()
    {
        
        Trash3 t3 = new Trash3();
        addObject(t3, 250, 410);
       
        Trash2 t5 = new Trash2();
        addObject(t5, 450, 410);
        
        Trash1 t7 = new Trash1();
        addObject(t7, 650, 410);

        Trash1 t10 = new Trash1();
        addObject(t10, 300, 120);
        
        Trash3 t12 = new Trash3();
        addObject(t12, 760, 200);
        
        Trash1 t13 = new Trash1();
        addObject(t13, 1000, 250);
        
        Trash2 t14 = new Trash2();
        addObject(t14, 1100, 650);
        
        Trash3 t15 = new Trash3();
        addObject(t15, 1150, 650);
        
        Trash1 t16 = new Trash1();
        addObject(t16, 1050, 650);
    }
        
}
