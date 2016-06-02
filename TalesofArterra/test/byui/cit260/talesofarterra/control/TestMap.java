/*
@Carlos
map ID creationg need to work on the coordinates for the class
*/


package byui.cit260.talesofarterra.control;

 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class TestMap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		/*
		int mapID[] = new int[11];
		mapID[0] = 1;
		mapID[1] = 2;
		ect..
		*/
 
		// Map ID array
 
		int mapId[] ={1,2,3,4,5,6,7,8,9,10,11};
 
	    /*
	    int counter = 1;
 
	    while (counter < 2) {
 
 
		System.out.println("Welcome to " + mapId[0]);
		counter++;
	    }
	    */
 
 
	   // coordinates  int size [] [] = {{0,1,2,3,4,5,6,7,8,9,10},{0,1,2,3,4,5,6,7,8,9,10}};
 
 
	    // explorable boolean
	    int mapCounter = 10;
 
	    if (mapCounter < 0){
	    	System.out.println("Welcome to " + mapId[1]+ ".");
		 } else {
		 	System.out.println("Welcome back to " + mapId[1]+ ".");
 
	    	}
	}
}