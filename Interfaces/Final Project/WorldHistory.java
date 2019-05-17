import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finalproject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldHistory extends World
{
    /**
     * Constructor for objects of class finalproject.
     * 
     */
    public WorldHistory()
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
        Chandragupta character2 = new Chandragupta();
        addObject(character2,63,61);
        Stalin character3 = new Stalin();
        addObject(character3, 759, 51);
        Julius character4 = new Julius();
        addObject(character4,752,554);
        Genghis genghis2 = new Genghis();
        addObject(genghis2,52,555);
    }
}
