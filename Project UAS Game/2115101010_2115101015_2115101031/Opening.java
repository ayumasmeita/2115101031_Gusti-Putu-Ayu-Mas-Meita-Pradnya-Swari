import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Opening extends World
{
    /**
     * Constructor for objects of class Opening.
     * 
     */
    public static GreenfootSound bg = new GreenfootSound("game.mp3");
    public Opening()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        bg.playLoop();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play play = new Play();
        addObject(play,110,280);

        Credit2 credit2 = new Credit2();
        addObject(credit2,290,282);
    }
}
