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

}
