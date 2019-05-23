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
        velocity = 5;
    }
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        fall();
        if (Greenfoot.isKeyDown("w") && getY() > getWorld().getHeight() - 50)jump();
    }
    public void fall(){
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 50)velocity = 0;
        else velocity += GRAVITY;
    }
    public void jump(){
        velocity = -10;
    }
    public void move(){
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("a"))x--;
        if(Greenfoot.isKeyDown("d"))x++;
        setLocation(x, y);   
    }
    //if a key is pressed, shoot a projectile named horse
}
