/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import talesofarterra.TalesofArterra;
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Item;

/**
 *
 * @author Dale
 */
class ShowInventory extends View {

    public ShowInventory() {
        super("\n*****************************************************************"
          + "\n*                    Show Inventory                             *"
          + "\n*===============================================================*"
          + "\n*     KEY TO PRESS                           ACTION             *"
          + "\n*---------------------------------------------------------------*"
          + "\n*       \"E\"................................Equipped Items     *"
          + "\n*       \"B\"................................Bag Contents       *"
          + "\n*       \"Q\"................................Back to Game Menu  *"
          + "\n*****************************************************************");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        value = value.toUpperCase();
        Character char1 = TalesofArterra.getGame().getPlayer().getPlayerChar();
        String armorDesc;
        String gloveDesc;
        String shoesDesc;
        String weaponDesc;
        String shieldDesc;
        
        switch(value) {
            case "E": {
                try {
                    armorDesc = char1.getArmor().getDescription();
                } catch(Exception ex) {
                    armorDesc = "Your character is naked; the people are talking.";
                }
                try {
                    gloveDesc = char1.getGloves().getDescription();
                } catch(Exception ex) {
                    gloveDesc = "Your characterhas no gloves.";
                }
                try {
                    shieldDesc = char1.getShield().getDescription();
                } catch(Exception ex) {
                    shieldDesc = "Your character has nothing in the off hand.";
                }
                try {
                    weaponDesc = char1.getWeapon().getDescription();
                } catch(Exception ex) {
                    weaponDesc = "Your character has no weapon in their strong hand";
                }
                try {
                    shoesDesc = char1.getShoes().getDescription();
                } catch(Exception ex) {
                    shoesDesc = "Your character is barefoot.";
                }
        
                this.console.println("Armor: " + armorDesc);
                this.console.println("Gloves: " + gloveDesc);
                this.console.println("Shoes: " + shoesDesc);
                this.console.println("Weapon: " + weaponDesc);
                this.console.println("Offhand: " + shieldDesc);
                break;
            }
            case "B": {
                this.console.println("Bag Content ... coming soon.");
            }
            case "Q":
                done = true;
                break;
            default:
                this.console.println( "ERROR: That is not a valid choice!" );
        }
        return done;
    }
}
