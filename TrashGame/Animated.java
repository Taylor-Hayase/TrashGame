import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animated here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animated extends Mover
{
    private GreenfootImage[] imagesR;
    private GreenfootImage[] imagesL;
    private GreenfootImage[] eating;
    private int currentImage = 0;
    private int imageBuffer = 5;
    public int moved = 0;
    public boolean facingLeft;
    /**
     * Act - do whatever the Animated wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Animated()
    {
        GreenfootImage img = getImage();
    }
    public Animated(String basename, String suffix, int numImages)
    {
        //idea for animation, make a separate buffer for each action, ie idle, eating, talking
        imagesR = new GreenfootImage[numImages];
        imagesL = new GreenfootImage[numImages];
        
        
        for (int i = 0; i < numImages; i++)
        {
            GreenfootImage lefti = new GreenfootImage(basename+i+suffix);
            lefti.scale(75, 75);
            imagesL[i] = lefti;
            imagesR[i] = new GreenfootImage(imagesL[i]);
            imagesR[i].mirrorHorizontally();
        }
        setImage(imagesL[currentImage]);
    } 
    
    public boolean animateBuffer() 
    {
        if (imageBuffer < 1)
        {
            imageBuffer = 30;
            return true;
        }
        else
            imageBuffer--;
            
        return false;
    }
    
    public void act() 
    {
        // Add your action code here.
        //switch between each buffer as needed
        if (animateBuffer() && moved > 200)
        {
            currentImage = (currentImage + 1) % imagesL.length;
        }
        else if (moved < 150)
        {
            currentImage = 0;
        }
            
        if (super.directionL)
        {
            setImage(imagesL[currentImage]);
        }
        else
        {
            setImage(imagesR[currentImage]);
        }
        
        facingLeft = super.directionL;
    }    
}
