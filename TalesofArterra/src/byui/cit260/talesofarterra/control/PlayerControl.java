/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Player;
import byui.cit260.talesofarterra.model.Item;

/**
 *
 * @author Dale Perreault
 */
public class PlayerControl {
    public void inputName(Player player, String name) {
        player.setName(name);
    }
    
    public void calcBank(Player pc, Item item, char code) {
        switch (code) {
            case 's':
                pc.setBank(pc.getBank() + item.getCost());
                break;
            case 'p':
                pc.setBank(pc.getBank() - item.getCost());
                break;
        }
    }
}
