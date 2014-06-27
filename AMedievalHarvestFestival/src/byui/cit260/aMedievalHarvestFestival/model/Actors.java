/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kurt
 */
public class Actors implements Serializable {
    
    // class instance variables
    private String name;
    private String dialogue;
    private String dialogueHappy;
    private String dialogueEvidence;
    private String dialogueGift;
    private double happiness;
    private double health;
    private boolean evidence;
    
    public Actors() {
    }
    
    public Actors(String name) {
        this.name = name;
    }

    public void setDialogueHappy(String dialogueHappy) {
        this.dialogueHappy = dialogueHappy;
    }

    public void setDialogueEvidence(String dialogueEvidence) {
        this.dialogueEvidence = dialogueEvidence;
    }

    public void setDialogueGift(String dialogueGift) {
        this.dialogueGift = dialogueGift;
    }
    
    public String getDialogueHappy() {
        return dialogueHappy;
    }

    public String getDialogueEvidence() {
        return dialogueEvidence;
    }

    public String getDialogueGift() {
        return dialogueGift;
    }

    public boolean isEvidence() {
        return evidence;
    }

    public void setEvidence(boolean evidence) {
        this.evidence = evidence;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Actors{" + "name=" + name + ", dialogue=" + dialogue + ", happiness=" + happiness + ", health=" + health + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.dialogue);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.happiness) ^ (Double.doubleToLongBits(this.happiness) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
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
        final Actors other = (Actors) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.dialogue, other.dialogue)) {
            return false;
        }
        if (Double.doubleToLongBits(this.happiness) != Double.doubleToLongBits(other.happiness)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        return true;
    }

    
    
    
}

