import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
<<<<<<< HEAD
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
=======
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
>>>>>>> 40f513dd49c429a7bf421943d5942aaa76c1f514
        move(1);
    }
    }    
}
