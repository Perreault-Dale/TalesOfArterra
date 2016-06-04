
package byui.cit260.talesofarterra.view;

/**
 *
 * @author Carlos
 */
public class Welcome {
    private String playerName;
			
        //return type void, no return/method constructor for dif object/dif values
        public void setPlayerName (String name) {
             playerName=name;
	}
	// return type string 
	public String getName(){
	return playerName;
        }
			
	public void display(){
	System.out.printf(
            "\n****************************************************************"
            + "\n Welcome to Aterra %s", getName()
            + "\n We hope you enjoy playing!"
            +"\n****************************************************************"
           );
	}
}
