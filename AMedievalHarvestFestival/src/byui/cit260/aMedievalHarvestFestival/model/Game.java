/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * second look: Adam
 * @author Kurt
 */
public class Game implements Serializable{



//class instance variables
    private final long startTime = System.currentTimeMillis();
    private boolean gameEvent;
    private double totalTime;
    private Player player;
    private InventoryItem[] inventory;
    private Actors[] actors;
    private Map map;
    private MatchingGame matchingGame;
    private Location gameEventLocation;

    public Location getGameEventLocation() {
        return gameEventLocation;
    }

    public void setGameEventLocation(Location gameEventLocation) {
        this.gameEventLocation = gameEventLocation;
    }
    
    public boolean isGameEvent() {
        return gameEvent;
    }

    public void setGameEvent(boolean gameEvent) {
        this.gameEvent = gameEvent;
    }

    public long getStartTime() {
        return startTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Actors[] getActors() {
        return actors;
    }

    public void setActors(Actors[] actors) {
        this.actors = actors;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public MatchingGame getMatchingGame() {
        return matchingGame;
    }

    public void setMatchingGame(MatchingGame matchingGame) {
        this.matchingGame = matchingGame;
    }
    
    public Game() {
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long currentTime) {
        this.totalTime = (currentTime - this.startTime) / 1000.0;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.startTime ^ (this.startTime >>> 32));
        hash = 97 * hash + (this.gameEvent ? 1 : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.player);
        hash = 97 * hash + Arrays.deepHashCode(this.inventory);
        hash = 97 * hash + Arrays.deepHashCode(this.actors);
        hash = 97 * hash + Objects.hashCode(this.map);
        hash = 97 * hash + Objects.hashCode(this.matchingGame);
        hash = 97 * hash + Objects.hashCode(this.gameEventLocation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.startTime != other.startTime) {
            return false;
        }
        if (this.gameEvent != other.gameEvent) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actors, other.actors)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.matchingGame, other.matchingGame)) {
            return false;
        }
        if (!Objects.equals(this.gameEventLocation, other.gameEventLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "startTime=" + startTime + ", gameEvent=" + gameEvent + ", totalTime=" + totalTime + ", player=" + player + ", inventory=" + inventory + ", actors=" + actors + ", map=" + map + ", matchingGame=" + matchingGame + ", gameEventLocation=" + gameEventLocation + '}';
    }

    
}

