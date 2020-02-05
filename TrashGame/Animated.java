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
    private int currentImage = 0;
    private int imageBuffer = 5;
    /**
     * Act - do whatever the Animated wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Animated(String basename, String action, String suffix, int numImages)
    {
        imagesR = new GreenfootImage[numImages];
        imagesL = new GreenfootImage[numImages];
        
        for (int i = 0; i < numImages; i++)
        {
            GreenfootImage lefti = new GreenfootImage(basename+action+i+suffix);
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
            imageBuffer = 5;
            return true;
        }
        else
            imageBuffer--;
            
        return false;
    }
    
    public void act() 
    {
        // Add your action code here.
        if (animateBuffer())
        {
            currentImage = (currentImage + 1) % imagesL.length;
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
