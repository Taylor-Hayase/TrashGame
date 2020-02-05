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
        level = 1;
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
       
    private void checkNextLevel() {
        if (getX() == getWorld().getWidth()-1) {
            if (level == 1) {
                level = 2;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Dump(this));
            }
        }
    }
}
