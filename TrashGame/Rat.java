import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rat extends BadNPC
{
    private GreenfootImage[] imagesR;
    private GreenfootImage[] imagesL;
    private int currentImage = 0;
    private int imageBuffer = 5;
    private int timer = 0;
    private boolean goingLeft = true;
    
    public Rat()
    {
        //GreenfootImage img = getImage();
        //img.scale(75, 75);
        //idea for animation, make a separate buffer for each action, ie idle, eating, talking
        imagesR = new GreenfootImage[3];
        imagesL = new GreenfootImage[3];
        
        for (int i = 0; i < 3; i++)
        {
            GreenfootImage lefti = new GreenfootImage("rat"+i+".png");
            lefti.scale(75, 75);
            imagesR[i] = lefti;
            imagesL[i] = new GreenfootImage(imagesR[i]);
            imagesL[i].mirrorHorizontally();
        }
        setMovementSpeed(1);
        setImage(imagesR[currentImage]);
    } 
    
    public boolean animateBuffer() 
    {
        if (imageBuffer < 1)
        {
            imageBuffer = 10;
            return true;
        }
        else
            imageBuffer--;
            
        return false;
    }
    
    public void act() 
    {
        timer++;
        // Add your action code here.
        //switch between each buffer as needed
        if (animateBuffer())
        {
            currentImage = (currentImage + 1) % imagesL.length;
        }
         
        if (timer > 50)
        {
            goingLeft = !goingLeft;
            timer = 0;
        }
        
        if (goingLeft)
        {
            moveLeft();
        }
        else
        {
            moveRight();
        }

        
        if (super.directionL)
        {
            setImage(imagesL[currentImage]);
        }
        else
        {
            setImage(imagesR[currentImage]);
        }
        
    }   
    
}
