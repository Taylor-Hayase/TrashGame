import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Mover
{
    private int level;
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trash()
    {
        level = 0;
        GreenfootImage img = getImage();
        img.scale(75, 75);
        
        setMovementSpeed(5);
        setGravity(2);
        setBlockingClasses(new Class[]{Ground.class});
    }
    
    public void act() 
    {
        // Add your action code here.
        doGravity();
        
        moveHorizontally();
        moveVertically();
        checkNextLevel();
    }  
    
    private void moveHorizontally() 
    {
        if (Greenfoot.isKeyDown("right")) 
        {
           moveRight();  
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            moveLeft();
        }
    }
    
    private void moveVertically()
    {
        if (Greenfoot.isKeyDown("up") && onGround()) 
        {
            jump(25);
        }
    }
       
    private void checkNextLevel() 
    {
        if (getX() == getWorld().getWidth()-1) 
        {
            if (level == 0)
            {
                level = 1;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Farm(this));
            }
            else if (level == 1) 
            {
                level = 2;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Dump(this));
            }
            else if (level == 2)
            {
                level = 3;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new City(this));
            }
            else if (level == 3)
            {
                level = 4;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Farm(this, 1125, 640));
            }
        }
        
        if (getX() == 0)
        {
            if (level == 4)
            {
                level = 5;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Den(this));
            }
            
        }
    }
}
