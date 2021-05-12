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

        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 12);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 12, 25 + 50*i);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 765 + 25,50*i );
        }
        
        //Partial wall in the top left of the maze
        for(int i = 0; i < 7; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 150);
        }
        //Partial wall above top left of the maze
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 190 + 25, 50*i);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 374, 150); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 424, 150); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 473, 150); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 522, 150); 
        }
        //Obstacles 
        for (int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 163);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 50); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 672, 100); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 205); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 213); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 260); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 571, 273); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 755, 272); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 397, 124); 
        }
    }
}
