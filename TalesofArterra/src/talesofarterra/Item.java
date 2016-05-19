package talesofarterra;

import java.io.Serializable;

/**
 *
 * @author Dale
 */
public class Item implements Serializable {

    //private member variables
    private int itemType;
    private int cost;
    private int loreCount;

    //public getter and setter functions
    public Item{} {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.itemType;
        hash = 97 * hash + this.cost;
        hash = 97 * hash + this.loreCount;
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
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", cost=" + cost + ", loreCount=" + loreCount + '}';
    }

}
