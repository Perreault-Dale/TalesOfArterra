
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.AttackControl;
import byui.cit260.talesofarterra.control.ItemControl;



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
                        System.out.println("\nPlease select a valid entry (1-4,H)");
                    }
                }
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
