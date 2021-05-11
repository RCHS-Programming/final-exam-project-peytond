import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the background. 
 * 
 * @author Peyton Dunn 
 * @version 5/11/21
 */
public class playerWorld extends World
{

    /**
     * Constructor for objects of class playerWorld.
     * 
     */
    public playerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObject(new Wall(), 24, 10);  
        addObject(new Wall(), 74, 10);
        addObject(new Wall(), 124, 10);
        addObject(new Wall(), 174, 10); 
        addObject(new Wall(), 224, 10);
        addObject(new Wall(), 254, 10); 
        addObject(new Wall(), 304, 10); 
    }
}
