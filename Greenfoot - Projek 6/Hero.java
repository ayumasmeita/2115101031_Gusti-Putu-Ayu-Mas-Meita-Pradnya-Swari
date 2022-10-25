import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        moveHero();
        shootLaser();
        enemyCollision();
        
    }
    
    private void moveHero()
    {
        if (Greenfoot.isKeyDown("W"))
            setLocation(getX(), getY()-3);
        if (Greenfoot.isKeyDown("S"))
            setLocation(getX(), getY()+3);
        
        if (Greenfoot.isKeyDown("A"))  
            setLocation(getX()-3, getY());
        if (Greenfoot.isKeyDown("D"))
            setLocation(getX()+3, getY()+3);

    }
    
    int laserTimer = 0;
    private void shootLaser(){
        if (laserTimer == 30){
            getWorld().addObject(
                new Laser(),
                getX() + 5,
                getY()

            );
            
            laserTimer =  0;
        }else{
            laserTimer++;
        }
        
    }
    
    public void enemyCollision(){
          if (isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
            
        }else if (isAtEdge())
            getWorld().removeObject(this);
        }
}
