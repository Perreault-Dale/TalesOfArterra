/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;
 
import byui.cit260.talesofarterra.model.Character;
import java.text.DecimalFormat;
import byui.cit260.talesofarterra.exceptions.SceneControlException;
import byui.cit260.talesofarterra.model.Player;
import java.util.Random;
import java.util.Scanner;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
public class SceneControl {
    public boolean generateMonster(Character monster) {
        Random r = new Random();
        int monsterAppear = r.nextInt(50) + 1;
        
        if (monsterAppear > 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean generateBoss(Character monster) {
         Random r = new Random();
        int monsterAppear = r.nextInt(50) + 1;
        
        if (monsterAppear > 45)
        {
            return true;
        }
        else
        {
            return false;
        }
        //possible monatery symbols
        //₳₴₴₵₶₷₸₹€₡₣₢₤₥₦₧₨₩₪€₭₮₰₱₲ⅎ
 
    }
}
        


