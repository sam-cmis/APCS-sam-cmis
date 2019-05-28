import greenfoot.*;  

public class skills extends Actor
{
    private int damage;
    private int range; 
    
    public skills(){ 
        damage = 20; 
        range = (int)(Math.random()*20)+50; 
    }

    public void act() 
    {
        move(10); 
        range --; 
        if (range == 0 || getX() == 0 || getX() == 1239){
            horse Horse = new horse();
            getWorld().addObject(Horse, getX(), getY()); 
            Horse.setRotation((int)(Math.random()*360)); 
            getWorld().removeObject(this); 
        }
    }   
}