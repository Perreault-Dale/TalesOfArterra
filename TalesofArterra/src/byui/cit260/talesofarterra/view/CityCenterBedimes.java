/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.control.LocationControl;
import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Character;
import byui.cit260.talesofarterra.model.Quest;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
public class CityCenterBedimes extends View {

    public CityCenterBedimes() {
        super("Stifling a smile, the gate commander turns to you. \"Pardon me, but did you see anything?\"\n"
        + "\"You must be joking? This scruffy lint monger is probably in league with the tiny ragamuffin!\"\n"
        + "The boy turns to you with pleading eyes. \"You didn't see nothin', did ya?\"\n"
        + "---------- Choose your response ----------\n\n"
        + "1 - \"I saw the whole thing. The boy picked her pocket.\" (Lawful)\n"
        + "2 - \"I don't want to get involved.\" (Neutral)\n"
        + "3 - \"I didn't see anything.\" (Chaotic)\n");
        this.display();
    }
    
    @Override
    public boolean doAction(String value) {
        Game game = TalesofArterra.getGame();
        LocationControl lc = new LocationControl();
        Quest edinburg = game.getJournal()[0];
        edinburg.setAccepted(true);
        Quest job = game.getJournal()[1];
        job.setAccepted(true);
        Quest bedimes = game.getJournal()[2];
        bedimes.setAccepted(true);
        
        try {
            int i = Integer.parseInt(value);
        } catch(NumberFormatException ne) {
            this.console.println("\nPlease select a valid entry (1-3)");
        }
        
        switch(value) {
            case "1": {
                lc.setDialog();
                game.setDialogue(lc.dialogs.get("CityCenterBedimesLawful"));
                Character char1 = game.getPlayer().getPlayerChar();
                int[] align = char1.getAlignment();
                align[1] += 5;
                char1.setAlignment(align);
                break;
            }
            case "2": {
                lc.setDialog();
                game.setDialogue(lc.dialogs.get("CityCenterBedimesNeutral"));
                break;
            }
            case "3": {
                lc.setDialog();
                game.setDialogue(lc.dialogs.get("CityCenterBedimesChaotic"));
                Character char1 = game.getPlayer().getPlayerChar();
                int[] align = char1.getAlignment();
                align[1] -= 5;
                char1.setAlignment(align);
                break;
            }
        }
        bedimes.setComplete(true);
        lc.setDialog();
        DisplayDialog.display();
        return true;
    }
}
