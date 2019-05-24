import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Julius extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    public Julius(){
        velocity = 5;
    }

    /**
     * Act - do whatever the Character4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

        if (Greenfoot.isKeyDown("u")){
            move(1);
            if (isTouching(platform.class)){
                move(-1);
            }
        }
        if (Greenfoot.isKeyDown("j")){
            move(1);
            if (isTouching(platform.class)){
                move(-1);
            }
        }
    }

    public void fall(){
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 50)velocity = 0;
        else velocity += GRAVITY;
    }

    public void jump(){
        velocity = -10;
    }

    //if a key is pressed, shoot a projectile named veto
}
