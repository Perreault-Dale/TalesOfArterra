/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Item;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Dale
 */
public class CharacterControl {

    public static byui.cit260.talesofarterra.model.Character createPlayer(String charName) {
        Character playerChar = new Character();
        inputName(playerChar,charName);
        return playerChar;
    }
    
    public static void inputName(Character char1, String name) {
        char1.setName(name);
    }
    
    public void inputGender(Character char1, char gender) {
        char1.setGender(gender);
    }
    
    public void addExperience(Character char1, int exp) {
        char1.setExperience(char1.getExperience() + exp);
    }
    
    public boolean checkExperience(Character char1) {
        int [] expLevel = new int[] { 0, 1000, 3000, 6000, 10000, 15000, 21000, 28000, 36000, 45000, 55000, 66000, 78000, 91000, 105000, 120000, 136000, 153000, 171000, 190000, 211000 };
        for (int i = 1; i < expLevel.length; i++) {
            if (char1.getExperience() > expLevel[i - 1] && char1.getLevel() < i) {
                return true;
            }
        }
        return false;
    }
    
    public void addLevel(Character char1) {
        char1.setLevel(char1.getLevel() + 1);
    }
    
    public void changeAlignment(Character char1, int good, int law) {
        int [] alignment = new int[2];
        alignment = char1.getAlignment();
        alignment[0] += good;
        alignment[1] += law;
        char1.setAlignment(alignment);
    }
    
    public void addAbilities(Character char1, int ability) {
        int [] abilities = new int[6];
        abilities = char1.getAbilities();
        abilities[ability]++;
        char1.setAbilities(abilities);
    }
    
    public void addSkills(Character char1, int skill) {
        int [] skills = new int[9];
        skills = char1.getSkills();
        skills[skill]++;
        char1.setSkills(skills);
    }
    
    public void enableFeats(Character char1, int feat) {
        boolean [] feats = new boolean[9];
        feats = char1.getFeats();
        feats[feat] = true;
        char1.setFeats(feats);
    }
    
    public void takeDamage(Character char1, int damage) {
        char1.setHitPoints(char1.getHitPoints() - damage);
    }
    
    public void healPartial(Character char1, int heal) {
        char1.setHitPoints(char1.getHitPoints() + heal);
        if (char1.getHitPoints() > char1.getMaxHP())
                char1.setHitPoints(char1.getMaxHP());
    }
    
    public void healFull(Character char1) {
        char1.setHitPoints(char1.getMaxHP());
    }
    
    public void increaseMaxHP(Character char1, int hp) {
        char1.setMaxHP(char1.getMaxHP() + hp);
    }
    
    public void increaseArmorClass(Character char1, Item item) {
        char1.setArmorClass(char1.getArmorClass() + item.getArmor());
    }
    
    public boolean saveCharacter(Character playerChar, String fileName) {
        String characterFileName = fileName;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        try
        {
            fileOutputStream = new FileOutputStream(characterFileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //The object is being persisted here
            objectOutputStream.writeObject(playerChar);
            objectOutputStream.close();
            System.out.println("Object serialized in file : " + characterFileName);
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
    
    public Character loadCharacter(String fileName) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
 
        String serializedFileName = fileName;
        Character playerChar = null;
      
        try
        {
           fileInputStream = new FileInputStream(serializedFileName);
           objectInputStream = new ObjectInputStream(fileInputStream);
           playerChar = (Character) objectInputStream.readObject();
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
        
        return playerChar;
    }
}
