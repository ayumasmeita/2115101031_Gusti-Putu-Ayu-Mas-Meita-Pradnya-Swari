import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wukong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wukong extends Actor
{
    /**
     * Act - do whatever the Wukong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-5, getY());
        }
        
        Banana1 a = (Banana1)getOneIntersectingObject(Banana1.class);
        if(a != null){
            getWorld().removeObject(a);
            Greenfoot.playSound("hit.wav");
            Level1.score.add(5);
            Level2.score.add(5);
        }
        Banana2 b = (Banana2)getOneIntersectingObject(Banana2.class);
        if(b != null){
            getWorld().removeObject(b);
            Greenfoot.playSound("hit.wav");
            Level1.score.add(3);
            Level2.score.add(3);
        }
        Fireball c = (Fireball)getOneIntersectingObject(Fireball.class);
        if(c != null){
            getWorld().removeObject(c);
            Greenfoot.playSound("Fireball03.wav");
            Level1.hp.add(-2);
            Level2.hp.add(-2);
        }
        Bom d = (Bom)getOneIntersectingObject(Bom.class);
        if(d != null){
            getWorld().removeObject(d);
            Greenfoot.playSound("blast.wav");
            Level2.hp.add(-2);
        }
        
    }
}
