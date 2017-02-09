/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

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
        Robot han = new Robot(moseisley, 0, 1, Direction.SOUTH);
        
        //Create second (3,3) robot
        Robot chewy = new Robot(moseisley, 3, 3, Direction.SOUTH);
        
    }
    
}
