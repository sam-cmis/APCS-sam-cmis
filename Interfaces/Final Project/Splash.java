import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Splash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splash extends Actor
{
      private int life = 10;
    
    /**
     * Act - do whatever the Splash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    
        life--; 
        if (life == 0){
            getWorld().removeObject(this); 
        }
        
        
    }    // Add your action code here.
    }    
