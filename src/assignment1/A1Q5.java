/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author hunterlaverty
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city called moneisley
        City moseisley = new City();
       
        //Create first (0,1) robot
        Robot han = new Robot(moseisley, 0, 1, Direction.WEST);
        han.setLabel("han");
        //Create second (3,3) robot
        Robot chewy = new Robot(moseisley, 3, 3, Direction.EAST);
        chewy.setLabel("chewy");
        
        //Create walls
        new Wall(moseisley, 3, 3, Direction.SOUTH);
        new Wall(moseisley, 3, 3, Direction.EAST);
        new Wall(moseisley, 2, 3, Direction.EAST);
        new Wall(moseisley, 2, 3, Direction.NORTH);
        new Wall(moseisley, 2, 3, Direction.WEST);
        
        //Place things
        new Thing(moseisley, 0, 0);
        new Thing(moseisley, 1, 0);
        new Thing(moseisley, 1, 1);
        new Thing(moseisley, 1, 2);
        new Thing(moseisley, 2, 2);
        
        //han pick up first and second item item and move
        han.move();
        han.pickThing();
        han.turnLeft();
        han.move();
        han.pickThing();
        han.turnLeft();
        
        //chewy pick up it's first item
        chewy.turnLeft();
        chewy.turnLeft();
        chewy.move();
        chewy.turnLeft();
        chewy.turnLeft();
        chewy.turnLeft();
        chewy.move();
        chewy.pickThing();
        
        //Robots meet
        chewy.move();
        chewy.turnLeft();
        han.move();
        han.pickThing();
        chewy.pickThing();
        
        

        
        
        
        
    }
    
}
