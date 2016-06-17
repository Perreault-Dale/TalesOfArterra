/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.talesofarterra.view;

/**
 *
 * @author Dale
 */
class AbilityHelpMenu extends View {

    public AbilityHelpMenu() {
        super(
            "\n****************************************************************"
          + "\n*                                                              *"
          + "\n* Abilities Help Menu                                          *"
          + "\n*                                                              *"
          + "\n****************************************************************"
          + "\n\n1.	Strength: 		\n" +
            "2.	Constitution:           \n" +
            "3.	Wisdom: 		\n" +
            "4.	Dexterity:		\n" +
            "5.	Intelligence:		\n" +
            "6.	Charisma:		\n" +
            "\nSelect Q to return to the abilities menu.\n");
    }
    
    @Override
    public boolean doAction(String value) {
        boolean exit = false;
        switch (value) {
            case "1":
                strengthHelp();
                break;
            case "2":
                constitutionHelp();
                break;
            case "3":
                wisdomHelp();
                break;
            case "4":
                dexterityHelp();
                break;
            case "5":
                intelligenceHelp();
                break;
            case "6":
                charismaHelp();
                break;
            case "Q":
                exit = true;
                break;
            default:
                System.out.println("\nPlease select a valid entry (1-6,Q)");
        }
        return exit;
    }
    
    private void strengthHelp() {
        System.out.println("Strength measures the muscle and physical power of a character. "
                + "\nThis ability is especially important for fighters, barbarians, paladins, "
                + "\nrangers, and monks because it helps them prevail in combat.");
    }

    private void constitutionHelp() {
        System.out.println("Constitution represents the health and stamina of a character. "
                + "\nHigh constitution increases the number of hit points a character has "
                + "\n(affecting how much damage they can take), and this makes it important "
                + "\nfor everyone, but especially so for fighters. If constitution ever "
                + "\nincreases, hit points increase retroactively as well. Spellcasters also "
                + "\nneed strong constitution to keep their spells from being interrupted "
                + "\nduring combat.");
    }

    private void wisdomHelp() {
        System.out.println("Wisdom describes a character's willpower, common sense, "
                + "\nperception, and intuition, whereas intelligence represents the "
                + "\nability to analyze information. An \"absent-minded professor\" has "
                + "\nlow wisdom and high intelligence. A simpleton with low intelligence "
                + "\nmight nevertheless be very perceptive (have high wisdom). Wisdom is "
                + "\nimportant for clerics and druids, affecting the strength and number of "
                + "\ntheir spells, and is also significant for paladins and rangers. It is "
                + "\nvery important for monks as well, modifying many of their abilities. "
                + "\nThe wise character is capable of intuitively understanding others, "
                + "\noccasionally having insights into their motivations.");
    }

    private void dexterityHelp() {
        System.out.println("Dexterity measures agility, reflexes, and balance. This ability "
                + "\nis most important for rogues, but also for characters who typically wear "
                + "\nlight or medium armor (barbarians and rangers) or none at all (monks, "
                + "\nwizards, and sorcerers), or for any character who wants to be a skilled "
                + "\narcher.");
    }

    private void intelligenceHelp() {
        System.out.println("Intelligence determines how well a character learns and reasons. "
                + "\nIntelligence is important for wizards because it affects how many spells "
                + "\nthey can cast, how hard their spells are to resist, and how powerful their "
                + "\nspells can be. It is also important for any character who wants to have a "
                + "\nstrong assortment of skills; however increasing intelligence will not "
                + "\ngrant bonus skill points retroactively.");
    }

    private void charismaHelp() {
        System.out.println("Charisma measures a character's force of personality, "
                + "\npersuasiveness, ability to lead, and physical attractiveness. It "
                + "\nrepresents actual personal strength, not merely how one is perceived by "
                + "\nothers in a social setting. Charisma is most important for paladins, "
                + "\nsorcerers, and bards. It is also important for clerics, as it affects "
                + "\ntheir ability to turn undead. All characters benefit from having a high "
                + "\ncharisma when speaking with others in the world. Charisma affects an "
                + "\nNPC's initial reaction to the player and it modifies the player's "
                + "\npersuasion skill checks.");
    }
}
