/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.model.Character;
import java.util.Scanner;

/**
 *
 * @author Dale
 */
public class CharacterCreateView {
    
    private final int abilityPoints;
    private final String promptMessage;

    public CharacterCreateView() {
        this.displayBanner();
        this.abilityPoints = 30;
        this.promptMessage = "\nPlease enter your character's name: ";
    }

    private void displayBanner() {
        System.out.println(
            "\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Character Creation Menu                                      *"
          + "\n*                                                              *"
          + "\n****************************************************************");
    }
    
    public void displayMenuView() {
        boolean done = false;
        do {
            String charName = this.getCharacterName();
            if (charName.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(charName);
        }
        while(!done);
    }

    private String getCharacterName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            System.out.println(this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("Sorry, your character's name cannot be blank.");
                continue;
            }
            
            break;
        }
        return value;
    }

    private boolean doAction(String charName) {
        Character playerChar = CharacterControl.createPlayer(charName);
        if (playerChar == null) {
            System.out.println("\nError: Failed to create the character.");
            return false;
        }
        
        this.displayGenderView(playerChar);
        
        return true;
    }

    private void displayGenderView(Character playerChar) {
        boolean done = false;
        do {
            String menuOption = this.getGenderOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doGenderAction(playerChar,menuOption);
        }while (!done);
        
        AbilitiesMenuView abilitiesView = new AbilitiesMenuView(playerChar,abilityPoints);
        abilitiesView.displayMenuView();
        FeatsMenuView featsMenu = new FeatsMenuView(playerChar);
        System.out.println(playerChar.toString());
    }

    private String getGenderOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        String menu = "\nSelect a gender for your human character:"
                + "\n\nM – Male"
                + "\nF – Female\n";
        
        while (!valid){
            System.out.println(menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1) {
                System.out.println("\nSorry to be so binary, but you must select one gender");
                continue;
            }
            break;
        }
        return value;
    }
    
    private boolean doGenderAction(Character playerChar, String choice) {
        
        choice = choice.toUpperCase();
        CharacterControl charCtl = new CharacterControl();
        
        switch (choice) {
            case "M":
                charCtl.inputGender(playerChar,'M');
                return true;
            case "F":
                charCtl.inputGender(playerChar,'F');
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
        
}
