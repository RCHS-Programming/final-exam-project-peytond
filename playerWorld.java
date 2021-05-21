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
        
        addObject(new Castle(), 510, 410); 
        addObject(new ScorePanel(), 76, 540); 
        addObject(new Spider(), 233, 535); 
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
            addObject(new Wall("edge2.png"), 558, 33); 
        }
            for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 33); 
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
            addObject(new Wall("edge2.png"), 397, 124); 
        }       
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 408); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 310); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 156); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 251); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 360); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 711, 263); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 761, 263); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 408); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 300); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 558, 455); 
        }
        /*
         * New Section - 
         */
        for (int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 348); 
        }
        for (int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 395); 
        }
        for (int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 578); 
        }
        for (int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 673, 429); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 521, 467);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 474, 467); 
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 461, 431);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 461, 382);
        } 
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 461, 333);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 461, 283);
        }
        //Moving on
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 426, 270);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 377, 270);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 335, 270);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 327, 556);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 327, 506);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 327, 459);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 327, 412);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 327, 396);
        }
        
        //scoreboard
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 50, 492);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 100, 492);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 144, 554);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 144, 505);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 123, 492);
        }
        
        //finish maze
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 144, 455);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 144, 406);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 144, 356);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 144, 306);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 177, 421);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 396, 172);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 227, 327);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge.png"), 111, 321);
        }
        
        //add player
        addObject (new Player(), 124, 109);
        //add cupcakes
        addObject (new Cupcake(), 321, 103);
        addObject (new Cupcake(), 732, 63);
        addObject (new Cupcake(), 732, 214);
        addObject (new Cupcake(), 612, 295);
        addObject (new Cupcake(), 733, 317);
        addObject (new Cupcake(), 733, 540);
        addObject (new Cupcake(), 397, 317);
        addObject (new Cupcake(), 78, 441);
        addObject (new Cupcake(), 192, 474);
        addObject (new Cupcake(), 228, 213);
        
        //Scoreboard text
        showText("Eaten : ", 61, 516); 
        
    }
}
