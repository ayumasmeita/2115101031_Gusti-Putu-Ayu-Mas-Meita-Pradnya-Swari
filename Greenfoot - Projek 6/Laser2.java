import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser2 extends Actor
{
    /**
     * Act - do whatever the Laser2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
        laserCollision();
        setRotation(180);
    }

    
    public void laserCollision(){
        if (isTouching(Hero.class)){
            
            getWorld().addObject(
                new Ledakan(),
                getX(),

                getY()
            );
            
            removeTouching(Hero.class);
            getWorld().removeObject(this);
        }else if (isAtEdge())
            getWorld().removeObject(this);
    }
}
