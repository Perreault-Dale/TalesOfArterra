/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.model;

import java.io.*;

/**
 *
 * @author Portal
 */

    
public enum BadGuys implements Serializable {
        
    
    Wolf,
    Trogg,
    Skeleton,
    Spider,
    ;
    
   int maxBadGuyHealth = 75;
   int badGuyDamage = 25;

    public int getMaxBadGuyHealth() {
        return maxBadGuyHealth;
    }

    public int getBadGuyDamage() {
        return badGuyDamage;
    }

    public void setMaxBadGuyHealth(int maxBadGuyHealth) {
        this.maxBadGuyHealth = maxBadGuyHealth;
    }

    public void setBadGuyDamage(int badGuyDamage) {
        this.badGuyDamage = badGuyDamage;
    }
        
       
}
    

