import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character3 extends Actor
{
    /**
     * Act - do whatever the Character3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("5"))y++;
        if(Greenfoot.isKeyDown("8"))y--;
        if(Greenfoot.isKeyDown("4"))x--;
        if(Greenfoot.isKeyDown("6"))x++;
        setLocation(x, y); 
    }    
}
