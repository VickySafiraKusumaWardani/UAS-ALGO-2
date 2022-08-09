import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        turn(Greenfoot.getRandomNumber(3));
        keyboardControls();
    }
    
    public void keyboardControls()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(5);
            turn(-5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
            turn(5);
        }
    }
    public void turnAtEdge()
    {
        if(getX() <= 10 || getX() >= getWorld().getWidth() -10)
        {
            turn(180);
        }
        if(getY() <= 10 || getY() >= getWorld().getHeight() -10)
        {
            turn(180);
        }
    }
}
