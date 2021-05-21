import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author Peyton Dunn 
 * @version 5/18/21
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        randomTurn(); 
        detectWall();
        move();
        turnAtEdge();
    }    
    public void move()
    {
        move(1); 
    }
    public void turnAtEdge()
    {
        if(isAtEdge() )
        {
            turn(4);
        }
    }
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91) - 60);
        }
    }
    public void detectWall()
    {
        if(isTouching(Wall.class) )
        {
            setLocation(233, 545); 
        }
    }
}
