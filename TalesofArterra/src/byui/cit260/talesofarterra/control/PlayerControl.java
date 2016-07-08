/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.exceptions.PlayerControlException;
import byui.cit260.talesofarterra.model.Player;
import byui.cit260.talesofarterra.model.Item;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale Perreault
 */
public class PlayerControl {

    public static Player createPlayer(String name) throws PlayerControlException {
        Player player = new Player();
        player.setBank(100);
        if (!isNumeric(name)) {
            inputName(player,name);
        } else {
            throw new PlayerControlException("You may not enter a number for the name.");
        }
        TalesofArterra.setPlayer(player);
        return player;
    }
    public static void inputName(Player player, String name) {
        player.setName(name);
    }

    private static boolean isNumeric(String name) {
        try {
            double test = Double.parseDouble(name);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public void calcBank(Player pc, Item item, char code) throws PlayerControlException {
        switch (code) {
            case 's':
                pc.setBank(pc.getBank() + item.getCost());
                break;
            case 'p':
                pc.setBank(pc.getBank() - item.getCost());
                break;
            default:
                throw new PlayerControlException("You entered an invalid code.");
        }
    }
    
    public boolean savePlayer(Player player, String fileName) throws FileNotFoundException, IOException {
        String playerFileName = fileName;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        fileOutputStream = new FileOutputStream(playerFileName);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //The object is being persisted here
        objectOutputStream.writeObject(player);
        objectOutputStream.close();
        return true;
    }
    
    public Player loadPlayer(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
 
        String serializedFileName = fileName;
        Player player = null;
      
        fileInputStream = new FileInputStream(serializedFileName);
        objectInputStream = new ObjectInputStream(fileInputStream);
        player = (Player) objectInputStream.readObject();
        objectInputStream.close();
        
        return player;
    }
}
