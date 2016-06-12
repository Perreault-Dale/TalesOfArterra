/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.GameControl;

import java.util.Scanner;

/**
 *
 * @author Portal
 */
public class MainMenuView {
    private final String menu;
  
    
    public MainMenuView(){
        this.menu = "\n"
                + "\n--------------------------------------------"
                + "\n|  Main Menu                                |"
                + "\n--------------------------------------------"
                +"\nN - Start new game"
                +"\nG - Get and start saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save game"
                +"\nQ - Quit"
                +"\n---------------------------------------------"
                +"\n ## Test Area menu options                 ##"
                +"\nB - Battle view test"
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
                return true;
            case "G":
                this.startExistingGame();
                return true;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "B":
                this.startBattleView();
                return true;
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
        
        CharacterCreateView ccv = new CharacterCreateView();
        ccv.displayMenuView();
        }

    private void startExistingGame() {
        System.out.println("\n*** StartSavedGame function called ***");
        }

    private void displayHelpMenu() {
        HelpMenuView getMeHelp = new HelpMenuView();
        getMeHelp.menuChoice();
        }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
        }
    private void startBattleView() {
        BattleView battleViewObject = new BattleView();
        battleViewObject.displayBattleMenuView();
        }
            
    }


