/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.ItemControl;
import byui.cit260.talesofarterra.exceptions.ItemControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Portal
 */
public class UseItemMenu extends View{
    
    
    public UseItemMenu() {
        
        super ("n"
                +"\n-------------------------"
                +"\n|  Item Menu            |"
                +"\n-------------------------"
                +"\nU - Use Item             "
                +"\nG - Give Item            "
                +"\nD - Drop Item            "
                +"\nI - Identify item        "
                +"\nE - Exit Menu"
                +"\n-------------------------"       
                );
            }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "U" :
                this.useItem();
                break;
            case "G" :
                this.giveItem();
                break;
            case "D" :
                this.dropItem();
                break;
            case "I":
                this.identifyItem();
            case "E":
                this.backToBag();
            default :
                this.console.println("\n*** you have chosen poorly *** Try again");
                break;
        }
        return false;
        
    }
    
    private void useItem () {
        this.console.println("We have not added a Intentory controler");
    }
    
    private void giveItem() {
        this.console.println("Give to whom?");
    }
    
    private void dropItem() {
        this.console.println("delete item maybe?");
    }
    private void identifyItem() {
        ItemControl itemControlObject = new ItemControl ();
        try {
            itemControlObject.calcLore(TalesofArterra.getGame().getPlayer().getPlayerChar());
        } catch (ItemControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
    }
    
    private void backToBag() {
        this.console.println("We have not added a Intentory controler so no bag yet");
    }
    
}
