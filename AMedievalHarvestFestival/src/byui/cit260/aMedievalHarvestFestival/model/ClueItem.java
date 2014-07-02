/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.util.Objects;

/**
 *
 * @author Adam
 */
public class ClueItem extends InventoryItem{
    
    
    // Class instance variables
    
    private String keyInformation;
    private Integer evidenceRemaining;

    public ClueItem(String info, Integer evidRemaining) {
        keyInformation = info;
        evidenceRemaining = evidRemaining;
    }

    public String getKeyInformation() {
        return keyInformation;
    }

    public void setKeyInformation(String keyInformation) {
        this.keyInformation = keyInformation;
    }

    public Integer getEvidenceRemaining() {
        return evidenceRemaining;
    }

    public void setEvidenceRemaining(Integer evidenceRemaining) {
        this.evidenceRemaining = evidenceRemaining;
    }

    @Override
    public String toString() {
        // this pulls down the super class data
        return super.toString() + "ClueItem{" + "keyInformation=" + keyInformation + ", evidenceRemaining=" + evidenceRemaining + '}';
    // <--end
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.keyInformation);
        hash = 89 * hash + Objects.hashCode(this.evidenceRemaining);
        // this pulls down the super class data
        hash = hash + super.hashCode();
// <--end
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
        final ClueItem other = (ClueItem) obj;
        if (!Objects.equals(this.keyInformation, other.keyInformation)) {
            return false;
        }
        if (!Objects.equals(this.evidenceRemaining, other.evidenceRemaining)) {
            return false;
        }
        // this pulls down the super class data
        boolean isEqual = super.equals(obj);
        return isEqual;
// <--end
    }
    
    
    
}

