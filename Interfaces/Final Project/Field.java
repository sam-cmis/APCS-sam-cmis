import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finalproject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends World
{
    /**
     * Constructor for objects of class finalproject.
     * 
     */
    public Field()
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
        addObject(character2,735,463);
        Genghis genghis2 = new Genghis();
        addObject(genghis2,39,470);
        platform platform2 = new platform();
        addObject(platform2,127,285);
        platform2.setLocation(139,289);
        platform platform3 = new platform();
        addObject(platform3,79,289);
        platform3.setLocation(75,289);
        platform platform4 = new platform();
        addObject(platform4,19,288);
        platform4.setLocation(11,289);
        platform platform5 = new platform();
        addObject(platform5,535,554);
        platform5.setLocation(522,543);
        platform platform6 = new platform();
        addObject(platform6,719,556);
        platform6.setLocation(715,545);
        platform platform7 = new platform();
        addObject(platform7,468,564);
        platform7.setLocation(458,598);
        platform platform8 = new platform();
        addObject(platform8,728,377);
        platform8.setLocation(780,591);
        platform platform9 = new platform();
        addObject(platform9,95,540);
    
        platform platform10 = new platform();
        addObject(platform10,27,546);
        
        
    }
}
