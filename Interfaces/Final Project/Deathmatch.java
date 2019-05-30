import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deathmatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deathmatch extends World
{

    /**
     * Constructor for objects of class Deathmatch.
     * 
     */
    public Deathmatch()
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
        Stalin stalin = new Stalin();
        addObject(stalin,746,448);
        Platform platform = new Platform();
        addObject(platform, 12, 289);
        Platform platform2 = new Platform();
        addObject(platform2, 74, 289);
        Platform platform3 = new Platform();
        addObject(platform3, 139, 289);
        Platform platform4 = new Platform();
        addObject(platform4, 11, 589);
        Platform platform5 = new Platform();
        addObject(platform5, 75, 589);//
        Platform platform6 = new Platform();
        addObject(platform6, 523, 526);////
        Platform platform7 = new Platform();
        addObject(platform7, 459, 589);//hi
        Platform platform8 = new Platform();
        addObject(platform8, 139, 589);
        Platform platform9 = new Platform();
        addObject(platform9, 203, 589);
        Platform platform10 = new Platform();
        addObject(platform10, 587, 589);
        Platform platform11 = new Platform();
        addObject(platform11, 651, 589);
        Platform platform12 = new Platform();
        addObject(platform12, 267, 589);
        Platform platform13 = new Platform();
        addObject(platform13, 331, 589);//this
        Platform platform14 = new Platform();
        addObject(platform14, 395, 589);//that
        Platform platform15 = new Platform();
        addObject(platform15, 715, 589);
        Platform platform16 = new Platform();
        addObject(platform16, 779, 589);
        Platform platform17 = new Platform();
        addObject(platform17, 31, 225);
        Platform platform18 = new Platform();
        addObject(platform18, 523, 589);
        Platform platform19 = new Platform();
        addObject(platform19, 587, 589);
        Platform platform20 = new Platform();
        addObject(platform20, 523, 225);///////
        Platform platform21 = new Platform();
        addObject(platform21, 523, 589);
        Platform platform22 = new Platform();
        addObject(platform22, 459, 526);
        Platform platform23 = new Platform();
        addObject(platform23, 395, 526);
        Platform platform25 = new Platform();
        addObject(platform25, 587, 225);
        Platform platform26 = new Platform();
        addObject(platform26, 267, 417);
        Platform platform27 = new Platform();
        addObject(platform27, 715, 353);
    }
}
