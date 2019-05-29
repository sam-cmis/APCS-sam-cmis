import greenfoot.*;  
public class Ashoka extends skills
{
    private int life = 10;
    
    public void act() 
    {
        life--; 
        if (life == 0){
            getWorld().addObject(new Splash(),getX(),getY());
            getWorld().removeObject(this); 
        }
        
        move(-30);
    }    
}