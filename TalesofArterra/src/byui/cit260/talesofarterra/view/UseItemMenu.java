/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.ItemControl;

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
                System.out.println("\n*** you have chosen poorly *** Try again");
                break;
        }
        return false;
        
    }
    
    private void useItem () {
        System.out.println("We have not added a Intentory controler");
    }
    
    private void giveItem() {
        System.out.println("Give to whom?");
    }
    
    private void dropItem() {
        System.out.println("delete item maybe?");
    }
    private void identifyItem() {
        ItemControl itemControlObject = new ItemControl ();
        itemControlObject.itemList();
    }
    
    private void backToBag() {
        System.out.println("We have not added a Intentory controler so no bag yet");
    }
    
}
