package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Spell implements Serializable {

    //private member variables
    private int level;
    private int damageType;
    private int baseDamage;
    private int damagePerLevel;
    private boolean isArcane;

    //public getter and setter functions
    public Spell{} {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamageType() {
        return damageType;
    }

    public void setDamageType(int damageType) {
        this.damageType = damageType;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getDamagePerLevel() {
        return damagePerLevel;
    }

    public void setDamagePerLevel(int damagePerLevel) {
        this.damagePerLevel = damagePerLevel;
    }

    public boolean isIsArcane() {
        return isArcane;
    }

    public void setIsArcane(boolean isArcane) {
        this.isArcane = isArcane;
    }

}
