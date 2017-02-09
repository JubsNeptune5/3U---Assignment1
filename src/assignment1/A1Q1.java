package assignment1;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Robot moving clockwise around the square
 * @author laveh2107
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city called moneisley
        City moneisley = new City();
     
         //creating walls  
         new Wall(moneisley, 3, 1, Direction.WEST);
         new Wall(moneisley, 4, 1, Direction.WEST);
         new Wall(moneisley, 3, 1, Direction.NORTH);
         new Wall(moneisley, 3, 2, Direction.NORTH);
         new Wall(moneisley, 3, 2, Direction.EAST);
         new Wall(moneisley, 4, 2, Direction.EAST);
         new Wall(moneisley, 4, 1, Direction.SOUTH);
         new Wall(moneisley, 4, 2, Direction.SOUTH);
         
           //creating a robot in moseisley, then moving it around the wall clockwise
         Robot han = new Robot(moneisley, 2, 1, Direction.EAST);
         han.move();
         han.move();
         han.turnLeft();
         han.turnLeft();
         han.turnLeft();
         han.move();
         han.move();
         han.move();
         han.turnLeft();
         han.turnLeft();
         han.turnLeft();
         han.move();
         han.move();
         han.move();
         han.turnLeft();
         han.turnLeft();
         han.turnLeft();
         han.move();
         han.move();
         han.move();
         han.turnLeft();
         han.turnLeft();
         han.turnLeft();
         han.move();
         
    }
}
