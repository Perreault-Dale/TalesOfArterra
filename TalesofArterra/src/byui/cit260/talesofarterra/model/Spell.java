package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dale
 */
public class Spell implements Serializable {

    //private member variables
    private String name;
    private int level;
    private String damageType;
    private int baseDamage;
    private int damagePerLevel;
    private boolean isArcane;

    //public getter and setter functions
    public Spell() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.level;
        hash = 67 * hash + Objects.hashCode(this.damageType);
        hash = 67 * hash + this.baseDamage;
        hash = 67 * hash + this.damagePerLevel;
        hash = 67 * hash + (this.isArcane ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Spell other = (Spell) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        if (!Objects.equals(this.damageType, other.damageType)) {
            return false;
        }
        if (this.baseDamage != other.baseDamage) {
            return false;
        }
        if (this.damagePerLevel != other.damagePerLevel) {
            return false;
        }
        if (this.isArcane != other.isArcane) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Spell{" + "name=" + name + ", level=" + level + ", damageType=" + damageType + ", baseDamage=" + baseDamage + ", damagePerLevel=" + damagePerLevel + ", isArcane=" + isArcane + '}';
    }

}
