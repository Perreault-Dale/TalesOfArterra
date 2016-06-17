package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Dale
 */
public class Character implements Serializable {

    //private member variables
    private String name;
    private char gender;
    private int level;
    private int experience;
    private int[] alignment;
    private int[] abilities;
    private int[] skills;
    private boolean[] feats;
    private int baseAttack;
    private int armorClass;
    private int hitPoints;
    private int maxHP;
    private boolean[] useWeapons;
    private Item armor;
    private Item gloves;
    private Item shoes;
    private Item weapon;
    private Item shield;

    //public getter and setter functions
    public Character() {
        this.level = 1;
        this.experience = 0;
        this.armorClass = 10;
        this.baseAttack = 4;
        this.alignment = new int[] {85,50};
        this.abilities = new int[] {8,8,8,8,8,8};
        this.skills = new int[] {4,4,0,0,0,0};
        this.feats = new boolean[] {false,false,false,false,false,false,false,false,false};
        this.useWeapons = new boolean[] {false,false,false,false,false,false,false,false,false};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int[] getAlignment() {
        return alignment;
    }

    public void setAlignment(int[] alignment) {
        this.alignment = alignment;
    }

    public int[] getAbilities() {
        return abilities;
    }

    public void setAbilities(int[] abilities) {
        this.abilities = abilities;
    }

    public int[] getSkills() {
        return skills;
    }

    public void setSkills(int[] skills) {
        this.skills = skills;
    }

    public boolean[] getFeats() {
        return feats;
    }

    public void setFeats(boolean[] feats) {
        this.feats = feats;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public Item getArmor() {
        return armor;
    }

    public void setArmor(Item armor) {
        this.armor = armor;
    }

    public Item getGloves() {
        return gloves;
    }

    public void setGloves(Item gloves) {
        this.gloves = gloves;
    }

    public Item getShoes() {
        return shoes;
    }

    public void setShoes(Item shoes) {
        this.shoes = shoes;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }

    public Item getShield() {
        return shield;
    }

    public void setShield(Item shield) {
        this.shield = shield;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public boolean[] getUseWeapons() {
        return useWeapons;
    }

    public void setUseWeapons(boolean[] useWeapons) {
        this.useWeapons = useWeapons;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.gender;
        hash = 41 * hash + this.level;
        hash = 41 * hash + this.experience;
        hash = 41 * hash + Arrays.hashCode(this.alignment);
        hash = 41 * hash + Arrays.hashCode(this.abilities);
        hash = 41 * hash + Arrays.hashCode(this.skills);
        hash = 41 * hash + Arrays.hashCode(this.feats);
        hash = 41 * hash + this.baseAttack;
        hash = 41 * hash + this.armorClass;
        hash = 41 * hash + this.hitPoints;
        hash = 41 * hash + this.maxHP;
        hash = 41 * hash + Arrays.hashCode(this.useWeapons);
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
        final Character other = (Character) obj;
        if (this.gender != other.gender) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        if (this.experience != other.experience) {
            return false;
        }
        if (this.baseAttack != other.baseAttack) {
            return false;
        }
        if (this.armorClass != other.armorClass) {
            return false;
        }
        if (this.hitPoints != other.hitPoints) {
            return false;
        }
        if (this.maxHP != other.maxHP) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Arrays.equals(this.alignment, other.alignment)) {
            return false;
        }
        if (!Arrays.equals(this.abilities, other.abilities)) {
            return false;
        }
        if (!Arrays.equals(this.skills, other.skills)) {
            return false;
        }
        if (!Arrays.equals(this.feats, other.feats)) {
            return false;
        }
        if (!Arrays.equals(this.useWeapons, other.useWeapons)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", gender=" + gender + ", level=" + level + ", experience=" + experience + ", alignment=" + Arrays.toString(alignment) + ", abilities=" + Arrays.toString(abilities) + ", skills=" + Arrays.toString(skills) + ", feats=" + Arrays.toString(feats) + ", baseAttack=" + baseAttack + ", armorClass=" + armorClass + ", hitPoints=" + hitPoints + ", maxHP=" + maxHP + ", useWeapons=" + Arrays.toString(useWeapons) + '}';
    }
    
    
}
