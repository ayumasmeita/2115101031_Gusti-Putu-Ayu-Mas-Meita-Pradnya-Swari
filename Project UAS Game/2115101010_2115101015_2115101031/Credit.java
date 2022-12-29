import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{
    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        showText("Nama Pembuat Game : ",200,230);
        showText("Ni Putu Ari Kusumadewi (2115101010)",200,260);
        showText("Okthen Orlanda Naitboho (2115101015)",200,290);
        showText("Ayu Mas Meita Pradnya Swari (2115101031)",200,320);
       
        Kembali kembali = new Kembali();
        addObject(kembali,200,440);
    }
}
