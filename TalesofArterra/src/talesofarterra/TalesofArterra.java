/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talesofarterra;

import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Dialogue;
import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Item;
import byui.cit260.talesofarterra.model.Location;
import byui.cit260.talesofarterra.model.Map;
import byui.cit260.talesofarterra.model.Player;
import byui.cit260.talesofarterra.model.Quest;
import byui.cit260.talesofarterra.model.Scene;
import byui.cit260.talesofarterra.model.Spell;
import byui.cit260.talesofarterra.model.Waypoint;

/**
 *
 * @author Dale
 */
public class TalesofArterra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiate new objects
        Character playerChar = new Character();
        Dialogue diagOne = new Dialogue();
        Game saveGame = new Game();
        Item broadsword = new Item();
        Location greatTemple = new Location();
        Map cityCenter = new Map();
        Player playerOne = new Player();
        Quest recoverRing = new Quest();
        Scene storeX = new Scene();
        Spell fireBall = new Spell();
        Waypoint eastGate = new Waypoint();
        
        recoverRing.setQuestID(1);
        recoverRing.setAccepted(true);
        recoverRing.setTitle("Recover The Lost Ring");
        recoverRing.setDescription("You need to recover the Bedime family's lost ring. They promise a large reward.");
        
        fireBall.setLevel(3);
        fireBall.setDamageType(1);
        fireBall.setBaseDamage(0);
        fireBall.setDamagePerLevel(6);
        fireBall.setIsArcane(true);
        
        storeX.setDescription("General Store");
        storeX.setNumMonsters(0);
        storeX.setBossName("Buckethead");
        
        eastGate.setMapID(1);
        eastGate.setMapDestination(2);
        eastGate.setLocationDestination(12);
        
        int abilities[] = new int[] { 8, 8, 8, 8, 8, 8 };
        playerChar.setAbilities(abilities);
        int alignment[] = new int[] { 85, 50 };
        playerChar.setAlignment(alignment);
        playerChar.setArmorClass(10);
        playerChar.setBaseAttack(4);
        playerChar.setExperience(36500);
        playerChar.setGender('m');
        playerChar.setHitPoints(49);
        boolean feats[] = new boolean[] { true, true, false, false, true, false, false, true, true };
        playerChar.setFeats(feats);
        playerChar.setLevel(5);
        playerChar.setMaxHP(63);
        playerChar.setName("David Bowie");
        int skills[] = new int[] { 4, 4, 4, 4, 0, 0, 0, 0, 0 };
        playerChar.setSkills(skills);
        boolean weapons[] = new boolean[] { true, true, false, false, true, false, false, true, true };
        playerChar.setUseWeapons(weapons);
        
        String message = playerChar.toString();
        message += '\n' + eastGate.toString();
        message += '\n' + recoverRing.toString();
        message += '\n' + fireBall.toString();
        message += '\n' + eastGate.toString();
        message += '\n' + storeX.toString();
        message += '\n' + diagOne.toString();
        message += '\n' + saveGame.toString();
        message += '\n' + broadsword.toString();
        message += '\n' + greatTemple.toString();
        message += '\n' + cityCenter.toString();
        message += '\n' + playerOne.toString();
                
        System.out.println(message);
    }
    
}
