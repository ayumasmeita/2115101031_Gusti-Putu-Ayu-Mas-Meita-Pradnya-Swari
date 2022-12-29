import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana2 extends Actor
{
    /**
     * Act - do whatever the Banana2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+3);
        if(isAtEdge())
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
}
