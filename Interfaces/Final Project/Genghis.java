import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Genghis extends Actor implements Characters
{
    private final int GRAVITY = 1;
    private int velocity;
    private int mana;
    private int cooltime = 1;
    private int health;
    private boolean winner;
    
    public void setHealth(int x)
    {
        health -= x;
    }
    
    public Genghis(){
        velocity = 0;
        health = 100;
    }

    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();
        if (Greenfoot.isKeyDown("w") && isOnSolidGround())jump();

        if (Greenfoot.isKeyDown("d")){
            move(1);
            if (hitPlatformR())
            {
                move(-1);
            }
        }
        if (Greenfoot.isKeyDown("a")){
            move(-1);
            if (hitPlatformL())
            {
                move(1);
            }
        }
        if (Greenfoot.isKeyDown("f")){
            setRotation (getRotation()-1);

        }
        if (Greenfoot.isKeyDown("g")){
            setRotation (getRotation()+1);

        }  
        if  (Greenfoot.isKeyDown("e") && mana > 50){

            fire();
            mana = 0;
        }
        mana++;
        damage();
        hitPlatformL();
        hitPlatformR();
        getKilled();
    }

    public void fall(){
        setLocation(getX(), getY() + velocity);
        if (isOnSolidGround())
        {
            velocity = 0;
            
        }
        else velocity += GRAVITY;

    }

    public void jump(){
        velocity = -15;
    }

    public boolean isOnSolidGround(){
        boolean isOnGround = false;

        if (getY() > getWorld().getHeight() - 70) isOnGround = true;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, Platform.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, Platform.class) != null ) isOnGround = true;
        return isOnGround;
    }

    public void fire(){
        horse horses = new horse();
        getWorld().addObject(horses, getX(),getY());
        horses.setRotation(getRotation());
        horses.move(30);
    }

    
    public boolean getWinner(){
        return winner;
    }
        
    
    private boolean hitPlatformL(){
        Actor hitL = getOneObjectAtOffset(-getImage().getWidth() / 2, 0, Platform.class);
        return hitL != null;
    }

    private boolean hitPlatformR(){
        Actor hitR = getOneObjectAtOffset(getImage().getWidth() / 2, 0, Platform.class);
        return hitR != null;
    }
    
    public Characters getCharacter(){
        return new Genghis();
    }
    
    public void damage(){
        if (isTouching(Splash.class)){
            setHealth(100);
        }
        if (isTouching(Stalin.class)){
            setHealth(100);
        }
    }
    public void getKilled(){
        
        if (health == 0 && !isTouching(Stalin.class)){
            Death death = new Death();
            getWorld().addObject(death, getX(), getY());
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Deathmatch());
            winner = false;
        }
        else if (health == 0 && isTouching(Stalin.class)){
            getWorld().removeObject(this); 
            Greenfoot.setWorld(new End()); 
        }
    }
}