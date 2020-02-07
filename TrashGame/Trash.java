import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Animated
{
    private int level;
    
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trash()
    {
        super("Trash",".png", 6);
        level = 0;
        
        setMovementSpeed(5);
        setGravity(2);
        setBlockingClasses(new Class[]{Ground.class});
    }
    
    public void act() 
    {
        // Add your action code here.
        doGravity();
        super.act();
        moveHorizontally();
        moveVertically();
        eat();
        checkNextLevel();
    }  
    
    private void moveHorizontally() 
    {

        if (Greenfoot.isKeyDown("right")) 
        {
           moveRight(); 
           moved = 0;
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            moveLeft();
            moved = 0;
        }
        else {
            moved++;
        }
    }
    
    private void moveVertically()
    {
        if (Greenfoot.isKeyDown("up") && onGround()) 
        {
            jump(25);
            moved = 0;
        }
    }
      
    private void eat()
    {
        
    }
    
    private void checkNextLevel() 
    {
        if ((getX() == getWorld().getWidth()-1) && (getY() > 630)) 
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
        
        if ((getX() == 0) && (getY() > 630))
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
