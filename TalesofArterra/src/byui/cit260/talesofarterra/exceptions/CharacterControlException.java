/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.exceptions;

/**
 *
 * @author Dale
 */
public class CharacterControlException extends Exception {

    public CharacterControlException() {
    }

    public CharacterControlException(String string) {
        super(string);
    }

    public CharacterControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CharacterControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CharacterControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
