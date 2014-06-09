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
import byui.cit260.aMedievalHarvestFestival.model.Player;
import byui.cit260.aMedievalHarvestFestival.model.RoomInstance;
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
    
    public static void startNewGame(Player player) {
        GameControl.game = new Game();
        
        AMedievalHarvestFestival.setCurrentGame(game);
        
        GameControl.createInventoryList();
        GameControl.createActorsList();
        GameControl.game.setMap(GameControl.createMap());
        
        MapControl.moveActorsToLocation(0,3);
    }
    
    public static void startSavedGame(){
        System.out.println("\n*** Calling startSavedGame stub function ***");
    }
   
    
    public static void createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem clueItem1 = new ClueItem();
        clueItem1.setInventoryType(1);
        clueItem1.setDescription("Lock of Hair");
        clueItem1.setItemQuanity(0);
        inventory[Constants.EVIDENCE_ONE_ITEM] = clueItem1;
        
        InventoryItem clueItem2 = new ClueItem();
        clueItem2.setInventoryType(1);
        clueItem2.setDescription("Secretive Note");
        clueItem2.setItemQuanity(0);
        inventory[Constants.EVIDENCE_TWO_ITEM] = clueItem2;
        
        InventoryItem clueItem3 = new ClueItem();
        clueItem3.setInventoryType(1);
        clueItem3.setDescription("Note From Conversation With Queen");
        clueItem3.setItemQuanity(0);
        inventory[Constants.EVIDENCE_THREE_ITEM] = clueItem3;
        
        InventoryItem clueItem4 = new ClueItem();
        clueItem4.setInventoryType(1);
        clueItem4.setDescription("Note from Conversation with Princess");
        clueItem4.setItemQuanity(0);
        inventory[Constants.EVIDENCE_FOUR_ITEM] = clueItem4;
        
        InventoryItem clueItem5 = new ClueItem();
        clueItem5.setInventoryType(1);
        clueItem5.setDescription("Found Ransom Note");
        clueItem5.setItemQuanity(0);
        inventory[Constants.EVIDENCE_FIVE_ITEM] = clueItem5;
        
        InventoryItem apple = new FoodItem();
        apple.setInventoryType(2);
        apple.setDescription("A delicious hand-picked apple.");
        apple.setItemQuanity(0);
        inventory[Constants.APPLE] = apple;
        
        InventoryItem bread = new FoodItem();
        bread.setInventoryType(2);
        bread.setDescription("Fresh, delicious, homemade bread.");
        bread.setItemQuanity(0);
        inventory[Constants.BREAD] = bread;
        
        InventoryItem corn = new FoodItem();
        corn.setInventoryType(2);
        corn.setDescription("Freshly husked corn from the William's fields.");
        corn.setItemQuanity(0);
        inventory[Constants.CORN] = corn;
        
        InventoryItem beans = new FoodItem();
        beans.setInventoryType(2);
        beans.setDescription("Delicious black beans.");
        beans.setItemQuanity(0);
        inventory[Constants.BEANS] = beans;
        
        InventoryItem peas = new FoodItem();
        peas.setInventoryType(2);
        peas.setDescription("Freshly harvested peas with churned butter.");
        peas.setItemQuanity(0);
        inventory[Constants.PEAS] = peas;
        
        InventoryItem ale = new BeverageItem();
        ale.setInventoryType(3);
        ale.setDescription("A dark-colored alcoholic liquid, smells funny.");
        ale.setItemQuanity(0);
        inventory[Constants.ALE] = ale;
        
        InventoryItem mead = new BeverageItem();
        mead.setInventoryType(3);
        mead.setDescription("An alcoholic liquid with the taste of honey and water.");
        mead.setItemQuanity(0);
        inventory[Constants.MEAD] = mead;
        
        InventoryItem water = new BeverageItem();
        water.setInventoryType(3);
        water.setDescription("H20, or as it is now called, clear beer.");
        water.setItemQuanity(0);
        inventory[Constants.WATER] = water;
        
        InventoryItem cider = new BeverageItem();
        cider.setInventoryType(3);
        cider.setDescription("Old apple juice.");
        cider.setItemQuanity(0);
        inventory[Constants.CIDER] = cider;
        
        InventoryItem wine = new BeverageItem();
        wine.setInventoryType(3);
        wine.setDescription("Old grape juice.");
        wine.setItemQuanity(0);
        inventory[Constants.WINE] = wine;
        
        InventoryItem dagger = new WeaponItem();
        dagger.setInventoryType(4);
        dagger.setDescription("A deadly, sharp, short blade. Looks like it can be hidden easily");
        dagger.setItemQuanity(0);
        inventory[Constants.DAGGER] = dagger;
        
        InventoryItem sword = new WeaponItem();
        sword.setInventoryType(3);
        sword.setDescription("A long, edged weapon.");
        sword.setItemQuanity(0);
        inventory[Constants.SWORD] = sword;
    
        InventoryItem genericGift = new GiftItem();
        genericGift.setInventoryType(4);
        genericGift.setDescription("A plain, old gift.");
        genericGift.setItemQuanity(0);
        inventory[Constants.GENERIC_GIFT] = genericGift;
        
        InventoryItem gift = new GiftItem();
        gift.setInventoryType(4);
        gift.setDescription("A pretty nice gift.");
        gift.setItemQuanity(0);
        inventory[Constants.GIFT] = gift;
        
        InventoryItem awesomeGift = new GiftItem();
        awesomeGift.setInventoryType(4);
        awesomeGift.setDescription("An awesome gift.");
        awesomeGift.setItemQuanity(0);
        inventory[Constants.AWESOME_GIFT] = awesomeGift;
    }

    private static void createActorsList() {
        
        Actors[] actors = new Actors[Constants.NUMBER_OF_ACTORS];
        
        Actors ladyViolet = new Actors();
        ladyViolet.setName("Lady Violet");
        ladyViolet.setDialogue("dialogue");
        ladyViolet.setHappiness(0);
        ladyViolet.setHealth(100);
        actors[Constants.VIOLET] = ladyViolet;
        
        Actors dFred = new Actors();
        dFred.setName("Duke Frederick");
        dFred.setDialogue("dialogue");
        dFred.setHappiness(0);
        dFred.setHealth(100);
        actors[Constants.FREDERICK] = dFred;
        
        Actors dHarold = new Actors();
        dHarold.setName("Duke Harold");
        dHarold.setDialogue("dialogue");
        dHarold.setHappiness(0);
        dHarold.setHealth(100);
        actors[Constants.HAROLD] = dHarold;
        
        Actors dLuis = new Actors();
        dLuis.setName("Duke Luis");
        dLuis.setDialogue("dialogue");
        dLuis.setHappiness(0);
        dLuis.setHealth(100);
        actors[Constants.LUIS] = dLuis;
        
        Actors lCanaway = new Actors();
        lCanaway.setName("Lord Canaway");
        lCanaway.setDialogue("dialogue");
        lCanaway.setHappiness(0);
        lCanaway.setHealth(100);
        actors[Constants.CANAWAY] = lCanaway;
        
        Actors pWilliam = new Actors();
        pWilliam.setName("Princess William");
        pWilliam.setDialogue("dialogue");
        pWilliam.setHappiness(0);
        pWilliam.setHealth(100);
        actors[Constants.PRINCESS_WILLIAM] = pWilliam;
        
        Actors qWilliam = new Actors();
        qWilliam.setName("Queen William");
        qWilliam.setDialogue("dialogue");
        qWilliam.setHappiness(0);
        qWilliam.setHealth(100);
        actors[Constants.QUEEN_WILLIAM] = qWilliam;
        
        Actors kWilliam = new Actors();
        kWilliam.setName("King William");
        kWilliam.setDialogue("dialogue");
        kWilliam.setHappiness(0);
        kWilliam.setHealth(100);
        actors[Constants.KING_WILLIAM] = kWilliam;
        
        Actors servantC = new Actors();
        servantC.setName("Servant Charles");
        servantC.setDialogue("dialogue");
        servantC.setHappiness(0);
        servantC.setHealth(100);
        actors[Constants.SERVANT_CHARLES] = servantC;
        
        Actors servantD = new Actors();
        servantD.setName("Servant David");
        servantD.setDialogue("dialogue");
        servantD.setHappiness(0);
        servantD.setHealth(100);
        actors[Constants.SERVANT_DAVID] = servantD;
        
        Actors servantL = new Actors();
        servantL.setName("Servant Larry");
        servantL.setDialogue("dialogue");
        servantL.setHappiness(0);
        servantL.setHealth(100);
        actors[Constants.SERVANT_LARRY] = servantL;
        
    }

    private static Map createMap() {
       
        Map map = new Map(7,3);
        
        Location[][] locations = map.getLocations();
        
        InstanceLocation stableInstance = new InstanceLocation();
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
        locations[0][0].setInstance(stableInstance);
        
        InstanceLocation roomInstance = new InstanceLocation();
        roomInstance.setDescription("");
        roomInstance.setItemsStored(null);
        roomInstance.setEnergyUsed(10);
        roomInstance.setFluidsUsed(5);
        roomInstance.setType(0);
        roomInstance.setVisited(false);
        roomInstance.setRow(0);
        roomInstance.setColumn(1);
        locations[0][1].setInstance(roomInstance);
        
        InstanceLocation ladyVInstance = new InstanceLocation();
        ladyVInstance.setDescription("");
        ladyVInstance.setItemsStored(null);
        ladyVInstance.setEnergyUsed(10);
        ladyVInstance.setFluidsUsed(5);
        ladyVInstance.setType(0);
        ladyVInstance.setVisited(false);
        ladyVInstance.setRow(0);
        ladyVInstance.setColumn(2);
        locations[0][2].setInstance(ladyVInstance);
        
        InstanceLocation dukeFInstance = new InstanceLocation();
        dukeFInstance.setDescription("");
        dukeFInstance.setItemsStored(null);
        dukeFInstance.setEnergyUsed(10);
        dukeFInstance.setFluidsUsed(5);
        dukeFInstance.setType(0);
        dukeFInstance.setVisited(false);
        dukeFInstance.setRow(1);
        dukeFInstance.setColumn(0);
        locations[1][0].setInstance(dukeFInstance);
        
        InstanceLocation dukeHInstance = new InstanceLocation();
        dukeHInstance.setDescription("");
        dukeHInstance.setItemsStored(null);
        dukeHInstance.setEnergyUsed(10);
        dukeHInstance.setFluidsUsed(5);
        dukeHInstance.setType(0);
        dukeHInstance.setVisited(false);
        dukeHInstance.setRow(1);
        dukeHInstance.setColumn(1);
        locations[1][1].setInstance(dukeHInstance);
        
        InstanceLocation dukeLInstance = new InstanceLocation();
        dukeLInstance.setDescription("");
        dukeLInstance.setItemsStored(null);
        dukeLInstance.setEnergyUsed(10);
        dukeLInstance.setFluidsUsed(5);
        dukeLInstance.setType(0);
        dukeLInstance.setVisited(false);
        dukeLInstance.setRow(1);
        dukeLInstance.setColumn(2);
        locations[1][2].setInstance(dukeLInstance);
        
        InstanceLocation lordCInstance = new InstanceLocation();
        lordCInstance.setDescription("");
        lordCInstance.setItemsStored(null);
        lordCInstance.setEnergyUsed(10);
        lordCInstance.setFluidsUsed(5);
        lordCInstance.setType(0);
        lordCInstance.setVisited(false);
        lordCInstance.setRow(2);
        lordCInstance.setColumn(0);
        locations[2][0].setInstance(lordCInstance);
        
        InstanceLocation emptyRoomInstance = new InstanceLocation();
        emptyRoomInstance.setDescription("");
        emptyRoomInstance.setItemsStored(null);
        emptyRoomInstance.setEnergyUsed(10);
        emptyRoomInstance.setFluidsUsed(5);
        emptyRoomInstance.setType(0);
        emptyRoomInstance.setVisited(false);
        emptyRoomInstance.setRow(2);
        emptyRoomInstance.setColumn(1);
        locations[2][1].setInstance(emptyRoomInstance);
        
        InstanceLocation servantsInstance = new InstanceLocation();
        servantsInstance.setDescription("\nThe Servant's quarters are large enough to accommodate half the staff along with their own beds, wardrobes,"
                                      + "\ndressers, and large chests for their personal belongings. Half of the furniture is pushed up     " 
                                      + "\nagainst the back wall as most servants are married and live in a house out in the nearby      " 
                                      + "\nvillage. Everything is clean and well organized in the room.");
        servantsInstance.setItemsStored(null);
        servantsInstance.setEnergyUsed(10);
        servantsInstance.setFluidsUsed(5);
        servantsInstance.setType(0);
        servantsInstance.setVisited(false);
        servantsInstance.setRow(2);
        servantsInstance.setColumn(2);
        locations[2][2].setInstance(servantsInstance);
        
        InstanceLocation princessInstance = new InstanceLocation();
        princessInstance.setDescription("");
        princessInstance.setItemsStored(null);
        princessInstance.setEnergyUsed(10);
        princessInstance.setFluidsUsed(5);
        princessInstance.setType(0);
        princessInstance.setVisited(false);
        princessInstance.setRow(3);
        princessInstance.setColumn(0);
        locations[3][0].setInstance(princessInstance);
        
        InstanceLocation kingsInstance = new InstanceLocation();
        kingsInstance.setDescription("");
        kingsInstance.setItemsStored(null);
        kingsInstance.setEnergyUsed(10);
        kingsInstance.setFluidsUsed(5);
        kingsInstance.setType(0);
        kingsInstance.setVisited(false);
        kingsInstance.setRow(3);
        kingsInstance.setColumn(1);
        locations[3][1].setInstance(kingsInstance);
        
        InstanceLocation kingsRRInstance = new InstanceLocation();
        kingsRRInstance.setDescription("");
        kingsRRInstance.setItemsStored(null);
        kingsRRInstance.setEnergyUsed(10);
        kingsRRInstance.setFluidsUsed(5);
        kingsRRInstance.setType(0);
        kingsRRInstance.setVisited(false);
        kingsRRInstance.setRow(3);
        kingsRRInstance.setColumn(2);
        locations[3][2].setInstance(kingsRRInstance);

        InstanceLocation gardenInstance = new InstanceLocation();
        gardenInstance.setDescription("");
        gardenInstance.setItemsStored(null);
        gardenInstance.setEnergyUsed(10);
        gardenInstance.setFluidsUsed(5);
        gardenInstance.setType(0);
        gardenInstance.setVisited(false);
        gardenInstance.setRow(4);
        gardenInstance.setColumn(0);
        locations[4][0].setInstance(gardenInstance);
        
        InstanceLocation courtyardInstance = new InstanceLocation();
        courtyardInstance.setDescription("");
        courtyardInstance.setItemsStored(null);
        courtyardInstance.setEnergyUsed(10);
        courtyardInstance.setFluidsUsed(5);
        courtyardInstance.setType(0);
        courtyardInstance.setVisited(false);
        courtyardInstance.setRow(4);
        courtyardInstance.setColumn(1);
        locations[4][1].setInstance(courtyardInstance);
        
        InstanceLocation restroomInstance = new InstanceLocation();
        restroomInstance.setDescription("");
        restroomInstance.setItemsStored(null);
        restroomInstance.setEnergyUsed(10);
        restroomInstance.setFluidsUsed(5);
        restroomInstance.setType(0);
        restroomInstance.setVisited(false);
        restroomInstance.setRow(4);
        restroomInstance.setColumn(2);
        locations[4][2].setInstance(restroomInstance);
        
        InstanceLocation kitchenInstance = new InstanceLocation();
        kitchenInstance.setDescription("");
        kitchenInstance.setItemsStored(null);
        kitchenInstance.setEnergyUsed(10);
        kitchenInstance.setFluidsUsed(5);
        kitchenInstance.setType(0);
        kitchenInstance.setVisited(false);
        kitchenInstance.setRow(5);
        kitchenInstance.setColumn(0);
        locations[5][0].setInstance(kitchenInstance);
        
        InstanceLocation chamberInstance = new InstanceLocation();
        chamberInstance.setDescription("");
        chamberInstance.setItemsStored(null);
        chamberInstance.setEnergyUsed(10);
        chamberInstance.setFluidsUsed(5);
        chamberInstance.setType(0);
        chamberInstance.setVisited(false);
        chamberInstance.setRow(5);
        chamberInstance.setColumn(1);
        locations[5][1].setInstance(chamberInstance);
        
        InstanceLocation hallInstance = new InstanceLocation();
        hallInstance.setDescription("");
        hallInstance.setItemsStored(null);
        hallInstance.setEnergyUsed(10);
        hallInstance.setFluidsUsed(5);
        hallInstance.setType(0);
        hallInstance.setVisited(false);
        hallInstance.setRow(5);
        hallInstance.setColumn(2);
        locations[5][2].setInstance(hallInstance);
        
        InstanceLocation libraryInstance = new InstanceLocation();
        libraryInstance.setDescription("");
        libraryInstance.setItemsStored(null);
        libraryInstance.setEnergyUsed(10);
        libraryInstance.setFluidsUsed(5);
        libraryInstance.setType(0);
        libraryInstance.setVisited(false);
        libraryInstance.setRow(6);
        libraryInstance.setColumn(0);
        locations[6][0].setInstance(libraryInstance);
        
        return map;
        
    }
    
    public static void sortActors(Actors actors[]) {
        
        int i, j;
        String temp;
        
        for (i = 0; i < actors.length - 1; i++)
        {
            for (j = i + 1; j < actors.length; j++)
            {
                //if (actors[i].compareToIgnoreCase(actors[j]) > 0)
                {
                    //temp = actors[i];
                    actors[i] = actors[j];
                    //actors[j] = temp;
                }
            }
        }
    }
    
}

