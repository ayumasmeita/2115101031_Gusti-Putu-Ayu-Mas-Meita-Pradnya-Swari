import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Congratulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Congratulation extends World
{
    /**
     * Constructor for objects of class Congratulation.
     * 
     */
    public Congratulation()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
        /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        showText("Your Score : " +Level1.score.getValue()+ " point",200,320);

        Exit exit = new Exit();
        addObject(exit,200,385);

    }
    
    public void act()
    {
        Level2.bg2.stop();
    }
}
