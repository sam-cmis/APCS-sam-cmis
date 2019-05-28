import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fire extends Actor
{
     public void fire(){
        skills Skill = new skills(); 
        getWorld().addObject(Skill, getX(), getY() + 20); 
        if(){
            weapon.setRotation(180); 
            weapon.move(50); 
        }
    }
}
