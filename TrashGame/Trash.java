
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Animated
{
    private int level;
    private GreenfootImage[] images;
    private GreenfootImage[] imagesL;
    private int currentImage = 0;
    private int frameCt = 0;
    public int score = 0;
    private boolean timing = true;
    private boolean eating = false;
    private boolean hit = false;
    private Speech speech;
    private int timer;
   
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trash()
    {
        super("TrashIdle",".png", 6);
        level = 0;
        
        setMovementSpeed(5);
        setGravity(2);
        setBlockingClasses(new Class[]{Ground.class});
        
        images = new GreenfootImage[8];
        imagesL = new GreenfootImage[8];
        
        
        for (int i = 0; i < 8; i++)
        {
            GreenfootImage eat = new GreenfootImage("Trash_eating"+i+".png");
            eat.scale(75, 75);
            images[i] = eat;
            imagesL[i] = new GreenfootImage(images[i]);
            imagesL[i].mirrorHorizontally();
            
        }
        setImage(images[currentImage]);
        
    }
    
    public void act() 
    {
        // Add your action code here.
        getWorld().showText("Score: " +Integer.toString(score), 80, 50);
        
        if (level == 0)
            getWorld().showText("Location: Den", 80, 75);
        else if (level == 1)
            getWorld().showText("Location: Farm", 80, 75);
        else if (level == 2)
            getWorld().showText("Location: Dump", 80, 75);
        else if (level == 3)
            getWorld().showText("Location: City", 80, 75);
        doGravity();
        super.act();
        moveHorizontally();
        moveVertically();
        eat();
        checkRats();
        
        checkNextLevel();
        if (score != 0 && level == 0)
            finish();
        frameCt++;
        speechBubbles();
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
            jump(26);
            moved = 0;
            Greenfoot.playSound("jump.wav");
        }
    }
      
    private void eat()
    {
        Actor a = getOneIntersectingObject(Eatable.class);
        if(a != null)
        {
            Greenfoot.playSound("eating.wav");
            getWorld().removeObject(a);
            eating = true;
            score++;
        }
            
        if (eating)
        {
            currentImage++;
            
            if (currentImage > 7)
            {
                currentImage = 0;
                eating = false;
                return;
            }
            
            if (super.facingLeft)
            {
                setImage(images[currentImage]);
            }
            else
            {
                setImage(imagesL[currentImage]);
            }
                
        }
                
    }


    private void checkRats()
    {
        Actor a = getOneIntersectingObject(BadNPC.class);
        if(a != null)
        {
            hit = true;
            if(timing)
            {
                Greenfoot.playSound("rat.wav");
                score = score - 1;
                if (score < 0)
                    score = 0;
                timing = false;
                if (super.facingLeft)
                {
                    setLocation(getX() - 20, getY());
                }
                else
                {
                    setLocation(getX() + 20, getY());
                }
                
                if (speech == null)
                {
                    speech = new Speech("-1", "red");
                    getWorld().addObject(speech, getX(), getY() - 10);
                }

            }
            
            int x = a.getX();
            int y = a.getY();
            Trash3 trash = new Trash3();
           // System.out.println("X: " + x + "\n");
            
           // System.out.println("Y: " + y + "\n");
            if(frameCt %10 ==0)
            {
                timing = true;
                if((Math.random() * (3 - 1 + 1) + 1) ==1)
                {
                    //getWorld().addObject(trash, x-75, y);
                }
                else
                {
                    //getWorld().addObject(trash, x+70, y);
                }
            }
        }
        
        if (hit)
        {
            timer++; 
            if (timer > 20)
            {
                getWorld().removeObject(speech);
                speech = null;
                timer = 0;
                hit = false;
            }
        }
    }

    private void speechBubbles()
    {
        if (level == 0)
        {
            if(getX() < 360)
            {
                if (speech == null)
                {
                    speech = new Speech("My children need trash!", "black");
                    getWorld().addObject(speech, getX() + 10, 580);
                }
            }
            else
            {
                if (speech != null)
                {
                    getWorld().removeObject(speech);
                }
            }
        }

    }
    
    private void finish()
    {
        if (level == 0 && getX() < 360 && speech == null)
        {
            speech = new Speech("I have brought trash for you my children!", "black");
            getWorld().addObject(speech, getX() + 10, 560);
            Credits credits = new Credits();
            getWorld().addObject(credits, 600, 350);
        }
    }

    private void checkNextLevel() 
    {
        if ((getX() == getWorld().getWidth()-1)) 
        {
            if (level == 0 && (getY() > 620))
            {
                level = 1;
                speech = null;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Farm(this));
            }
            else if (level == 1 && (getY() > 620)) 
            {
                level = 2;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Dump(this, 20, 200));
            }
            else if (level == 2 && (getY() > 620))
            {
                level = 3;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new City(this));
            }
           /* else if (level == 3)
            {
                level = 4;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Farm(this, 1125, 640));
            }*/
        }
        else if ((getX() == 0))
        {
            if (level == 1&& (getY() > 620)) 
            {
                level = 0;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Den(this));
            }
            else if (level == 2 && (getY() < 220))
            {
                level = 1;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Farm(this, 1175, 640));
            }
            else if (level == 3&& (getY() > 620))
            {
                level = 2;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Dump(this, 1175, 640));
            }
            else if (level == 4 && (getY() > 620))
            {
                level = 3;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Den(this));
            }
            
        }
    }
}
