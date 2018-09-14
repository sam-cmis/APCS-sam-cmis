import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class samuel extends Robot
{
    public samuel(){
        super(Color.MAGENTA);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
        if (isClearRight() == true){
            right();
        }
        
        else if (isClearRight() == false && isClearDown() == false){
            up();
        }
        
        else if (isClearRight() == false && isClearDown() == true){
            down();
        }
        
        else if (isClearUp() == false && isClearDown() == false && isClearRight() == false){
            left();
        }
        
    }
}
