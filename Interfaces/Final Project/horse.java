import greenfoot.*;  
public class horse extends skills
{
    private int life = 50;
    
    public void act() 
    {
        life--; 
        if (life == 0){
            getWorld().addObject(new Splash(),getX(),getY());
            getWorld().removeObject(this); 
        }
        
        move(3);
    }    
}