/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.util.Objects;

/**
 * @version Adam
 * @author edit: Kurt
 */
public class BeverageItem extends InventoryItem {
    

    //class instance variables
    private Double quenchFactor;

    public BeverageItem() {
    }
    
    public Double getQuenchFactor() {
        return quenchFactor;
    }

    public void setQuenchFactor(Double quenchFactor) {
        this.quenchFactor = quenchFactor;
    }

    @Override
    public String toString() {
        // this pulls down the super class data
        return super.toString() + "BeverageItem{" + "quenchFactor=" + quenchFactor + '}';
    // <--end
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.quenchFactor);
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
        final BeverageItem other = (BeverageItem) obj;
        if (!Objects.equals(this.quenchFactor, other.quenchFactor)) {
            return false;
        }
        // this pulls down the super class data
        boolean isEqual = super.equals(obj);
        return isEqual;
// <--end
    }

    
}

