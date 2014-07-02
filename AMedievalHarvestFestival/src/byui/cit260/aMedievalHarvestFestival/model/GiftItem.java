/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

/**
 * @version Adam
 * @author Edit: Kurt
 */
public class GiftItem extends InventoryItem{
    

    //class instance variables
    private double joyGiving;

    public GiftItem(double joy) {
        joyGiving = joy;
    }
    
    public double getJoyGiving() {
        return joyGiving;
    }

    public void setJoyGiving(double joyGiving) {
        this.joyGiving = joyGiving;
    }

    @Override
    public String toString() {
        // this pulls down the super class data
        return super.toString() + "GiftItem{" + "joyGiving=" + joyGiving + '}';
    // <--end
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.joyGiving) ^ (Double.doubleToLongBits(this.joyGiving) >>> 32));
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
        final GiftItem other = (GiftItem) obj;
        if (Double.doubleToLongBits(this.joyGiving) != Double.doubleToLongBits(other.joyGiving)) {
            return false;
        }
        // this pulls down the super class data
        boolean isEqual = super.equals(obj);
        return isEqual;
// <--end
    }
    
    
}

