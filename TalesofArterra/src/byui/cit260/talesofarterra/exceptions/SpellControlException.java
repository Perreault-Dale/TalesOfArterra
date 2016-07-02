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
public class SpellControlException extends Exception {

    public SpellControlException() {
    }

    public SpellControlException(String string) {
        super(string);
    }

    public SpellControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SpellControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public SpellControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
