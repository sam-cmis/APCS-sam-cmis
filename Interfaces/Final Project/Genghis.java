import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Genghis extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    public Genghis(){
        velocity = 0;
    }
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        fall();
        if (Greenfoot.isKeyDown("w") && isOnSolidGround())jump();
        
         if (Greenfoot.isKeyDown("d")){
            move(1);
            if (isTouching(platform.class))
            {
                move(1);
            }
        }
        if (Greenfoot.isKeyDown("a")){
            move(-1);
            if (isTouching(platform.class))
            {
                move(-1);
            }
        }
    }
    public void fall(){
        setLocation(getX(), getY() + velocity);
        if (isOnSolidGround())
        {
            velocity = 0;
        }
        else velocity += GRAVITY;
        
    }
    public void jump(){
        velocity = -25;
    }
    public boolean isOnSolidGround(){
        boolean isOnGround = false;
        
        if (getY() > getWorld().getHeight() - 70) isOnGround = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, platform.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, platform.class) != null ) isOnGround = true;
        return isOnGround;
    }
     
    //if a key is pressed, shoot a projectile named horse
}
