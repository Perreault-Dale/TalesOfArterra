/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Player;
import byui.cit260.talesofarterra.model.Item;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dale Perreault
 */
public class PlayerControl {

    public static Player createPlayer(String name) {
        Player player = new Player();
        player.setBank(0);
        PlayerControl.inputName(player,name);
        return player;
    }
    public static void inputName(Player player, String name) {
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
    
    public boolean savePlayer(Player player, String fileName) {
        String playerFileName = fileName;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        try
        {
            fileOutputStream = new FileOutputStream(playerFileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //The object is being persisted here
            objectOutputStream.writeObject(player);
            objectOutputStream.close();
            System.out.println("Object serialized in file : " + playerFileName);
        }
        catch(IOException ioe)
        {
            //Close all I/O streams
            ioe.printStackTrace();
            return false;
            //Handle the exception here
        }
        return true;
    }
    
    public Player loadCharacter(String fileName) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
 
        String serializedFileName = fileName;
        Player player = null;
      
        try
        {
           fileInputStream = new FileInputStream(serializedFileName);
           objectInputStream = new ObjectInputStream(fileInputStream);
           player = (Player) objectInputStream.readObject();
           objectInputStream.close();
        }
        catch(FileNotFoundException fnfe)
        {
           System.out.println("File not found: "+fnfe.getMessage());
           //Close all I/O streams
           //Handle the exception here
        }
        catch(IOException ioe)
        {
           ioe.printStackTrace();
           //Close all I/O streams
           //Handle the exception here
        }
        catch(ClassNotFoundException cnfe)
        {
           cnfe.printStackTrace();
           //Close all I/O streams
           //Handle the exception here
        }
        
        return player;
    }
}
