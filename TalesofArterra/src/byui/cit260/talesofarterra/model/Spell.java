package byui.cit260.talesofarterra.model;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public enum Spell implements Serializable {
    
    BurningHands(1,"Fire",0,4),
    IceDagger(1,"Cold",0,4),
    MagicMissile(1,"Magic",0,5),
    NegativeEnergyRay(1,"Negative",0,6),
    Combust(2,"Fire",12,1),
    GodleeElectricLoop(2,"Electric",0,6),
    MelfAcidArrow(2,"Acid",6,12),
    Fireball(3,"Fire",0,6),
    FlameArrow(3,"Fire",24,0),
    LightningBolt(3,"Electric",0,6),
    MestilAcidBreath(3,"Acid",0,6),
    NegativeEnergyBurst(3,"Negative",8,1);
    
    //private member variables
    private final int level;
    private final String damageType;
    private final int baseDamage;
    private final int damagePerLevel;

    //public getter and setter functions
    private Spell(int level, String damageType, int baseDamage, int damagePerLevel) {
        this.level = level;
        this.damageType = damageType;
        this.baseDamage = baseDamage;
        this.damagePerLevel = damagePerLevel;
    }

    public int getLevel() {
        return level;
    }

    public String getDamageType() {
        return damageType;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getDamagePerLevel() {
        return damagePerLevel;
    }

    @Override
    public String toString() {
        return "Spell{" + "level=" + level + ", damageType=" + damageType + ", baseDamage=" + baseDamage + ", damagePerLevel=" + damagePerLevel + '}';
    }

}
