/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;
 
import byui.cit260.talesofarterra.model.Character;
import java.text.DecimalFormat;
//import byui.cit260.talesofarterra.model.Scene;
import java.util.Random;
import java.util.Scanner;

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
    public void storeInventory (){            
        
        int userPurchase; 

        //This is the stock ammount of each item
        int[] itemAmount = {8, 3, 2, 5, 9, 1}; 
        //This is each item's name
        String[] itemName = {"Regular Sword", "Strong Sword", "Dagger of the Night", 
            "Potion of Healing", "Potion of Fortitude", "Shield of Olympus"};
        //This is each item's price
        float[] itemPrice = {10, 25, 78, 5, 9, 120};
        //This it the total price of their order
        float sum = 0;
        //This is so the prices will have two zeros at the end of them 
        DecimalFormat df = new DecimalFormat("#.00");
        //This adds a number for each item for the user to order.
        int itemNumber = 1;
        System.out.print(
                "\n****************************************************************"
              + "\n*             WELCOME TO THE STORE IN EDINBURG                 *"
              + "\n*                  *Business is Booming!*                      *");        
        do{
            
            System.out.println(
                    "\n*--------------------------------------------------------------*"                    
                  + "\n*            The following is a list of our inventory          *" 
                  + "\n****************************************************************");
            for (int i = 0; i < itemAmount.length; i++)
            {
                System.out.println(itemNumber + " - " + itemName[i] + " - we have " + itemAmount[i] + " at ₢" + df.format(itemPrice[i]) + " each.");
                itemNumber++;
            }
            System.out.println(
                    "\n****************************************************************"
                  + "\n*                What would you like to buy?                   *" 
                  + "\n****************************************************************\n");
            Scanner in = new Scanner(System.in);
            System.out.println("Pick an item: (1 for the first, 2 for the second, so on and so forth");
            System.out.print("Press 0 to leave\n>");
            userPurchase = in.nextInt();
            if (userPurchase != 0){  
               
                    //Trying to get it so it will not allow more than what is offered. 

               // if (itemAmount.length < userPurchase){  
               //     System.out.println("Test");
               // } else {
               //     System.out.println("Invalid Selection, Please select a number between 1 and " + itemAmount.length);}
                if (itemAmount[userPurchase - 1] != 0){
                 itemAmount[userPurchase - 1] -= 1;
                 System.out.println("You just bought a " + itemName[userPurchase - 1] + "! Congrats!!\n");
                 sum += itemPrice[userPurchase - 1];
                    } else {
                            System.out.println("We are Sold out! Sorry!!");}
            }
            itemNumber = 1;
        }
        while (userPurchase != 0);
        System.out.println("You spent a total of ₢" + df.format(sum));
    }
}
