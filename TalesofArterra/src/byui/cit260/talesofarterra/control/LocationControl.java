/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.control;

import byui.cit260.talesofarterra.model.Game;
import byui.cit260.talesofarterra.model.Location;
import java.util.HashMap;

/**
 *
 * @author Dale
 */
public class LocationControl {
    
    public HashMap<String,String[]> dialogs = new HashMap<String,String[]>();
    
    String[] outsideStart = new String[] 
    {"\"Rise and shine, <FirstName>. Breakfast is ready, but don't take too long. We have a long day ahead of us, and the fields ain't going to harvest themselves.\"",
    "\"Good morning, Tobias. How are you today?\"",
    "\"Fine, fine. It's a pretty spring morning and it looks t'be one of our best harvests ever. Yer stepmother is already outside.\"",
    "\"I'll hurry with breakfast then. She shouldn't have to work so hard.\"",
    "\"Ye always were a fine <lad/lass>. Margo and I may not have had any children ourselves, but ye were like our own since the day we found ye as a babe.\"",
    "\"Tell me the story of how you found me.\"",
    "\"I can't tell ye anything I haven't already told ye, <lad/lass>. Margo and I travelled a bit in our younger days. One year we were travelling through the woods of the south of Claymore when we found ye, naked as a bird, by an abandoned campsite.\"",
    "\"The camp hadn't been abandoned fer long, the ashes were still hot. We waited fer many days, but nobody ever came to git ye.\"",
    "\"Margo and I had a mind to settle down by then, and ye were such a precious little thing, that we decided to raise ye, rather than give ye up to an orphanage.\"",
    "\"But you've heard this all before, <lad/lass>. There's a harvest to git to.\"",
    "",
    "\"G' day, <FirstName>. I'm sorry I couldn't help ye today, but my bones are still aching from my fall yesterday.\"",
    "\"That's quite alright, Tobias. You've done more than enough for me, and it's time you settled down anyway. I can handle the work myself.\"",
    "Tobias smiles at you as he rubs his sore back. \"Margo would've been so proud of ye, bless her spirit. Tell me, <lad/lass>... what do ye plan to do wit yerself in the years to come?\"",
    "\"What do you mean?\"",
    "\"Ye know what I mean, <lad/lass>. I'm getting very old now, and ye can take care of yerself. There's no future here fer a bright young <lad/lass> as yerself. Have ye thought about going to the city?\"",
    "\"I've thought about it, but I wouldn't know what to do there.\"",
    "\"Edinburg is a big city, with plenty of opportunities if yer willing to put in the effort. It won't be easy, I'll grant ye that. The wealthy folks there don't take too kindly to us common folk.\"",
    "\"But ye have a world of potential, and even if things don't work out right away, just remember that if ye persevere, things will always work out in the end.\"",
    "\"I've been saving up some coin fer ye, and now's as good a time as any to give it to ye. It's not much, but it's all Margo and I could manage over the years. I hope it will git ye started on the right foot when yer out on yer own.\"",
    "\"Thank you, Tobias.\"",
    "\"I only want the best fer ye, <lad/lass>.\"",
    "",
    "",
    "\"<FirstName>! Run fer the door, quickly! Save yerself!\"",
    "\"Tobias!\"",
    "\"<FirstName>! Run fer it! Run...\"",
    "",
    "You wake up with a start, deeply disturbed, your clothes clinging to your body with sweat. Your life flashed before you in a dream.",
    "You have not been able to shake the memory of Tobias torching the cottage to kill the werewolf that invaded it so suddenly that fateful night. The blaze destroyed your home, your possessions.",
    "You barely escaped the explosion that claimed your dear stepfather. Tobias, the only other person who has ever loved you, was gone. Perhaps he has joined your loving stepmother, Margo, in the heavens.",
    "It helped to think of it that way. But not much. It has been a week since you last saw your home. Since then, you have spent all your time walking, hiding from what lurked in the darkness of the Trollwood's shadows.",
    "Last night, you spotted torchlights in the distance and collapsed, the thorny pine nettles a relief to your aching mind, body, and soul.",
    "You have arrived at Edinburg."};
    
    public void setDialog() {
        dialogs.put("OutsideStart", outsideStart);
    }

    void changeLocation(Game game, Location location) {
        String[] dialog = dialogs.get(location.name());
        game.setDialogue(dialog);
        game.setCurrentLocation(location);
    }
    
}
