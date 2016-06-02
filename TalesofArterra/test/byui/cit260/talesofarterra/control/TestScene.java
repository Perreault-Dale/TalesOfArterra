/*
 * 
 * #CArlos
 * possible use for scenes 
 * 
 */
package byui.cit260.talesofarterra.control;


 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class TestScene
{
	/* constructor method needs to have same name as the class
	create the object in the main with assgined variables in the parameters
 
	public Scene (String name); {
		bossName = name
			}
	*/ 
	public static void main (String[] args) throws java.lang.Exception
	{
		Random rand = new Random();
		// die roll
		int cumul[] = new int [7];
 
		for (int roll = 1; roll <1000; roll++) {
				// 1++ shifts rand.next line from 0-5 to 1-6
				//++ cumul adds one to the same index, everytime it gets chosen, all indexes are 0
				++cumul[1++rand.nextint(6)];
		}
 
		//
		int finalDmg [] = {7,8,9,10,11};
			int total = 0;
 
			for (int x: finalDmg) {
				total += x;
			}
 
 
 
		// dialog dialogID = new dialog;
		private String monsterName[] = {"Wolf","skeleton","trog"};
		private String bossName[] = {"Lupinta, Den mother", "Gtsz, trogg commander"};
		private int monsterLvl[] = {1, 2, 3, 4,5};
		private int numMonsters = 5;
		private int bossLvl = 7
 
 
		// not sure what dialog we using so.. i will add a random encounter notcie for the player.
                        
 
	}
}