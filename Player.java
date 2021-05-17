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
    private int cupcakeEaten;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectCastle();
        detectWallCollision();
        lives = 3;
        playerMovement();
        cupcakeEaten = 0;
        lookForCupcake();
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
            setLocation (74, 105);
            lives = lives - 1; 
            
            getWorld(). showText("Lives: " + lives, 60, 515);

            if(lives == 0)
            {
                Greenfoot.stop(); 
            }
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
            
            getWorld(). showText("Lives: " + lives, 60, 515);
            getWorld(). showText("Eaten: " + cupcakeEaten, 60, 558);
            

        }
    }
}

