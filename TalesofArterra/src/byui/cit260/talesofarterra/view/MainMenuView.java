/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.GameControl;
import byui.cit260.talesofarterra.model.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author Portal
 */
public class MainMenuView {
    private String menu;
  
    
    public MainMenuView(){
        this.menu = "\n"
                + "\n--------------------------------------------"
                + "\n| Main Menu                                |"
                + "\n--------------------------------------------"
                +"\nN - Start new game"
                +"\nG - Get and start saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save game"
                +"\nQ - Quit"
                +"\n---------------------------------------------"
                ;
    }
    
    void displayMainMenuView() {
       
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        }while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1) {
                System.out.println("\nYou must choose wisely...letters");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        
        //GameControl.createNewGame(GameControl.getPlayer());
        GameControl gameControlObject = new GameControl();
        gameControlObject.createNewGame();
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
        
        System.out.println("\n*** startNewGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** StartSavedGame function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** displayHelpMenu function called ***");
    }

  
    }


