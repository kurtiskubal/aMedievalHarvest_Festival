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
public class WeaponItem extends InventoryItem {

    //class instance variables
    private Double power;
    private Double durability;

    public WeaponItem() {
    }
    
    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getDurability() {
        return durability;
    }

    public void setDurability(Double durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        // this pulls down the super class data
        return super.toString() + "WeaponItem{" + "power=" + power + ", durability=" + durability + '}';
    // <--end
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.power);
        hash = 59 * hash + Objects.hashCode(this.durability);
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
        final WeaponItem other = (WeaponItem) obj;
        if (!Objects.equals(this.power, other.power)) {
            return false;
        }
        if (!Objects.equals(this.durability, other.durability)) {
            return false;
        }
        // this pulls down the super class data
        boolean isEqual = super.equals(obj);
        return isEqual;
// <--end
    }
    
    
   
}

