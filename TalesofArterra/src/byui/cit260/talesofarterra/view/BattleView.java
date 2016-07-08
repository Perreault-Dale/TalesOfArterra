
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.AttackControl;
import byui.cit260.talesofarterra.control.CharacterControl;
import byui.cit260.talesofarterra.control.ItemControl;
import talesofarterra.TalesofArterra;



public class BattleView extends View {
    

    public BattleView () {
        super("\n "
                + "\n****************************************************"
                + "\n| Battle Menu                                      |"
                + "\n****************************************************"
                + "\n1. Attack, man mode"
                + "\n2. Drink health potion, woops"
                + "\n3. Run!, ya coward!"
                + "\n****************************************************"
        );
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1" :
                this.startNewAttack();
                break;
            case "2" :
                this.drinkPotion();
                break;
            case "3" : 
                this.exitCombat();
               {
                    try {
                        int i = Integer.parseInt(choice);
                       
                        break;
                    } catch(NumberFormatException nfe) {
                        this.console.println("\nPlease select a valid entry (1-4,H)");
                    }
                }
            default :
                this.console.println("\n*** you have chosen poorly *** Try again");
                break;
        }
        return false;
        
    }   

    private void startNewAttack() {
    
        AttackControl attackControlObject = new AttackControl ();
        attackControlObject.createNewAttack();
        
       
        }

    private void drinkPotion (){
        CharacterControl cc = new CharacterControl();
        cc.healPartial(TalesofArterra.getGame().getPlayer().getPlayerChar(), 20);
    }
    
    
    
    private void exitCombat() {
        this.console.println("\n*** startExitingGame function called ***");
    }
}
