/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Character;
/**
 *
 * @author Dale
 */
public class CharacterControl {
    public void inputName(Character char1, String name) {
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
            if (char1.getExperience() expLevel[i - 1] && char1.getLevel() < i) {
                return true;
            }
        }
        return false;
    }
    
    public void addLevel(Character char1) {
        char1.setLevel(char1.getLevel() + 1);
    }
    
    
}
