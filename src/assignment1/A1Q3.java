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
 *Moving "flag" to top of the hill then going back down 
 * @author laveh2107
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create a city called moneisley
        City moseisley = new City();
        
         //creating "hill"  
         new Wall(moseisley, 3, 2, Direction.WEST);
         new Wall(moseisley, 3, 2, Direction.NORTH);
         new Wall(moseisley, 2, 3, Direction.WEST);
         new Wall(moseisley, 1, 3, Direction.WEST);
         new Wall(moseisley, 1, 3, Direction.NORTH);
         new Wall(moseisley, 1, 3, Direction.EAST);
         new Wall(moseisley, 2, 4, Direction.NORTH);
         new Wall(moseisley, 2, 4, Direction.EAST);
         new Wall(moseisley, 3, 4, Direction.EAST);
         
         //placing "thing" 
         new Thing(moseisley, 3, 1);
         
         //Create robot
        Robot han = new Robot(moseisley, 3, 0, Direction.EAST);
        
         //move to pick up "flag"
        han.move();
        han.pickThing();
        
        //Move flag to the hill
        han.turnLeft();
        han.move();
        han.turnLeft();
        han.turnLeft();
        han.turnLeft();
        han.move();
        han.turnLeft();
        han.move();
        han.move();
        han.turnLeft();
        han.turnLeft();
        han.turnLeft();
        han.move();
        han.putThing();
        
        //travell down hill
        han.move();
        han.turnLeft();
        han.turnLeft();
        han.turnLeft();
        han.move();
        han.turnLeft();
        han.move();
        han.turnLeft();
        han.turnLeft();
        han.turnLeft();
        han.move();
        han.move();
        han.turnLeft();
        
}
}
