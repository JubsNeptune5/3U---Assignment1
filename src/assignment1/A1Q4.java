/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *Moving the robots so that they meet at the same spot around the same time
 * @author hunterlaverty
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city called moneisley
        City moseisley = new City();
        
        //Create first (0,0) robot
        Robot han = new Robot(moseisley, 0, 0, Direction.SOUTH);
        
        //Create second (0,1) robot
        Robot chewy = new Robot(moseisley, 0, 1, Direction.SOUTH);
        
        //Creating wall
        new Wall(moseisley, 0, 1, Direction.WEST);
        new Wall(moseisley, 1, 1, Direction.WEST);
        new Wall(moseisley, 1, 1, Direction.SOUTH);
        
        //Moving first robot
        han.move();
        
        //Move second robot
        chewy.move();
        chewy.turnLeft();
        chewy.move();
        chewy.turnLeft();
        chewy.turnLeft();
        chewy.turnLeft();
        
        //Move first robot
        han.move();
        han.turnLeft();
        
        //Move second robot
        chewy.move();
        chewy.turnLeft();
        chewy.turnLeft();
        chewy.turnLeft();
        
        //First and second robots meet
        han.move();
        chewy.move();
    }
    
}
