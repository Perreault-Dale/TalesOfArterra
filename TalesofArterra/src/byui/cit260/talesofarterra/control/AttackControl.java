/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;


import byui.cit260.talesofarterra.view.View;

import talesofarterra.TalesofArterra;
/**
 *
 * @author Portal
 */
public class AttackControl extends View {

    public AttackControl(String displayMessage) {
        super("Hero attacks");
    }
    
    @Override
     public boolean doAction(String choice) {
         return true;
     }
}
