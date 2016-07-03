/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.GameControl;
import byui.cit260.talesofarterra.control.SceneControl;
import byui.cit260.talesofarterra.exceptions.SceneControlException;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Portal
 */
public class MainMenuView extends View {
    
    public MainMenuView(){

        //local variables.

        super("\n"

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
                +"\nM - Game Menu Test                           "
                +"\nT - Store Test                               "                
                +"\n---------------------------------------------");
    }
    

    @Override
    public boolean doAction(String choice) {

        
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
            case "M":
                this.startGameMenu();
            case "T":
                this.storeMenu();                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            }
        return false;
        }

    private void startNewGame() {
        
        CharacterCreateView ccv = new CharacterCreateView();
        ccv.display();
        GenderView genderView = new GenderView();
        genderView.display();
        AbilitiesMenuView abv = new AbilitiesMenuView(30);
        abv.display();
        SkillsView skillView = new SkillsView();
        skillView.display();
        FeatsMenuView featsView = new FeatsMenuView();
        featsView.display();
        
        GameControl gameControlObject = new GameControl();
        gameControlObject.createNewGame(TalesofArterra.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        }

    private void startExistingGame() {
        System.out.println("\n*** StartSavedGame function called ***");
        }

    private void displayHelpMenu() {
        HelpMenuView getMeHelp = new HelpMenuView();
        getMeHelp.display();
        }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
        }
    private void startBattleView() {
        BattleView battleViewObject = new BattleView();
        battleViewObject.display();
        }
    private void startGameMenu() {
        
        GameMenuView gameMenuViewObject = new GameMenuView ();
        gameMenuViewObject.display();
    
        }

    private void storeMenu() {
        SceneControl sc = new SceneControl();
        try {
            sc.storeInventory();
            //SceneControl.storeInventory();
        } catch(SceneControlException sce) {
            System.out.println(sce.getMessage());
        }
    }
            
    }


