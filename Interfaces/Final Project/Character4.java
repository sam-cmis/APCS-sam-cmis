import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character4 extends Actor
{
    /**
     * Act - do whatever the Character4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("k"))y++;
        if(Greenfoot.isKeyDown("i"))y--;
        if(Greenfoot.isKeyDown("j"))x--;
        if(Greenfoot.isKeyDown("l"))x++;
        setLocation(x, y); 
    }    
}
