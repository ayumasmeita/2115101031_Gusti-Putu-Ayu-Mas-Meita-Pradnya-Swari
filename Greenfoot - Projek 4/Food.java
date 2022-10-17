import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{   
   public  Food(){
        setRotation(180);
    }
    public Food(int speed){
        setRotation(180);
        this.speed = speed;
    }
    
    public int speed = 2;
    public void act()
    {
        move(speed);
        
        World w = getWorld();
        if(isAtEdge())
        {
            //w.removeObject(this);
            setLocation(590,getY());
        }
    }
    
}
