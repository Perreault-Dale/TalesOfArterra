/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;
 
import byui.cit260.talesofarterra.model.Character;
import java.text.DecimalFormat;
import byui.cit260.talesofarterra.exceptions.SceneControlException;
import byui.cit260.talesofarterra.model.Player;
import java.util.Random;
import java.util.Scanner;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
public class SceneControl {
    public boolean generateMonster(Character monster) {
        Random r = new Random();
        int monsterAppear = r.nextInt(50) + 1;
        
        if (monsterAppear > 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean generateBoss(Character monster) {
         Random r = new Random();
        int monsterAppear = r.nextInt(50) + 1;
        
        if (monsterAppear > 45)
        {
            return true;
        }
        else
        {
            return false;
        }
        //possible monatery symbols
        //₳₴₴₵₶₷₸₹€₡₣₢₤₥₦₧₨₩₪€₭₮₰₱₲ⅎ
 
    } 
    
    public enum InventoryList {
         Regular_Sword(8, 10, 1, "Regular Sword"),
         Strong_Sword(3, 25, 2, "Strong Sword"),
         Dagger_of_the_Night(2, 78, 3, "Dagger of the Night"),
         Potion_of_Healing(5, 5, 4, "Potion of Healing"),
         Potion_of_Fortitude(9, 9, 5, "Potion of Fortitude"),
         Weak_Shield(11, 2, 6, "Weak Shield"),
         Strong_Shield(5, 40, 7, "Strong Shield"),
         Shield_of_Olympus(1, 120, 8, "Shield of Olympus");
         
         private int amount;
         private final int price;
         private final int index;
         private final String name;
         
         InventoryList(int amount, int price, int index, String name) {
            this.amount = amount;
            this.price = price;
            this.index = index;
            this.name = name;
         }
         public int getAmount() {
             return this.amount;
         }
         public int getPrice() {
             return this.price;
         }
         public int getIndex() {
             return this.index;
         }
         public void setAmount(int amount) {
             this.amount = amount;
         }
         public String getName() {
             return this.name;
         }
    }
       
    private static final int totalItems = InventoryList.values().length;
        
    public void storeInventory() throws SceneControlException { 
        int sum = 0;         
        int userPurchase;
        InventoryList[] items = InventoryList.values();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print(
              "\n****************************************************************"
            + "\n*             WELCOME TO THE STORE IN EDINBURG                 *"
            + "\n*                  *Business is Booming!*                      *");      
         
        do {
            System.out.println(
                  "\n*--------------------------------------------------------------*"                    
                + "\n*            The following is a list of our inventory          *" 
                + "\n****************************************************************");
        
            for (InventoryList item : items) {
                System.out.println(item.getIndex() + " - " + item.getName() + " - we have " + item.getAmount() + " at ₢" + df.format(item.getPrice()) + " each.");
            }
            System.out.println(
                    "\n****************************************************************"
                  + "\n*                What would you like to buy?                   *" 
                  + "\n****************************************************************\n");
            Scanner in = new Scanner(System.in);
            System.out.println("Pick an item: (1 for the first, 2 for the second, so on and so forth");
            System.out.print("Press 0 to leave\n>");
            userPurchase = in.nextInt();
            
            if (userPurchase > totalItems) {
                while (userPurchase > totalItems) {
                    System.out.print("Invalid Selection, Please select a number between 1 and " + totalItems + "\n>");
                    userPurchase = in.nextInt();
                }
            }

            Player player = TalesofArterra.getPlayer();
                   if (player.getBank() < 2) {
                       throw new SceneControlException("Get outta here, you can't afford anything!");
                   }

                   
            if (userPurchase != 0) {
                if (items[userPurchase - 1].getAmount() != 0) {
                    items[userPurchase - 1].setAmount(items[userPurchase - 1].getAmount() - 1);
                    player.setBank(player.getBank() - items[userPurchase - 1].getPrice());
                    System.out.println("You just bought a " + items[userPurchase - 1].getName() + "! Congrats!!\n");
                    
                    sum += items[userPurchase - 1].getPrice();
                    
            } else {
                    System.out.println("We are Sold out! Sorry!!");
                }
         }
        }
        while (userPurchase != 0);                         Player player = new Player();
            player = TalesofArterra.getGame().getPlayer();
                    throw new SceneControlException("Sorry, come back latter we .");            
            
        //System.out.println("You spent a total of ₢" + df.format(sum));   

    }
}
        


