import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victory extends World
{

    /**
     * Constructor for objects of class Victory.
     * 
     */
    public Victory()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 400, 1); 
        
        Genghis genghis = new Genghis();
        addObject(genghis, 305, 38);
       
    }
}
