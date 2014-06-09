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
public class FoodItem extends InventoryItem {
     

    //class instance variables
    private Double fillingFactor;

    public FoodItem() {
    }
    
    public Double getFillingFactor() {
        return fillingFactor;
    }

    public void setFillingFactor(Double fillingFactor) {
        this.fillingFactor = fillingFactor;
    }

    @Override
    public String toString() {
// this pulls down the super class data
        return super.toString() + "FoodItem{" + "fillingFactor=" + fillingFactor + '}';
// <--end
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.fillingFactor);
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
        final FoodItem other = (FoodItem) obj;
        if (!Objects.equals(this.fillingFactor, other.fillingFactor)) {
            return false;
        }
// this pulls down the super class data
        boolean isEqual = super.equals(obj);
        return isEqual;
// <--end
    }
  
}

