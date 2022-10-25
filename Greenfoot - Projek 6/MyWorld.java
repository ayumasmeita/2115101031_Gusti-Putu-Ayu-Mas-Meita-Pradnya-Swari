import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy = new Enemy();
        addObject(enemy,146,200);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,526,101);
        Hero hero = new Hero();
        addObject(hero,354,157);
    }
    
    public void act(){
        spawnEnemy();
        spawnEnemy2();
    }
    
    public int timerEnemy =  0;
    public void spawnEnemy(){
        if (timerEnemy==180) {//jika timer=3 detik
            //Enemy enemy = new Enemy();
            addObject(new Enemy(), 599, Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        }else{
            timerEnemy++;
        }
    }
    
    public int timerEnemy2 =  0;
     public void spawnEnemy2(){
        if (timerEnemy2==180) {//jika timer=3 detik
            //Enemy enemy = new Enemy();
            addObject(new Enemy2(), 599, Greenfoot.getRandomNumber(400));
            timerEnemy2 = 0;
        }else{
            timerEnemy2++;
        }
    }
}
