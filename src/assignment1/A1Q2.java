/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *Picking up an object and moving it through a course
 * @author laveh2107
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create a city called moneisley
        City moneisley = new City();
     
         //creating walls  
         new Wall(moneisley, 2, 1, Direction.WEST);
         new Wall(moneisley, 1, 1, Direction.WEST);
         new Wall(moneisley, 1, 1, Direction.NORTH);
         new Wall(moneisley, 1, 2, Direction.NORTH);
         new Wall(moneisley, 1, 2, Direction.EAST);
         new Wall(moneisley, 1, 2, Direction.SOUTH);
         new Wall(moneisley, 2, 1, Direction.SOUTH);
    
         //Creating thing to be picked up
         new Thing(moneisley, 2, 2);
         
         //Creating robot to be in moneisley
         Robot han = new Robot(moneisley, 1, 2, Direction.SOUTH);
         
         //Move to the thing
         han.turnLeft();
         han.turnLeft();
         han.turnLeft();
         han.move();
         han.turnLeft();
         han.move();
         han.turnLeft();
         han.move();
        
         //pick up thing
        han.pickThing();
        
        //move thuing back to "bed"
        han.turnLeft();
        han.turnLeft();
        han.move();
        han.turnLeft();
        han.turnLeft();
        han.turnLeft();
        han.move();
        han.turnLeft();
        han.turnLeft();
        han.turnLeft();
        han.move();
        han.turnLeft();
        han.turnLeft();
        han.turnLeft();
        
        //place thing in 'bed'
        han.putThing();
        
        
        
        
    }
}
