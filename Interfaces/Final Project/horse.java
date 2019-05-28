import greenfoot.*;  
public class horse extends Actor
{
    private int lifeTime; 
    
    public horse(){
        lifeTime = 10; 
    }
    
    public void act() 
    {
        lifeTime--; 
        if (lifeTime == 0){
            getWorld().removeObject(this); 
        }
    }    
}