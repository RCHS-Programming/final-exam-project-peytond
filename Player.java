import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * You will play as this character, and attempt to beat the m
 * 
 * @author Peyton Dunn 
 * @version 5/11/21
 */
public class Player extends Actor
{
    private int cupcakeEaten;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        cupcakeEaten = 0;
    }
    public void act() 
    {
        detectCastle();
        detectWallCollision();
        playerMovement();
        lookForCupcake();
        detectSpider(); 
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
            setLocation(124, 109);
        }
    }
    public void playerMovement()
    {
        if(Greenfoot.isKeyDown("up") )
        {
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("down") )
        {
            setLocation(getX(), getY() + 3); 
        }
        if(Greenfoot.isKeyDown("left") )
        {
            setLocation(getX() -3, getY() );
        }
        if(Greenfoot.isKeyDown("right") )
        {
            setLocation(getX() + 3, getY() );
        }
    }
    public void lookForCupcake()
    {
        if(isTouching(Cupcake.class) )
        {
            removeTouching(Cupcake.class);
            cupcakeEaten = cupcakeEaten + 1; 
            
            getWorld(). showText("Eaten: " + cupcakeEaten, 61, 516);
            
        }
    }
    public void detectSpider()
    {
        if(isTouching(Spider.class) )
        {
            setLocation(124, 109);
        }
    }
}

