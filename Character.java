package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Character implements Serializable {

    //private member variables
    private char[] name;
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

    //public getter and setter functions
    public Character{} {
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
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

}
