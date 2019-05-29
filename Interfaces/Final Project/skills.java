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
        
    }   
    
    
}