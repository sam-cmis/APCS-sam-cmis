import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chandragupta extends Actor
{
    /**
     * Act - do whatever the Character2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("down"))y++;
        if(Greenfoot.isKeyDown("up"))y--;
        if(Greenfoot.isKeyDown("left"))x--;
        if(Greenfoot.isKeyDown("right"))x++;
        setLocation(x, y); 
    }    
    //if a key is pressed, shoot a projectile named ashoka
}
