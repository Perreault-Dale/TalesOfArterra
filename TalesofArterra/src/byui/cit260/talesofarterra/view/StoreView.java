/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;


import java.text.DecimalFormat;
import byui.cit260.talesofarterra.exceptions.SceneControlException;
import byui.cit260.talesofarterra.model.Player;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import talesofarterra.TalesofArterra;


/**
 *
 * @author Lucas
 */
class StoreView extends View{
    
    public StoreView() {
        super("\n*******************************************************************"
          + "\n*                       Store Inventory                             *"
          + "\n*===================================================================*"
          + "\n*     KEY TO PRESS                               ACTION             *"
          + "\n*-------------------------------------------------------------------*"
          + "\n*       \"1\"................................Print Store Inventory  *"
          + "\n*       \"S\"................................Enter Store            *"
          + "\n*********************************************************************");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        value = value.toUpperCase();
        switch(value) {
            case "1":
                done = drawStoreInventory();
                break;
            case "S":
                return true;
            default: 
                this.console.println("ERROR: That is not a valid choice!");
                return false;
        }
        return done;
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
    
     private boolean drawStoreInventory () {
        InventoryList[] items = InventoryList.values();
        PrintWriter storeSheet = null;
        
        boolean done = false;
        this.console.println("Enter the location for the inventory report.");
        String fileName = this.getInput();
        try {
            storeSheet = new PrintWriter(fileName);
        } catch (FileNotFoundException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
        
        storeSheet.println(
           "\r\n*******************************************************"
         + "\r\n*                  Store Record                       *"
         + "\r\n*=====================================================*");
        for (InventoryList item : items) {
            storeSheet.println("\r\n* " + item.getName() + " - "  + item.getAmount());
        }
          
          storeSheet.println("\r\n*******************************************************");
 
        try {
            storeSheet.close();
            this.console.println("\nCharacter sheet printed to " + fileName);
        } catch(Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        return done;   
}
       
    private static final int totalItems = InventoryList.values().length;
    
    public boolean storeInventory() throws SceneControlException { 
        //String value = "";
        int sum = 0;         
        int userPurchase = 0;
        InventoryList[] items = InventoryList.values();
        DecimalFormat df = new DecimalFormat("#.00");
        this.console.print(
              "\n****************************************************************"
            + "\n*             WELCOME TO THE STORE IN EDINBURG                 *"
            + "\n*                  *Business is Booming!*                      *");      
         
        do {
            this.console.println(
                  "\n*--------------------------------------------------------------*"                    
                + "\n*            The following is a list of our inventory          *" 
                + "\n****************************************************************");
        
            for (InventoryList item : items) {
                this.console.println(item.getIndex() + " - " + item.getName() + " - we have " + item.getAmount() + " at ₢" + df.format(item.getPrice()) + " each.");
            }
            this.console.println(
                    "\n****************************************************************"
                  + "\n*                What would you like to buy?                   *" 
                  + "\n****************************************************************\n");
            //Scanner in = new Scanner(System.in);
            this.console.println("Pick an item: (1 for the first, 2 for the second, so on and so forth");
            this.console.print("Press 0 to leave\n>");
            try {
            userPurchase = Integer.parseInt(this.keyboard.readLine());
                
            if (userPurchase == 0)
                return true;
            
            if (userPurchase > totalItems) {    
                while (userPurchase > totalItems) {
                    this.console.print("Invalid Selection, Please select a number between 1 and " + totalItems + "\n>");
                    userPurchase = Integer.parseInt(this.keyboard.readLine());
                }
            }
            }
            catch (Exception e){
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());            
            }     
            Player player = TalesofArterra.getPlayer();
            if (player.getBank() < items[userPurchase - 1].getPrice()) {
                throw new SceneControlException("Get outta here, you can't afford a " + items[userPurchase - 1].getName() + "!\nYou spent a total of ₢" + df.format(sum));
            }

                   
            if (userPurchase != 0) {
                if (items[userPurchase - 1].getAmount() != 0) {
                    items[userPurchase - 1].setAmount(items[userPurchase - 1].getAmount() - 1); 
                 
                    player.setBank(player.getBank() - items[userPurchase - 1].getPrice());
                    this.console.println("You just bought a " + items[userPurchase - 1].getName() + "! Congrats!!");
                    
                    sum += items[userPurchase - 1].getPrice();
                    
            } else {
                    this.console.println("We are Sold out! Sorry!!");
                }
 
         }
        }
        while (userPurchase != 0);                         
        
        //Player player = new Player();
        //player = TalesofArterra.getGame().getPlayer();
        //throw new SceneControlException("Sorry, come back latter we .");            
            
        this.console.println("You spent a total of ₢" + df.format(sum));   
        return true;
    }
    
}
