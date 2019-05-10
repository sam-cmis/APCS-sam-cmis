import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finalproject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finalproject extends World
{
    /**
     * Constructor for objects of class finalproject.
     * 
     */
    public finalproject()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Character character = new Character();
        addObject(character,23,30);
        Character2 character2 = new Character2();
        addObject(character2,50,60);
    }
}
