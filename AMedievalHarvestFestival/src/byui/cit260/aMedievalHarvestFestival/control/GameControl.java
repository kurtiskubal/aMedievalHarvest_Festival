/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.BeverageItem;
import byui.cit260.aMedievalHarvestFestival.model.ClueItem;
import byui.cit260.aMedievalHarvestFestival.model.Constants;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.GiftItem;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Map;
import byui.cit260.aMedievalHarvestFestival.model.MatchingGame;
import byui.cit260.aMedievalHarvestFestival.model.MatchingGameLocation;
import byui.cit260.aMedievalHarvestFestival.model.MatchingInstance;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import byui.cit260.aMedievalHarvestFestival.model.WeaponItem;

/**
 *
 * @author Kurt
 */
public class GameControl {
    
    private static Game game;
   
    public static Game getGame() {
        return game;
    }
    
    public static void createNewGame(Player player) {
        GameControl.game = new Game();
        
        AMedievalHarvestFestival.setCurrentGame(game);
        
        GameControl.game.setPlayer(player);
        player.setHealth(100);
        player.setHunger(0);
        player.setThirst(0);
        
        game.setGameEvent(true);
        
        
        InventoryItem[] inventory = GameControl.createInventoryList();
        GameControl.game.setInventory(inventory);
        
        Actors[] actors = GameControl.createActorsList();
        GameControl.game.setActors(actors);
        
        Map map = GameControl.createMap();
        GameControl.game.setMap(map);
        
        MatchingGame matchingGame = GameControl.createMatchingGame();
        GameControl.game.setMatchingGame(matchingGame);
        
        player.setPlayerLocation(map.getLocations()[0][1]);
        game.setGameEventLocation(map.getLocations()[3][1]);
        
        MapControl.moveActorsToLocation(actors);
    }
    
    public static void startSavedGame(){
        System.out.println("\n*** Calling startSavedGame stub function ***");
    }
   
    
    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem clueItem1 = new ClueItem("Sample", 4);
        clueItem1.setName("Lock of Hair       ");
        clueItem1.setInventoryType(1);
        clueItem1.setDescription("A lock of hair, looks suspiciously like the Princess's.");
        clueItem1.setItemQuanity(0);
        inventory[Constants.EVIDENCE_ONE_ITEM] = clueItem1;
        
        InventoryItem clueItem2 = new ClueItem("Sample", 3);
        clueItem2.setName("Suspicious Note    ");
        clueItem2.setInventoryType(1);
        clueItem2.setDescription("A ransom note sent to the King, signed by 'The Real Slim Shady', whoever"
                               +"\n that is.");
        clueItem2.setItemQuanity(0);
        inventory[Constants.EVIDENCE_TWO_ITEM] = clueItem2;
        
        InventoryItem clueItem3 = new ClueItem("Sample", 2);
        clueItem3.setName("Notes From Queen   ");
        clueItem3.setInventoryType(1);
        clueItem3.setDescription("A note from the conversation with Queen, detailing how there are a couple of "
                              +"\nmen in the valley with debts.");
        clueItem3.setItemQuanity(0);
        inventory[Constants.EVIDENCE_THREE_ITEM] = clueItem3;
        
        InventoryItem clueItem4 = new ClueItem("Sample", 1);
        clueItem4.setName("Notes from Princess");
        clueItem4.setInventoryType(1);
        clueItem4.setDescription("A note from the conversation with the Princess"
                + " that details, that she only"
                +"\n saw that her kidnapper had a shoe with the sole marked 'SS'.");
        clueItem4.setItemQuanity(0);
        inventory[Constants.EVIDENCE_FOUR_ITEM] = clueItem4;
        
        InventoryItem clueItem5 = new ClueItem("Sample", 0);
        clueItem5.setName("Ransom Note        ");
        clueItem5.setInventoryType(1);
        clueItem5.setDescription("Found ransom note sent to the Queen.");
        clueItem5.setItemQuanity(0);
        inventory[Constants.EVIDENCE_FIVE_ITEM] = clueItem5;
        
        InventoryItem apple = new FoodItem(1);
        apple.setName("Apple              ");
        apple.setInventoryType(2);
        apple.setDescription("A delicious hand-picked apple.");
        apple.setItemQuanity(0);
        inventory[Constants.APPLE] = apple;
        
        InventoryItem bread = new FoodItem(2);
        bread.setName("Bread              ");
        bread.setInventoryType(2);
        bread.setDescription("Fresh, delicious, homemade bread.");
        bread.setItemQuanity(1);
        inventory[Constants.BREAD] = bread;
        
        InventoryItem corn = new FoodItem(3);
        corn.setName("Corn               ");
        corn.setInventoryType(2);
        corn.setDescription("Freshly husked corn from the William's fields.");
        corn.setItemQuanity(0);
        inventory[Constants.CORN] = corn;
        
        InventoryItem beans = new FoodItem(4);
        beans.setName("Beans              ");
        beans.setInventoryType(2);
        beans.setDescription("Delicious black beans.");
        beans.setItemQuanity(0);
        inventory[Constants.BEANS] = beans;
        
        InventoryItem peas = new FoodItem(5);
        peas.setName("Peas               ");
        peas.setInventoryType(2);
        peas.setDescription("Freshly harvested peas with churned butter.");
        peas.setItemQuanity(0);
        inventory[Constants.PEAS] = peas;
        
        InventoryItem ale = new BeverageItem(1);
        ale.setName("Ale                    ");
        ale.setInventoryType(3);
        ale.setDescription("A dark-colored alcoholic liquid, smells funny.");
        ale.setItemQuanity(0);
        inventory[Constants.ALE] = ale;
        
        InventoryItem mead = new BeverageItem(2);
        mead.setName("Mead                   ");
        mead.setInventoryType(3);
        mead.setDescription("An alcoholic liquid with the taste of honey and "
                + "water.");
        mead.setItemQuanity(0);
        inventory[Constants.MEAD] = mead;
        
        InventoryItem water = new BeverageItem(5);
        water.setName("Water                  ");
        water.setInventoryType(3);
        water.setDescription("H20, or as it is now called, clear beer.");
        water.setItemQuanity(2);
        inventory[Constants.WATER] = water;
        
        InventoryItem cider = new BeverageItem(3);
        cider.setName("Cider                  ");
        cider.setInventoryType(3);
        cider.setDescription("Old apple juice.");
        cider.setItemQuanity(0);
        inventory[Constants.CIDER] = cider;
        
        InventoryItem wine = new BeverageItem(4);
        wine.setName("Wine                   ");
        wine.setInventoryType(3);
        wine.setDescription("Old grape juice.");
        wine.setItemQuanity(0);
        inventory[Constants.WINE] = wine;
        
        InventoryItem dagger = new WeaponItem();
        dagger.setName("Dagger               ");
        dagger.setInventoryType(4);
        dagger.setDescription("A deadly, sharp, short blade. Looks like it can "
                + "be hidden easily");
        dagger.setItemQuanity(0);
        inventory[Constants.DAGGER] = dagger;
        
        InventoryItem sword = new WeaponItem();
        sword.setName("Sword                ");
        sword.setInventoryType(4);
        sword.setDescription("A long, edged weapon.");
        sword.setItemQuanity(0);
        inventory[Constants.SWORD] = sword;
    
        InventoryItem genericGift = new GiftItem(10);
        genericGift.setName("Gift for Canaway          ");
        genericGift.setInventoryType(4);
        genericGift.setDescription("A set of decorated leather riding boots. "
                + "Gifts are used automatically when you talk to certain people.");
        genericGift.setItemQuanity(1);
        inventory[Constants.GENERIC_GIFT] = genericGift;
        
        InventoryItem gift = new GiftItem(30);
        gift.setName("Gift for Princess         ");
        gift.setInventoryType(4);
        gift.setDescription("A leather braclet with charms. "
                + "Gifts are used automatically when you talk to certain people.");
        gift.setItemQuanity(1);
        inventory[Constants.GIFT] = gift;
        
        InventoryItem awesomeGift = new GiftItem(50);
        awesomeGift.setName("Gift for Violet           ");
        awesomeGift.setInventoryType(4);
        awesomeGift.setDescription("A leather braclet with charms. "
                + "Gifts are used automatically when you talk to certain people.");
        awesomeGift.setItemQuanity(1);
        inventory[Constants.AWESOME_GIFT] = awesomeGift;
       
        
       
        return inventory;
    }

    private static Actors[] createActorsList() {
        
        Actors[] actors = new Actors[Constants.NUMBER_OF_ACTORS];
        
        Actors ladyViolet = new Actors("Lady Violet");
        ladyViolet.setName("Lady Violet");
        ladyViolet.setDialogue("The Queen is such a pleasant person to be around. I "
                + "wish to ease her pain as she mourns her missing duaghter.");
        ladyViolet.setHappiness(0);
        ladyViolet.setHealth(100);
        ladyViolet.setDialogueGift("Thank you so much for this pretty gift. Will"
                + " you sit with me at dinner tonight?");
        ladyViolet.setDialogueHappy("Do you remember how we used to play chase here "
                + "in the gardens three years hence. Why does age have to stop such pleasent activities?");
        actors[Constants.VIOLET] = ladyViolet;
        
        Actors dFred = new Actors("Duke Frederick");
        dFred.setName("Duke Frederick");
        dFred.setDialogue("Aye, that boy Canaway fights like he tries to prove "
                + "himself worthy of becomeing a Duke. He has the skill of swords "
                + "I warrant him. But he should enjoy his youth more. Heaven knows "
                + "that the troubles of leadership is tiring at best. As you might know I "
                + "lost my crops this year and this festival will do little to sooth my"
                + "troubles. Do you perhaps think Canaway the kidnapper? He is fighting a "
                + "bit like a cornered mouse. Is it possible that he is attempting to "
                + "force marriage to the throne?");
        dFred.setHappiness(0);
        dFred.setHealth(100);
        actors[Constants.FREDERICK] = dFred;
        
        Actors dHarold = new Actors("Duke Harold");
        dHarold.setName("Duke Harold");
        dHarold.setDialogue("dialogue with Duke Harold");
        dHarold.setHappiness(0);
        dHarold.setHealth(100);
        actors[Constants.HAROLD] = dHarold;
        
        Actors dLuis = new Actors("Duke Luis");
        dLuis.setName("Duke Luis");
        dLuis.setDialogue("dialogue with Duke Luis");
        dLuis.setHappiness(0);
        dLuis.setHealth(100);
        actors[Constants.LUIS] = dLuis;
        
        Actors lCanaway = new Actors("Lord Canaway");
        lCanaway.setName("Lord Canaway");
        lCanaway.setDialogue("Duke Frederick is always a difficult opponent. Yet I "
                + "have won nearly half of our matches. His mind seems to be on other matters. "
                + "Though with the princess gone, we all have reason to show distress.");
        lCanaway.setHappiness(0);
        lCanaway.setHealth(100);
        lCanaway.setDialogueGift("Well these are truly well made. I cannot "
                + "believe you remembered that I needed them. We shall go "
                + "hunting together next week.");
        lCanaway.setDialogueHappy("Do you think Lady Violet will notice me if I wear these "
                + "new boots at dinner? Wish me luck then friend.");
        actors[Constants.CANAWAY] = lCanaway;
        
        
        Actors pWilliam = new Actors("Princess Williams");
        pWilliam.setName("Princess Williams");
        pWilliam.setDialogue(" dialogue with Princess");
        pWilliam.setHappiness(0);
        pWilliam.setHealth(100);
        pWilliam.setEvidence(true);
        pWilliam.setDialogueEvidence("(Soft banging is heard from a locked storage room. As you approach " 
                + "you hear muffled speech coming from within. As you put your head to the door "
                + "you make out a few hoarse words...)"
                + "\nWhy is it that no one can hear my cries? I am here! Locked in this closet. Help!"
                + "\n(You break the lock using a metal object. Once inside "
                + "you find the Princess Williams behind boxes at the back. You realize why no one had heard her "
                + "attempts to be found as you untie her from ropes that nearly kept her immobile. A cloth gag "
                + "came away from her mouth nearly chewed in half by the princess' efforts. She wore riding garments "
                + "not the bedclothes you thought she would be in. She sobbed gratitude for saving her but no tears fell "
                + "from her bloodshot eyes. Dry cheeks had lines of salt on them as if she had cried until the "
                + "tears stopped coming. A voice calls from the door surprising you and the princess; she instinctively "
                + "pulls a little closer to you.)"
                + "\nWho's in there?"
                + "\n(You stand pulling up the princess with you. You see an old thin man in the doorway, you remeber him "
                + "as the keeper of the stables. The old man upon seeing you and the princess quickly begins talking.)"
                + "\nMy life and family were threatened, I grieve for having done such a shameful thing. I could tell "
                + "no one that the man hid the princess here. Now I am grateful because you have released me from that "
                + "dreadful task. How can I help?"
                + "\n(You had moved out of the storage room as he spoke and now laid the princess down on soft straw for "
                + "she could not walk yet being tied up for so long. You tell the old man to get water first and then Lady "
                + "Violet from the gardens. As you stand you think...)"
                + "\nHere is evidence to help convict the assailant and a witness to my saving her. I should go now to the "
                + "audience chamber to speak to the servant there.");
        pWilliam.setDialogueGift("Thank you so much for the kind gift. I do pink"
                + " Lord Pharaoh, doth this mean you wish to court me?");
        pWilliam.setDialogueHappy("With your's and Lord Canaway's invitation to the harvest "
                + "festival I know that my father doth think highly of thee and him. I think the "
                + "King will be most easily convinced to grant his permission to my hand in marriage. "
                + "Thou art my preference Lord Pharaoh and I will tell my father so, but please ask sooner than later.");
        actors[Constants.PRINCESS_WILLIAM] = pWilliam;
        
        Actors qWilliam = new Actors("Queen Williams");
        qWilliam.setName("Queen Williams");
        qWilliam.setDialogue("The Autumn colors of this garden refelct most closely the feeling in my heart. "
                + "Lady Violet is the reason my heart is not full of Winter.");
        qWilliam.setHappiness(0);
        qWilliam.setHealth(100);
        qWilliam.setEvidence(true);
        qWilliam.setDialogueEvidence("This bit of evidence is not much but it "
                + "may help if yoiu find more.");
        actors[Constants.QUEEN_WILLIAM] = qWilliam;
        
        Actors kWilliam = new Actors("King Williams");
        kWilliam.setName("King Williams");
        kWilliam.setDialogue("My daughter was found missing from her chambers this morning. "
                + "I have locked and guarded all the gates since yesterday. This means "
                + "she and the kidnapper is yet, hopefully, still in the castle. You and "
                + "the other guests are all suspect. Clear your name, find my dughter, and "
                + "discover who took her. Enjoy the festivities for you cannot leave the castle. "
                + "Speak to my servant here in the Audience "
                + "Chamber when you have found my dughter.");
        kWilliam.setHappiness(0);
        kWilliam.setHealth(100);
        actors[Constants.KING_WILLIAM] = kWilliam;
        
        Actors servantC = new Actors("Servant Charles");
        servantC.setName("Servant Charles");
        servantC.setDialogue("It seems you have not found the Princess. It matters not if you "
                + "have evidence. You are still a suspect like all the other guests who have brought "
                + "in the their \"evidences.\" Go try again and please don't waste my time.");
        servantC.setHappiness(0);
        servantC.setHealth(100);
        actors[Constants.SERVANT_CHARLES] = servantC;
        
        Actors servantD = new Actors("Servant David");
        servantD.setName("Servant David");
        servantD.setDialogue("dialogue with Servant David");
        servantD.setHappiness(0);
        servantD.setHealth(100);
        actors[Constants.SERVANT_DAVID] = servantD;
        
        Actors servantL = new Actors("Servant Lilly");
        servantL.setName("Servant Lilly");
        servantL.setDialogue("Oh! I am embarrased Lord Pharaoh. To be caught not working today. "
                + "It's just that, well Lord Canaway is so handsome.... I mean! I have to go get "
                + "rolls from the Kitchen please excuse me.");
        servantL.setHappiness(0);
        servantL.setHealth(100);
        actors[Constants.SERVANT_LILLY] = servantL;
        
        return actors;
    }

    private static InstanceLocation[] createInstances() {
        
        InstanceLocation[] instances = new InstanceLocation[Constants.NUMBER_OF_INSTANCES];
        
        InstanceLocation stableInstance = new InstanceLocation();
        stableInstance.setName("Stables");
        stableInstance.setDescription("\nThe stables are large with a single row of four stalls. Three of these stalls are small and designed to "
                                    + "\nready horses for riding. The fourth is larger and holds sick or pregnant horses when needed. Across the "
                                    + "\nwalkway are several storage closets to hold the King's and his guest's riding tack. Around the corner is"
                                    + "\na large room where the hay is stored out of the rain. There are several locked closets around the Stable" 
                                    + "\nto secure tools and such from thieves. Out back behind is the open corral where the horses are kept.    ");
        stableInstance.setItemsStored(null);
        stableInstance.setEnergyUsed(10);
        stableInstance.setFluidsUsed(5);
        stableInstance.setType(0);
        stableInstance.setVisited(false);
        stableInstance.setRow(0);
        stableInstance.setColumn(0);
        stableInstance.setMapSymbol(" STB ");
        instances[Constants.STABLE_INSTANCE] = stableInstance;
        
        InstanceLocation roomInstance = new InstanceLocation();
        roomInstance.setName("Lord Pharaoh's Room");
        roomInstance.setDescription("Standard guest room with all the needed luxaries.");
        roomInstance.setItemsStored(null);
        roomInstance.setEnergyUsed(10);
        roomInstance.setFluidsUsed(5);
        roomInstance.setType(0);
        roomInstance.setVisited(false);
        roomInstance.setRow(0);
        roomInstance.setColumn(1);
        roomInstance.setMapSymbol(" LPR ");
        instances[Constants.MY_ROOM_INSTANCE] = roomInstance;
        
        InstanceLocation ladyVInstance = new InstanceLocation();
        ladyVInstance.setDescription("Description of Room");
        ladyVInstance.setName("Lady Violet's Room");
        ladyVInstance.setItemsStored(null);
        ladyVInstance.setEnergyUsed(10);
        ladyVInstance.setFluidsUsed(5);
        ladyVInstance.setType(0);
        ladyVInstance.setVisited(false);
        ladyVInstance.setRow(0);
        ladyVInstance.setColumn(2);
        ladyVInstance.setMapSymbol(" LVR ");
        instances[Constants.LADY_VIOLET_INSTANCE] = ladyVInstance;
        
        InstanceLocation dukeFInstance = new InstanceLocation();
        dukeFInstance.setDescription("Description of Room");
        dukeFInstance.setName("Duke Frederick's Room");
        dukeFInstance.setItemsStored(null);
        dukeFInstance.setEnergyUsed(10);
        dukeFInstance.setFluidsUsed(5);
        dukeFInstance.setType(0);
        dukeFInstance.setVisited(false);
        dukeFInstance.setRow(0);
        dukeFInstance.setColumn(3);
        dukeFInstance.setMapSymbol(" DFR ");
        instances[Constants.DUKE_FREDERICK_INSTANCE] = dukeFInstance;
        
        InstanceLocation dukeHInstance = new InstanceLocation();
        dukeHInstance.setDescription("Description of Room");
        dukeHInstance.setName("Duke Harold's Room");
        dukeHInstance.setItemsStored(null);
        dukeHInstance.setEnergyUsed(10);
        dukeHInstance.setFluidsUsed(5);
        dukeHInstance.setType(0);
        dukeHInstance.setVisited(false);
        dukeHInstance.setRow(0);
        dukeHInstance.setColumn(4);
        dukeHInstance.setMapSymbol(" DHR ");
        instances[Constants.DUKE_HAROLD_INSTANCE] = dukeHInstance;
        
        InstanceLocation dukeLInstance = new InstanceLocation();
        dukeLInstance.setDescription("Description of Room");
        dukeLInstance.setName("Duke Luis' Room");
        dukeLInstance.setItemsStored(null);
        dukeLInstance.setEnergyUsed(10);
        dukeLInstance.setFluidsUsed(5);
        dukeLInstance.setType(0);
        dukeLInstance.setVisited(false);
        dukeLInstance.setRow(1);
        dukeLInstance.setColumn(0);
        dukeLInstance.setMapSymbol(" DLR ");
        instances[Constants.DUKE_LUIS_INSTANCE] = dukeLInstance;
        
        InstanceLocation lordCInstance = new InstanceLocation();
        lordCInstance.setDescription("Description of Room");
        lordCInstance.setName("Lord Canaway's Room");
        lordCInstance.setItemsStored(null);
        lordCInstance.setEnergyUsed(10);
        lordCInstance.setFluidsUsed(5);
        lordCInstance.setType(0);
        lordCInstance.setVisited(false);
        lordCInstance.setRow(1);
        lordCInstance.setColumn(1);
        lordCInstance.setMapSymbol(" LCR ");
        instances[Constants.LORD_CANAWAY_INSTANCE] = lordCInstance;
        
        InstanceLocation emptyRoomInstance = new InstanceLocation();
        emptyRoomInstance.setDescription("Description of Room");
        emptyRoomInstance.setName("Empty Room");
        emptyRoomInstance.setItemsStored(null);
        emptyRoomInstance.setEnergyUsed(10);
        emptyRoomInstance.setFluidsUsed(5);
        emptyRoomInstance.setType(0);
        emptyRoomInstance.setVisited(false);
        emptyRoomInstance.setRow(1);
        emptyRoomInstance.setColumn(2);
        emptyRoomInstance.setMapSymbol(" ETR ");
        instances[Constants.EMPTY_ROOM_INSTANCE] = emptyRoomInstance;
        
        InstanceLocation servantsInstance = new InstanceLocation();
        servantsInstance.setName("Servant's Quarters");
        servantsInstance.setDescription("\nThe Servant's quarters are large enough to accommodate half the staff along with their own beds, wardrobes,"
                                      + "\ndressers, and large chests for their personal belongings. Half of the furniture is pushed up     " 
                                      + "\nagainst the back wall as most servants are married and live in a house out in the nearby      " 
                                      + "\nvillage. Everything is clean and well organized in the room.");
        servantsInstance.setItemsStored(null);
        servantsInstance.setEnergyUsed(10);
        servantsInstance.setFluidsUsed(5);
        servantsInstance.setType(0);
        servantsInstance.setVisited(false);
        servantsInstance.setRow(1);
        servantsInstance.setColumn(3);
        servantsInstance.setMapSymbol(" SQU ");
        instances[Constants.SERVANTS_QUARTERS_INSTANCE] = servantsInstance;
        
        InstanceLocation princessInstance = new InstanceLocation();
        princessInstance.setDescription("Description of Room. There is note just peeking from under the pillow. "
                + "Reading it, it seems that a friend has invited the princess out for an early morning ride in the countryside. "
                + "Perhaps you can find out who sent the princess the message.");
        princessInstance.setName("Princess Williams' Room");
        princessInstance.setItemsStored(null);
        princessInstance.setEnergyUsed(10);
        princessInstance.setFluidsUsed(5);
        princessInstance.setType(0);
        princessInstance.setVisited(false);
        princessInstance.setRow(1);
        princessInstance.setColumn(4);
        princessInstance.setMapSymbol(" PWR ");
        instances[Constants.PRINCESS_INSTANCE] = princessInstance;
        
        InstanceLocation kingsInstance = new InstanceLocation();
        kingsInstance.setDescription("Description of Room");
        kingsInstance.setName("King and Queen Williams' Room");
        kingsInstance.setItemsStored(null);
        kingsInstance.setEnergyUsed(10);
        kingsInstance.setFluidsUsed(5);
        kingsInstance.setType(0);
        kingsInstance.setVisited(false);
        kingsInstance.setRow(2);
        kingsInstance.setColumn(0);
        kingsInstance.setMapSymbol(" KWR ");
        instances[Constants.KING_INSTANCE] = kingsInstance;
        
        InstanceLocation kingsRRInstance = new InstanceLocation();
        kingsRRInstance.setDescription("Description of Room");
        kingsRRInstance.setName("Williams' Private Restroom");
        kingsRRInstance.setItemsStored(null);
        kingsRRInstance.setEnergyUsed(10);
        kingsRRInstance.setFluidsUsed(5);
        kingsRRInstance.setType(0);
        kingsRRInstance.setVisited(false);
        kingsRRInstance.setRow(2);
        kingsRRInstance.setColumn(1);
        kingsRRInstance.setMapSymbol(" KRR ");
        instances[Constants.KING_RESTROOM_INSTANCE] = kingsRRInstance;

        InstanceLocation gardenInstance = new InstanceLocation();
        gardenInstance.setDescription("The gardens are a most pleasent place to spend your time "
                + "outdoors. The care and design create a breathtaking expose of nature while providing "
                + "plenty of room for play and sitting. A quiet place to relax or find solace, you walk "
                + "through the somewhat familiar gardens thinking of the lost princess whom you had played "
                + "with as children in that same garden. Admiring the display of autumn colors you find "
                + "the Queen and Lady Violet sitting with a view of the festival in the courtyard in front of them.");
        gardenInstance.setName("Garden");
        gardenInstance.setItemsStored(null);
        gardenInstance.setEnergyUsed(10);
        gardenInstance.setFluidsUsed(5);
        gardenInstance.setType(0);
        gardenInstance.setVisited(false);
        gardenInstance.setRow(2);
        gardenInstance.setColumn(2);
        gardenInstance.setMapSymbol(" GAR ");
        instances[Constants.GARDEN_INSTANCE] = gardenInstance;
        
        InstanceLocation courtyardInstance = new InstanceLocation();
        courtyardInstance.setDescription("The courtyard is laid out with diverse games and stalls full of aromatic "
                + "foods and goods. As you wonder what to try your hand at first you notice Lord Canaway "
                + "and Duke Frederick playing thier skills of swordsmanship against one another."
                + "Watching for a minute you see Canaway's youthful figure dance around the "
                + "older Duke taking the offensive. Frederick's stolid figure displayed his "
                + "skill and age as he nay moved but parried and blocked each strike. You sumise "
                + "that if Canaway cannot land a strike in the first two minutes then Frederick "
                + "will counter when he tires and so win. As you "
                + "look away you notice the youthfull Servant Lilly a little ways off and "
                + "watching the two swordsman. This makes you notice her for an additional "
                + "moment and you thought you could see on her face more than respect for "
                + "the skill of sword being displayed.");
        courtyardInstance.setName("Courtyard");
        courtyardInstance.setItemsStored(null);
        courtyardInstance.setEnergyUsed(10);
        courtyardInstance.setFluidsUsed(5);
        courtyardInstance.setType(0);
        courtyardInstance.setVisited(false);
        courtyardInstance.setRow(2);
        courtyardInstance.setColumn(3);
        courtyardInstance.setMapSymbol(" COU ");
        instances[Constants.COURTYARD_INSTANCE] = courtyardInstance;
        
        InstanceLocation restroomInstance = new InstanceLocation();
        restroomInstance.setDescription("Description of Room");
        restroomInstance.setName("Public Restroom");
        restroomInstance.setItemsStored(null);
        restroomInstance.setEnergyUsed(10);
        restroomInstance.setFluidsUsed(5);
        restroomInstance.setType(0);
        restroomInstance.setVisited(false);
        restroomInstance.setRow(2);
        restroomInstance.setColumn(4);
        restroomInstance.setMapSymbol(" R-R ");
        instances[Constants.RESTROOM_INSTANCE] = restroomInstance;
        
        InstanceLocation kitchenInstance = new InstanceLocation();
        kitchenInstance.setDescription("Description of Kitchen, Smells really good.");
        kitchenInstance.setName("Kitchen");
        kitchenInstance.setItemsStored(null);
        kitchenInstance.setEnergyUsed(10);
        kitchenInstance.setFluidsUsed(5);
        kitchenInstance.setType(0);
        kitchenInstance.setVisited(false);
        kitchenInstance.setRow(3);
        kitchenInstance.setColumn(0);
        kitchenInstance.setMapSymbol(" KIT ");
        instances[Constants.KITCHEN_INSTANCE] = kitchenInstance;
        
        InstanceLocation chamberInstance = new InstanceLocation();
        chamberInstance.setDescription("Description of Audience Chamber");
        chamberInstance.setName("Audience Chamber");
        chamberInstance.setItemsStored(null);
        chamberInstance.setEnergyUsed(10);
        chamberInstance.setFluidsUsed(5);
        chamberInstance.setType(0);
        chamberInstance.setVisited(false);
        chamberInstance.setRow(3);
        chamberInstance.setColumn(1);
        chamberInstance.setMapSymbol(" CCC ");
        instances[Constants.CHAMBER_INSTANCE] = chamberInstance;
        
        InstanceLocation hallInstance = new InstanceLocation();
        hallInstance.setDescription("Description of Dining Hall. There are settings "
                + "for a feast; likely not to happen now....");
        hallInstance.setName("Dining Hall");
        hallInstance.setItemsStored(null);
        hallInstance.setEnergyUsed(10);
        hallInstance.setFluidsUsed(5);
        hallInstance.setType(0);
        hallInstance.setVisited(false);
        hallInstance.setRow(3);
        hallInstance.setColumn(2);
        hallInstance.setMapSymbol(" DDD ");
        instances[Constants.HALL_INSTANCE] = hallInstance;
        
        InstanceLocation libraryInstance = new InstanceLocation();
        libraryInstance.setDescription("Description Library. There are lots of books! "
                + "Note: desks and sofas too. Well lit with windows and many candles about the room.");
        libraryInstance.setName("Library");
        libraryInstance.setItemsStored(null);
        libraryInstance.setEnergyUsed(10);
        libraryInstance.setFluidsUsed(5);
        libraryInstance.setType(0);
        libraryInstance.setVisited(false);
        libraryInstance.setRow(3);
        libraryInstance.setColumn(3);
        libraryInstance.setMapSymbol(" LLL ");
        instances[Constants.LIBRARY_INSTANCE] = libraryInstance;
    
        InstanceLocation poolInstance = new InstanceLocation();
        poolInstance.setDescription("Description of Pool");
        poolInstance.setName("Pool");
        poolInstance.setItemsStored(null);
        poolInstance.setEnergyUsed(10);
        poolInstance.setFluidsUsed(3);
        poolInstance.setType(4);
        poolInstance.setVisited(false);
        poolInstance.setRow(3);
        poolInstance.setColumn(4);
        poolInstance.setMapSymbol(" ~~~ ");
        instances[Constants.POOL_INSTANCE] = poolInstance;
        
        return instances;
    }
    
    
    
    public static void assignScenesToLocations(Map map, InstanceLocation[] instances) {
        
        Location[][] locations = map.getLocations();
        
        locations[0][0].setInstance(instances[Constants.STABLE_INSTANCE]);
        locations[0][1].setInstance(instances[Constants.MY_ROOM_INSTANCE]);
        locations[0][1].setVisited(true);
        locations[0][2].setInstance(instances[Constants.LADY_VIOLET_INSTANCE]);
        locations[0][3].setInstance(instances[Constants.DUKE_FREDERICK_INSTANCE]);
        locations[0][4].setInstance(instances[Constants.DUKE_HAROLD_INSTANCE]);
        locations[1][0].setInstance(instances[Constants.DUKE_LUIS_INSTANCE]);
        locations[1][1].setInstance(instances[Constants.LORD_CANAWAY_INSTANCE]);
        locations[1][2].setInstance(instances[Constants.EMPTY_ROOM_INSTANCE]);
        locations[1][3].setInstance(instances[Constants.SERVANTS_QUARTERS_INSTANCE]);
        locations[1][4].setInstance(instances[Constants.PRINCESS_INSTANCE]);
        locations[2][0].setInstance(instances[Constants.KING_INSTANCE]);
        locations[2][1].setInstance(instances[Constants.KING_RESTROOM_INSTANCE]);
        locations[2][2].setInstance(instances[Constants.GARDEN_INSTANCE]);
        locations[2][3].setInstance(instances[Constants.COURTYARD_INSTANCE]);
        locations[2][4].setInstance(instances[Constants.RESTROOM_INSTANCE]);
        locations[3][0].setInstance(instances[Constants.KITCHEN_INSTANCE]);
        locations[3][1].setInstance(instances[Constants.CHAMBER_INSTANCE]);
        locations[3][2].setInstance(instances[Constants.HALL_INSTANCE]);
        locations[3][3].setInstance(instances[Constants.LIBRARY_INSTANCE]);
        locations[3][4].setInstance(instances[Constants.POOL_INSTANCE]);
    
    }
    
    private static MatchingInstance[] createMatchingInstances() {
        
        MatchingInstance[] matchingInstances = new MatchingInstance[Constants.NUMBER_OF_MATCHING_INSTANCES];
        
        MatchingInstance matching1 = new MatchingInstance();
        matching1.setValue(1);
        matching1.setChoosen(false);
        matching1.setMatched(false);
        matching1.setRow(0);
        matching1.setColumn(0);
        matching1.setMapSymbol(" 1_ ");
        matchingInstances[Constants.MATCH_INSTANCE_FIRST] = matching1;
        
        MatchingInstance matching2 = new MatchingInstance();
        matching2.setValue(17);
        matching2.setChoosen(false);
        matching2.setMatched(false);
        matching2.setRow(0);
        matching2.setColumn(1);
        matching2.setMapSymbol(" 17 ");
        matchingInstances[Constants.MATCH_INSTANCE_2] = matching2;
        
        MatchingInstance matching3 = new MatchingInstance();
        matching3.setValue(5);
        matching3.setChoosen(false);
        matching3.setMatched(false);
        matching3.setRow(0);
        matching3.setColumn(2);
        matching3.setMapSymbol(" 5_ ");
        matchingInstances[Constants.MATCH_INSTANCE_3] = matching3;
        
        MatchingInstance matching4 = new MatchingInstance();
        matching4.setValue(6);
        matching4.setChoosen(false);
        matching4.setMatched(false);
        matching4.setRow(0);
        matching4.setColumn(3);
        matching4.setMapSymbol(" 6_ ");
        matchingInstances[Constants.MATCH_INSTANCE_4] = matching4;
        
        MatchingInstance matching5 = new MatchingInstance();
        matching5.setValue(6);
        matching5.setChoosen(false);
        matching5.setMatched(false);
        matching5.setRow(0);
        matching5.setColumn(4);
        matching5.setMapSymbol(" 6_ ");
        matchingInstances[Constants.MATCH_INSTANCE_5] = matching5;
        
        MatchingInstance matching6 = new MatchingInstance();
        matching6.setValue(12);
        matching6.setMatched(false);
        matching6.setChoosen(false);
        matching6.setRow(1);
        matching6.setColumn(0);
        matching6.setMapSymbol(" 12 ");
        matchingInstances[Constants.MATCH_INSTANCE_6] = matching6;
        
        MatchingInstance matching7 = new MatchingInstance();
        matching7.setValue(8);
        matching7.setChoosen(false);
        matching7.setMatched(false);
        matching7.setRow(1);
        matching7.setColumn(1);
        matching7.setMapSymbol(" 8_ ");
        matchingInstances[Constants.MATCH_INSTANCE_7] = matching7;
        
        MatchingInstance matching8 = new MatchingInstance();
        matching8.setValue(14);
        matching8.setMatched(false);
        matching8.setChoosen(false);
        matching8.setRow(1);
        matching8.setColumn(2);
        matching8.setMapSymbol(" 14 ");
        matchingInstances[Constants.MATCH_INSTANCE_8] = matching8;
        
        MatchingInstance matching9 = new MatchingInstance();
        matching9.setValue(9);
        matching9.setChoosen(false);
        matching9.setMatched(false);
        matching9.setRow(1);
        matching9.setColumn(3);
        matching9.setMapSymbol(" 9_ ");
        matchingInstances[Constants.MATCH_INSTANCE_9] = matching9;
        
        MatchingInstance matching10 = new MatchingInstance();
        matching10.setValue(2);
        matching10.setChoosen(false);
        matching10.setMatched(false);
        matching10.setRow(1);
        matching10.setColumn(4);
        matching10.setMapSymbol(" 2_ ");
        matchingInstances[Constants.MATCH_INSTANCE_10] = matching10;
        
        MatchingInstance matching11 = new MatchingInstance();
        matching11.setValue(10);
        matching11.setChoosen(false);
        matching11.setMatched(false);
        matching11.setRow(2);
        matching11.setColumn(0);
        matching11.setMapSymbol(" 10 ");
        matchingInstances[Constants.MATCH_INSTANCE_11] = matching11;
        
        MatchingInstance matching12 = new MatchingInstance();
        matching12.setValue(7);
        matching12.setChoosen(false);
        matching12.setMatched(false);
        matching12.setRow(2);
        matching12.setColumn(1);
        matching12.setMapSymbol(" 7_ ");
        matchingInstances[Constants.MATCH_INSTANCE_12] = matching12;
        
        MatchingInstance matching13 = new MatchingInstance();
        matching13.setValue(12);
        matching13.setChoosen(false);
        matching13.setMatched(false);
        matching13.setRow(2);
        matching13.setColumn(2);
        matching13.setMapSymbol(" 12 ");
        matchingInstances[Constants.MATCH_INSTANCE_13] = matching13;
        
        MatchingInstance matching14 = new MatchingInstance();
        matching14.setValue(1);
        matching14.setChoosen(false);
        matching14.setMatched(false);
        matching14.setRow(2);
        matching14.setColumn(3);
        matching14.setMapSymbol(" 1_ ");
        matchingInstances[Constants.MATCH_INSTANCE_14] = matching14;
        
        MatchingInstance matching15 = new MatchingInstance();
        matching15.setValue(4);
        matching15.setChoosen(false);
        matching15.setMatched(false);
        matching15.setRow(2);
        matching15.setColumn(4);
        matching15.setMapSymbol(" 4_ ");
        matchingInstances[Constants.MATCH_INSTANCE_15] = matching15;
        
        MatchingInstance matching16 = new MatchingInstance();
        matching16.setValue(14);
        matching16.setChoosen(false);
        matching16.setMatched(false);
        matching16.setRow(3);
        matching16.setColumn(0);
        matching16.setMapSymbol(" 14 ");
        matchingInstances[Constants.MATCH_INSTANCE_16] = matching16;
        
        MatchingInstance matching17 = new MatchingInstance();
        matching17.setValue(10);
        matching17.setChoosen(false);
        matching17.setMatched(false);
        matching17.setRow(3);
        matching17.setColumn(1);
        matching17.setMapSymbol(" 10 ");
        matchingInstances[Constants.MATCH_INSTANCE_17] = matching17;
        
        MatchingInstance matching18 = new MatchingInstance();
        matching18.setValue(3);
        matching18.setChoosen(false);
        matching18.setMatched(false);
        matching18.setRow(3);
        matching18.setColumn(2);
        matching18.setMapSymbol(" 3_ ");
        matchingInstances[Constants.MATCH_INSTANCE_18] = matching18;
        
        MatchingInstance matching19 = new MatchingInstance();
        matching19.setValue(11);
        matching19.setChoosen(false);
        matching19.setMatched(false);
        matching19.setRow(3);
        matching19.setColumn(3);
        matching19.setMapSymbol(" 11 ");
        matchingInstances[Constants.MATCH_INSTANCE_19] = matching19;
        
        MatchingInstance matching20 = new MatchingInstance();
        matching20.setValue(16);
        matching20.setChoosen(false);
        matching20.setMatched(false);
        matching20.setRow(3);
        matching20.setColumn(4);
        matching20.setMapSymbol(" 16 ");
        matchingInstances[Constants.MATCH_INSTANCE_20] = matching20;
        
        MatchingInstance matching21 = new MatchingInstance();
        matching21.setValue(15);
        matching21.setChoosen(false);
        matching21.setMatched(false);
        matching21.setRow(4);
        matching21.setColumn(0);
        matching21.setMapSymbol(" 15 ");
        matchingInstances[Constants.MATCH_INSTANCE_21] = matching21;
        
        MatchingInstance matching22 = new MatchingInstance();
        matching22.setValue(5);
        matching22.setChoosen(false);
        matching22.setMatched(false);
        matching22.setRow(4);
        matching22.setColumn(1);
        matching22.setMapSymbol(" 5_ ");
        matchingInstances[Constants.MATCH_INSTANCE_22] = matching22;
        
        MatchingInstance matching23 = new MatchingInstance();
        matching23.setValue(13);
        matching23.setChoosen(false);
        matching23.setMatched(false);
        matching23.setRow(4);
        matching23.setColumn(2);
        matching23.setMapSymbol(" 13 ");
        matchingInstances[Constants.MATCH_INSTANCE_23] = matching23;
        
        MatchingInstance matching24 = new MatchingInstance();
        matching24.setValue(18);
        matching24.setChoosen(false);
        matching24.setMatched(false);
        matching24.setRow(4);
        matching24.setColumn(3);
        matching24.setMapSymbol(" 18 ");
        matchingInstances[Constants.MATCH_INSTANCE_24] = matching24;
        
        MatchingInstance matching25 = new MatchingInstance();
        matching25.setValue(18);
        matching25.setChoosen(false);
        matching25.setMatched(false);
        matching25.setRow(4);
        matching25.setColumn(4);
        matching25.setMapSymbol(" 18 ");
        matchingInstances[Constants.MATCH_INSTANCE_25] = matching25;
        
        MatchingInstance matching26 = new MatchingInstance();
        matching26.setValue(4);
        matching26.setChoosen(false);
        matching26.setMatched(false);
        matching26.setRow(5);
        matching26.setColumn(0);
        matching26.setMapSymbol(" 4_ ");
        matchingInstances[Constants.MATCH_INSTANCE_26] = matching26;
        
        MatchingInstance matching27 = new MatchingInstance();
        matching27.setValue(7);
        matching27.setChoosen(false);
        matching27.setMatched(false);
        matching27.setRow(5);
        matching27.setColumn(1);
        matching27.setMapSymbol(" 7_ ");
        matchingInstances[Constants.MATCH_INSTANCE_27] = matching27;
        
        MatchingInstance matching28 = new MatchingInstance();
        matching28.setValue(19);
        matching28.setChoosen(false);
        matching28.setMatched(false);
        matching28.setRow(5);
        matching28.setColumn(2);
        matching28.setMapSymbol(" 19 ");
        matchingInstances[Constants.MATCH_INSTANCE_28] = matching28;
        
        MatchingInstance matching29 = new MatchingInstance();
        matching29.setValue(8);
        matching29.setChoosen(false);
        matching29.setRow(5);
        matching29.setColumn(3);
        matching29.setMapSymbol(" 8_ ");
        matchingInstances[Constants.MATCH_INSTANCE_29] = matching29;
        
        MatchingInstance matching30 = new MatchingInstance();
        matching30.setValue(2);
        matching30.setChoosen(false);
        matching30.setMatched(false);
        matching30.setRow(5);
        matching30.setColumn(4);
        matching30.setMapSymbol(" 2_ ");
        matchingInstances[Constants.MATCH_INSTANCE_30] = matching30;
        
        MatchingInstance matching31 = new MatchingInstance();
        matching31.setValue(15);
        matching31.setChoosen(false);
        matching31.setMatched(false);
        matching31.setRow(6);
        matching31.setColumn(0);
        matching31.setMapSymbol(" 15 ");
        matchingInstances[Constants.MATCH_INSTANCE_31] = matching31;
        
        MatchingInstance matching32 = new MatchingInstance();
        matching32.setValue(9);
        matching32.setChoosen(false);
        matching32.setMatched(false);
        matching32.setRow(6);
        matching32.setColumn(1);
        matching32.setMapSymbol(" 9_ ");
        matchingInstances[Constants.MATCH_INSTANCE_32] = matching32;
        
        MatchingInstance matching33 = new MatchingInstance();
        matching33.setValue(11);
        matching33.setChoosen(false);
        matching33.setMatched(false);
        matching33.setRow(6);
        matching33.setColumn(2);
        matching33.setMapSymbol(" 11 ");
        matchingInstances[Constants.MATCH_INSTANCE_33] = matching33;
        
        MatchingInstance matching34 = new MatchingInstance();
        matching34.setValue(20);
        matching34.setChoosen(false);
        matching34.setMatched(false);
        matching34.setRow(6);
        matching34.setColumn(3);
        matching34.setMapSymbol(" 20 ");
        matchingInstances[Constants.MATCH_INSTANCE_34] = matching34;
        
        MatchingInstance matching35 = new MatchingInstance();
        matching35.setValue(19);
        matching35.setChoosen(false);
        matching35.setMatched(false);
        matching35.setRow(6);
        matching35.setColumn(4);
        matching35.setMapSymbol(" 19 ");
        matchingInstances[Constants.MATCH_INSTANCE_35] = matching35;
        
        MatchingInstance matching36 = new MatchingInstance();
        matching36.setValue(17);
        matching36.setChoosen(false);
        matching36.setMatched(false);
        matching36.setRow(7);
        matching36.setColumn(0);
        matching36.setMapSymbol(" 17 ");
        matchingInstances[Constants.MATCH_INSTANCE_36] = matching36;
        
        MatchingInstance matching37 = new MatchingInstance();
        matching37.setValue(16);
        matching37.setChoosen(false);
        matching37.setMatched(false);
        matching37.setRow(7);
        matching37.setColumn(1);
        matching37.setMapSymbol(" 16 ");
        matchingInstances[Constants.MATCH_INSTANCE_37] = matching37;
        
        MatchingInstance matching38 = new MatchingInstance();
        matching38.setValue(3);
        matching38.setChoosen(false);
        matching38.setMatched(false);
        matching38.setRow(7);
        matching38.setColumn(2);
        matching38.setMapSymbol(" 3_ ");
        matchingInstances[Constants.MATCH_INSTANCE_38] = matching38;
        
        MatchingInstance matching39 = new MatchingInstance();
        matching39.setValue(13);
        matching39.setChoosen(false);
        matching39.setMatched(false);
        matching39.setRow(7);
        matching39.setColumn(3);
        matching39.setMapSymbol(" 13 ");
        matchingInstances[Constants.MATCH_INSTANCE_39] = matching39;
        
        MatchingInstance matching40 = new MatchingInstance();
        matching40.setValue(20);
        matching40.setChoosen(false);
        matching40.setMatched(false);
        matching40.setRow(7);
        matching40.setColumn(4);
        matching40.setMapSymbol(" 20 ");
        matchingInstances[Constants.MATCH_INSTANCE_LAST] = matching40;
        
        return matchingInstances;
    }
    
    public static void assignMatchingScenesToMatchingLocations(MatchingGame matchingGame, MatchingInstance[] matchingInstances) {
        
        MatchingGameLocation[][] matchingLocations = matchingGame.getMatchingLocations();
        
        matchingLocations[0][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_FIRST]);
        matchingLocations[0][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_2]);
        matchingLocations[0][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_3]);
        matchingLocations[0][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_4]);
        matchingLocations[0][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_5]);
        matchingLocations[1][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_6]);
        matchingLocations[1][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_7]);
        matchingLocations[1][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_8]);
        matchingLocations[1][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_9]);
        matchingLocations[1][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_10]);
        matchingLocations[2][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_11]);
        matchingLocations[2][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_12]);
        matchingLocations[2][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_13]);
        matchingLocations[2][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_14]);
        matchingLocations[2][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_15]);
        matchingLocations[3][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_16]);
        matchingLocations[3][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_17]);
        matchingLocations[3][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_18]);
        matchingLocations[3][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_19]);
        matchingLocations[3][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_20]);
        matchingLocations[4][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_21]);
        matchingLocations[4][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_22]);
        matchingLocations[4][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_23]);
        matchingLocations[4][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_24]);
        matchingLocations[4][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_25]);
        matchingLocations[5][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_26]);
        matchingLocations[5][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_27]);
        matchingLocations[5][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_28]);
        matchingLocations[5][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_29]);
        matchingLocations[5][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_30]);
        matchingLocations[6][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_31]);
        matchingLocations[6][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_32]);
        matchingLocations[6][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_33]);
        matchingLocations[6][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_34]);
        matchingLocations[6][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_35]);
        matchingLocations[7][0].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_36]);
        matchingLocations[7][1].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_37]);
        matchingLocations[7][2].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_38]);
        matchingLocations[7][3].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_39]);
        matchingLocations[7][4].setMatchingInstance(matchingInstances[Constants.MATCH_INSTANCE_LAST]);
    }
    
    private static MatchingGame createMatchingGame() {
       
        MatchingGame matchingGame = new MatchingGame(8,5);
        
        MatchingInstance[] matchingInstances = createMatchingInstances();
        
        GameControl.assignMatchingScenesToMatchingLocations(matchingGame, matchingInstances);
        
        return matchingGame;
    }
    
    private static Map createMap() {
       
        Map map = new Map(4,5);
        
        InstanceLocation[] instances = createInstances();
        
        GameControl.assignScenesToLocations(map, instances);
        
        return map;
    }
    
    public static void sortActors(Actors actors[]) {
        
        int i, j;
        Actors temp;
        
        for (i = 0; i < actors.length - 1; i++)
        {
            for (j = i + 1; j < actors.length; j++)
            {
                if (actors[i].getName().compareToIgnoreCase(actors[j].getName()) > 0)
                {
                    temp = actors[i];
                    actors[i] = actors[j];
                    actors[j] = temp;
                } 
            }
        }
    }
    
    public static void sortInventory(InventoryItem[] inventoryList) {
        int i, j;
        InventoryItem temp;
        
        for (i = 0; i < inventoryList.length - 1; i++)
        {
            for (j = i + 1; j < inventoryList.length; j++)
            {
                if (inventoryList[i].getName().compareToIgnoreCase(inventoryList[j].getName()) > 0)
                {
                    temp = inventoryList[i];
                    inventoryList[i] = inventoryList[j];
                    inventoryList[j] = temp;
                }
            }
        }
    }
    
    public static InventoryItem[] getSortedInventoryList() {
        
        InventoryItem[] inventoryList = AMedievalHarvestFestival.getCurrentGame().getInventory();
        
        GameControl.sortInventory(inventoryList);
        
        return inventoryList;
    }

    public static MatchingGameLocation[][] getMatchingGameLocations() {
        
        return AMedievalHarvestFestival.getCurrentGame().getMatchingGame().getMatchingLocations();
        
    }
    
    public static Location[][] getMapLocations() {
        
        return AMedievalHarvestFestival.getCurrentGame().getMap().getLocations();
        
    }
    
    public static String getPlayerCurrentLocationName() {
        
        return AMedievalHarvestFestival.getPlayer().getPlayerLocation().getInstance().getName();
    }
    
    public static String getPlayerCurrentLocationDescription() {
        
        return AMedievalHarvestFestival.getPlayer().getPlayerLocation().getInstance().getDescription();
    }
    
    public static Location getGameEventLocation() {
        
        return AMedievalHarvestFestival.getCurrentGame().getGameEventLocation();
    }

    public static String greatestAmount(InventoryItem[] inventory) {
        int max = 0;
        String maxName = null;
        int zeroCount = 0;
        int equalCount = 0;
        String message;
        for (InventoryItem inventoryItem : inventory) {
            
            if (inventoryItem.getItemQuanity() > max) {
                maxName = inventoryItem.getName();
                max = inventoryItem.getItemQuanity();
             }
            else if (inventoryItem.getItemQuanity() == max && max == 0)
            {
                zeroCount++;
            }
            else if (inventoryItem.getItemQuanity() == max && max > 0)
            {
                equalCount++;
            }
        }
        
        if (max == 0) 
            message = "\nThere are no items.";
        else if (equalCount >= 1 && max > 0 && equalCount != 21)
            message = "\nThere is an equal amount of one or more items.";
        else if (zeroCount == 21 && max > 0)
            message = "\nThere is an equal amount of all items.";
        else
            message = '\n' + maxName + "\nhas the highest quantitiy.";
        
        return message;
    }
}