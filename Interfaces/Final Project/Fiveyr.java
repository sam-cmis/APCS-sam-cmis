import greenfoot.*;  
public class Fiveyr extends skills
{
    private int life = 10;
    
    public void act() 
    {
        life--; 
        if (life == 0){
            getWorld().addObject(new Bomb(),getX(),getY());
            getWorld().removeObject(this); 
        }
        
        move(10);
    }    
}