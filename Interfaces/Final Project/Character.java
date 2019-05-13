import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    public Character(){
        velocity = 0;
    }
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("s"))y++;
        if(Greenfoot.isKeyDown("w"))y--;
        if(Greenfoot.isKeyDown("a"))x--;
        if(Greenfoot.isKeyDown("d"))x++;
        setLocation(x, y);   
        
        fall();
        if (Greenfoot.isKeyDown("space"))jump();
    }
    public void fall(){
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 50)velocity = 0;
        else velocity += GRAVITY;
    }
    public void jump(){
        velocity = -20;
    }
}
