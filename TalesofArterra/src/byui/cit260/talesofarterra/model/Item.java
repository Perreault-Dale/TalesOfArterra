package byui.cit260.talesofarterra.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dale
 */
public class Item implements Serializable {

    //private member variables
    private int itemType;
    private int cost;
    private int loreCount;
    private String description;
    private boolean isIdentified;
    private boolean isEquipped;
    private int maxDamage;
    private int armor;
    

    //public getter and setter functions
    public Item() {
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLoreCount() {
        return loreCount;
    }

    public void setLoreCount(int loreCount) {
        this.loreCount = loreCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsIdentified() {
        return isIdentified;
    }

    public void setIsIdentified(boolean isIdentified) {
        this.isIdentified = isIdentified;
    }

    public boolean isIsEquipped() {
        return isEquipped;
    }

    public void setIsEquipped(boolean isEquipped) {
        this.isEquipped = isEquipped;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.itemType;
        hash = 83 * hash + this.cost;
        hash = 83 * hash + this.loreCount;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + (this.isIdentified ? 1 : 0);
        hash = 83 * hash + (this.isEquipped ? 1 : 0);
        hash = 83 * hash + this.maxDamage;
        hash = 83 * hash + this.armor;
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
        final Item other = (Item) obj;
        if (this.itemType != other.itemType) {
            return false;
        }
        if (this.cost != other.cost) {
            return false;
        }
        if (this.loreCount != other.loreCount) {
            return false;
        }
        if (this.isIdentified != other.isIdentified) {
            return false;
        }
        if (this.isEquipped != other.isEquipped) {
            return false;
        }
        if (this.maxDamage != other.maxDamage) {
            return false;
        }
        if (this.armor != other.armor) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", cost=" + cost + ", loreCount=" + loreCount + ", description=" + description + ", isIdentified=" + isIdentified + ", isEquipped=" + isEquipped + ", maxDamage=" + maxDamage + ", armor=" + armor + '}';
    }
  
}
