import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy2()
    {
        super();
       
    }
    
    public Enemy2(int speed){
        super(speed);
    }
    
    public int speed = 1;
    public void act()
    {
        move(speed);
        shootLaser();


        World w = getWorld();
        if(isAtEdge())
        {
            setLocation(590,getY());
        }
    }
    
    int laser2Timer = 0;
    public void shootLaser(){
        if (laser2Timer == 60){
            getWorld().addObject(
                new Laser2(),
                getX() + 5,
                getY()

            );
            
            laser2Timer =  0;
        }else{
            laser2Timer++;
        }
    
    }
    
}
