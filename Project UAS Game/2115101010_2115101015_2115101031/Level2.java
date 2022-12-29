import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    public static Counter score = new Counter("Score: ");
    public static Counter hp = new Counter("HP: ");
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public static GreenfootSound bg2 = new GreenfootSound("game.mp3");
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        Level1.bg1.stop();
        Greenfoot.delay(5);
        bg2.playLoop();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wukong wukong = new Wukong();
        addObject(wukong,188,515);

        addObject(score,55,21);
        score.setValue(0);
        
        addObject(hp,345,21);
        hp.setValue(10);
        
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(500)<3){
            addObject(new Banana1(),Greenfoot.getRandomNumber(getWidth()),5);
        }
        if(Greenfoot.getRandomNumber(500)<3){
            addObject(new Banana2(),Greenfoot.getRandomNumber(getWidth()),5);
        }
        if(Greenfoot.getRandomNumber(500)<2){
            addObject(new Fireball(),Greenfoot.getRandomNumber(getWidth()),5);
        }
        if(Greenfoot.getRandomNumber(500)<2){
            addObject(new Bom(),Greenfoot.getRandomNumber(getWidth()),5);
        }
        
        if(Level2.score.getValue()>=100)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Congratulation());
        }
        if(Level2.hp.getValue()<=0)
        {
            Greenfoot.setWorld(new Closing());
        }
    }
}
