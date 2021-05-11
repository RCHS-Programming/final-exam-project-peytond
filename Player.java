import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * You will play as this character, and attempt to beat the m
 * 
 * @author Peyton Dunn 
 * @version 5/11/21
 */
public class Player extends Actor
{
    private int lives; 
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectCastle();
        detectWallCollision();
        lives = 3;
    }    
    public void detectCastle()
    {
        if(isTouching(Castle.class) )
        {
            Greenfoot.stop();
        }
    }
    public void detectWallCollision()
    {
        if(isTouching(Wall.class) )
        {
            lives = lives - 1; 
        }
    }
}

