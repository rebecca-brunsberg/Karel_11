/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author Rebecca Brunsberg
 * @version 8th December 2014
 *
 */

import edu.fcps.karel2.Display; 
import edu.fcps.Digit;

public class Lab11 {
  
  public static void main(String[] args) {
   
    Display.openWorld("default.map");
     Display.setSize(36, 32);
    
    Digit first = new Zero(1, 9);
    Digit second =  new One(7,9);
    Digit third =  new Two(1,20);
    Digit fourth =  new Three(7,20);
 
    first.display();
    second.display();
    third.display();
    fourth.display();
  }
  
 }
