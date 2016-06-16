
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.AttackControl;
import byui.cit260.talesofarterra.control.ItemControl;



public class BattleView extends View {
    

    public BattleView () {
        super("\n "
                + "\n****************************************************"
                + "\n| Battle Menu                                      |"
                + "\n****************************************************"
                + "\nA. Attack, man mode"
                + "\nD. Drink health potion, woops"
                + "\nR. Run!, ya coward!"
                + "\n****************************************************"
        );
        }
   /* void displayBattleMenuView() {
        
        boolean done = true;
        
        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("R"))
                return;
            
            done = this.doAction(menuOption);
                } while (!done);       
        }
    
    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.battleMenu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1) {
                System.out.println("\nYou must choose wisely...letter.");
                continue;
            }
            break;
        }
        return value;
    }*/
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A" :
                this.startNewAttack();
                break;
            case "D" :
                this.drinkPotion();
                break;
            case "R" :
                this.exitCombat();
                break;
            default :
                System.out.println("\n*** you have chosen poorly *** Try again");
                break;
        }
        return false;
    }   
   
    private void startNewAttack() {
    
        AttackControl attackControlObject = new AttackControl ();
        attackControlObject.createNewAttack();
        
       
        }

    private void drinkPotion (){
        ItemControl potion = new ItemControl ();
        potion.addsToHealth();
    }
    
    
    
    private void exitCombat() {
        System.out.println("\n*** startExitingGame function called ***");
    }
}
