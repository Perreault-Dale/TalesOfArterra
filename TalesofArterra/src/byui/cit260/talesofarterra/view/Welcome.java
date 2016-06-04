/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

/**
 *
 * @author Portal
 */
public class Welcome {
    
    
    private String playerName;
    
        public void displayBanner() {
        System.out.println(
            "\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Welcome to Tales of Arterra! In this game, loosely based on  *"
          + "\n* Dungeons and Dragons, you will play the role of a farm boy   *"
          + "\n* whose life has been turned upside-down by tragedy. With the  *"
          + "\n* magic he learned on the farm, and a bit of money, he starts  *"
          + "\n* a new life in the city of Edinburg, which is dealing with    *"
          + "\n* tragedies of its own.                                        *"
          + "\n*                                                              *"
          + "\n****************************************************************"
        );
    }
    
    
        // return type void, no return
	public void setPlayerName (String name) {
	playerName=name;
	}
		
	// return type string 
	public String getName(){
	return playerName;
	}
			
	public void display(){
	System.out.println();
        System.out.printf("\n**************************************************"
                +          "\n* Welcome to Arterra %s", getName()
                +          "\n* We hope you enjoy playing!"
                +          "\n*************************************************"
            );
        
   	}
}
