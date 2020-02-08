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
        
        Rat rat = new Rat();
        addObject(rat, 600, 640);
        
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
        
}
