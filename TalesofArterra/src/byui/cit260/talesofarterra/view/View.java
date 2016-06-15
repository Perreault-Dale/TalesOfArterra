/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import java.util.Scanner;

/**
 *
 * @author Dale
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;

    public View(String displayMessage) {
        this.displayMessage = displayMessage;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {
            // prompt for input
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            // do the requested action
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        // while a valid name has not been entered
        while(!valid) {
            // prompt for name
            System.out.println(this.displayMessage);
            
            //get value from keyboard entry
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) { //blank value entered
                System.out.println("Sorry, you must enter a value.");
                continue;
            }
            break;
        }
        return value;
    }
}
