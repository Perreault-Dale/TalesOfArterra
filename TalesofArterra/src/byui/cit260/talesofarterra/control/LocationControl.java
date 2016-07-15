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
    
    String[] cityCenterBedimes = new String[] {
        "You notice a rather grubby-looking street urchin bump up against a large noblewoman as she scolds her husband. A second later, the boy puts something in his pocket. Just before he runs away, the noblewoman notices him.",
        "\"You there! I'm talking to you, you filthy little rat! Don't think I don't know what you did! I felt you reaching into my pocket! What did you steal?\"",
        "\"I didn't steal nothin'!\" The boy exclaims innocently. \"I was just passin' by an' bumped ya, was all. T'was an accident, I swears it!\"",
        "\"Preposterous! I had a gold ring in my pocket, and now it's gone! Where is it, you dirty little snot rag?!\"",
        "\"I dunno... maybe ya just drops it?\"",
        "\"Ridiculous! Walton, you saw this smelly dung beetle reach into my pocket, didn't you?\"",
        "\"Umm... what? Oh, yes! Of course, dear!\"",
        "\"And you, Jeeves! You saw it too, didn't you?\"",
        "\"My name is Anders, ma'am.\"",
        "\"How dare you correct me?!\"",
        "As the woman's bellowing reaches a crescendo, the nearby gate commander steps forward. \"What's all this commotion about?\"",
        "\"Finally, the authorities are here! This ratty little lice monkey stole my gold ring! Now, make yourself useful and do something about it!\"",
        "\"I didn't steal it! Honest! I think she just lost it in one o'the folds of her belly.\"",
        "\"How dare you?!\""
    };
    
    String[] cityCenterBedimesLawful = new String[] {
        "\"Aw, thanks a lot, ya jerk.\" Raffie reaches a dirty hand into his pocket and retrieves a gold ring, handing it back to the noblewoman.",
	"\"Hmph! How about that? The beggar wasn't in league with the stink bug after all.\"",
	"\"Thank you for your honesty, <sir/madam>.\"",
	"\"It's a shame we're no longer hiring servants at the Bedime Estate. Normally we would never consider someone of your lowly heritage, but in light of what just happened, I think you would make a fine stable<boy/girl>.\"",
	"\"Walton. Jeeves. Let's return to the Noble's District. I need a change of clothes. There's beggar stink on mine.\""
    };
    
    String[] cityCenterBedimesNeutral = new String[] {
        "\"Ha! Ya don't gots no proof, lady!\"",
	"\"I knew it! They were in league with each other.\"",
	"\"Thank you for your help, <sir/madam>. Now, everybody please disperse from the gates.\"",
	"The noblewoman turns to you in a huff. \"Well, if you fancied the privilege of attaining one of the vacant servant positions at the Bedime Estate, you can forget about it!\"",
	"\"Walton. Jeeves. Let's return to the Noble's District. I need a change of clothes. There's beggar stink on mine.\""
    };
    
    String[] cityCenterBedimesChaotic = new String[] {
        "\"Ya see? I tolds ya I didn't do nothin'!\"",
	"\"I knew it! They're in league with each other.\"",
	"\"Thank you for your help, <sir/madam>. Now, everybody please disperse from the gates.\"",
	"The noblewoman turns to you in a huff. \"Well, if you fancied the privilege of attaining one of the vacant servant positions at the Bedime Estate, you can forget about it!\"",
	"\"Walton. Jeeves. Let's return to the Noble's District. I need a change of clothes. There's beggar stink on mine.\""
    };
    
    String[] lazyLionLando = new String[] {
        "Despite this man's obvious age, he scans the room alertly and appears to have the respect of even the rowdiest patrons. He is bulky as though he was muscular in his youth. \"Greetings, <lad/lass>. Lando 'The Lion' at your service.\"",
        "\"You must be new in town if you'd ask me that. What's your name, <lad/lass>?\"",
        "\"My name is <FirstName>. It's a pleasure to meet you.\"",
        "\"Well then, <FirstName>, as I said, my name is Lando. I got the nickname 'The Lion' when I was about your age, throwing myself at orcs and ogres with not a care in the world.\" He sighs, smiling fondly at old memories. \"We all settle down one day.\"",
        "\"That's right, <lad/lass>. Started this place up... oh... almost twenty years ago, when I settled down from adventuring.\"",
        "\"Less dirt than the Boar and less infidelity than the Fox's Tail, so you could say it's the cleanest tavern in Edinburg. The Quilted Saddle is nice too, I have a friend who runs it, but it's packed full these days.\""
        };
    
    String[] smithSundriesSamuel = new String[] {
        "\"Hello! Hello! Welcome to Samuel's Smith & Sundries! I'm Samuel, purveyor of quality goods at reasonable prices. How may I help you today, good <sir/madam>? New suit of leather?\"",
        "\"<Flowers/Sweets>\""
    };
    
    public void setDialog() {
        dialogs.put("OutsideStart", outsideStart);
        dialogs.put("CityCenterBedimes", cityCenterBedimes);
        dialogs.put("CityCenterBedimesLawful", cityCenterBedimesLawful);
        dialogs.put("CityCenterBedimesNeutral", cityCenterBedimesNeutral);
        dialogs.put("CityCenterBedimesChaotic", cityCenterBedimesChaotic);
        dialogs.put("LazyLionLando", lazyLionLando);
        dialogs.put("SmithSundriesSamuel", smithSundriesSamuel);
    }

    public void changeLocation(Game game, Location location) {
        String[] dialog = dialogs.get(location.name());
        game.setDialogue(dialog);
        game.setCurrentLocation(location);
    }
    
}
