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
    }    
    public void move()
    {
        move(2); 
    }
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
    }
    public void detectWall()
    {
        if(isTouching(Wall.class) )
        {
            setLocation(383, 536); 
        }
    }
}
