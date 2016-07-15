/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Quest;
import talesofarterra.TalesofArterra;

/**
 *
 * @author Dale
 */
public class LazyLionLando extends View {

    public LazyLionLando() {
        super("\"I'm an innkeeper and a bartender... I've heard everything. Let's see... there's the rising evil... there's the rival thieves guild... I suppose those are the hottest topics right now.\"\n"
        + "---------- Choose your response ----------\n\n"
        + "1 - \"Tell me about the rising evil.\"\n"
        + "2 - \"Tell me about the rival thieves' guild.\"\n"
        + "3 - \"I need to go, but thanks for your time.\"\n");
        this.display();
    }
    
    @Override
    public boolean doAction(String value) {
        boolean done = false;
        Game game = TalesofArterra.getGame();
        Quest rising = game.getJournal()[3];
        Quest thieves = game.getJournal()[4];
        try {
            int i = Integer.parseInt(value);
        } catch(NumberFormatException ne) {
            this.console.println("\nPlease select a valid entry (1-3)");
        }
        
        switch(value) {
            case "1": {
                this.console.println("\"The most popular topic for a couple of weeks now, this one. They say there are undead... vampires and the like, stalking people at night. The city guard is denying it, but they have reason to... they don't want to start a panic.\"\n"
                + "\"Some people in the Merchant's District say there are werewolves howling beyond the South Gates. Imagine that, werewolves so close to the city! It's no wonder people are scared.\"\n"
                + "\"Alas, I know about werewolves; my stepfather died to protect me from a werewolf who had entered our home.\"\n"
                + "The innkeeper's eyes widen. \"Truly? I'm sorry, <lad/lass>, that's a terrible tragedy, it is. You might speak to Captain Thorin... he's in the Office in the Government District. Maybe you can get a job with the city guard.\"\n");
                rising.setAccepted(true);
                break;
            }
            case "2": {
                this.console.println("\"Well, there's a local thieves guild in Edinburg, there has been for a long time now. They're called the Bloody Daggers and they keep to the Slums, but sometimes venture out to nick a copper from a noble.\"\n"
                + "\"In the last few weeks, they say there's another thieves guild that's made it's way into the Deep Slums... that's the furthest part of the Slums. Don't go there.\"\n"
                + "\"Rumor is this rival guild is throwing around the Shadow Weaver name. Normally, this would be a bad thing. The Shadow Weavers are one of the most dangerous organizations in Istar, but they've never tried to enter Britannica, not to my knowledge.\"\n"
                + "\"From what I've heard, the Weavers in Edinburg are nothing but a bunch of thugs trying to take over Bloody Dagger turf. Probably just a bunch of punk kids using the Weaver name to scare people.\"\n"
                + "\"As long as this guild war doesn't hurt any civilians, the Council isn't going to bother with them. If anything, they're doing the Council a favor by killing each other off.\"\n");
                thieves.setAccepted(true);
                break;
            }
            case "3":
                done = true;
        }
        
        return done;
    }
}
