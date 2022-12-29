import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit2 extends Actor
{
    public Credit2()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
        
    }
    /**
     * Act - do whatever the Credit2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.8),(int)Math.round(getImage().getHeight()*0.8));
            
        }
        if(Greenfoot.mousePressed(this)){
            Greenfoot.delay(10);
            Greenfoot.setWorld(new Credit());
        }
    }
}
