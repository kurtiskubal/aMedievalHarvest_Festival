/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.util.Objects;
import java.util.Random;

/**
 * @version Adam
 * @author edit: Kurt
 */
public class BeverageItem extends InventoryItem {
    
    private static final Random random = new Random();
    public static double randomInRange(double min, double max) {
        double range = max - min;
        double scaled = random.nextDouble() * range;
        double shifted = scaled + min;
        return shifted;
    }

    //class instance variables
    private Integer beverageType = 0;
    private final Double volume = randomInRange(1,10);
    private final Double quenchFactor = beverageType * volume;
    
    public BeverageItem(int type) {
        beverageType = type;
    }
    
    public Double getQuenchFactor() {
        return quenchFactor;
    }

    public Integer getBeverageType() {
        return beverageType;
    }

    public void setBeverageType(Integer beverageType) {
        this.beverageType = beverageType;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.beverageType);
        hash = 41 * hash + Objects.hashCode(this.volume);
        hash = 41 * hash + Objects.hashCode(this.quenchFactor);
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
        if (!Objects.equals(this.beverageType, other.beverageType)) {
            return false;
        }
        if (!Objects.equals(this.volume, other.volume)) {
            return false;
        }
        if (!Objects.equals(this.quenchFactor, other.quenchFactor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BeverageItem{" + "beverageType=" + beverageType + ", volume=" + volume + ", quenchFactor=" + quenchFactor + '}';
    }
    
}

