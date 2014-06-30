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
public class FoodItem extends InventoryItem {
    
    private static Random random = new Random();
    public static double randomInRange(double min, double max) {
        double range = max - min;
        double scaled = random.nextDouble() * range;
        double shifted = scaled + min;
        return shifted;
    }
     

    //class instance variables
    private double foodType = 0;
    private final double weight = randomInRange(1, 10);
    private final Double fillingFactor = weight * foodType;
    

    public FoodItem() {
    }
    
    public Double getFillingFactor() {
        return fillingFactor;
    }

    public double getFoodType() {
        return foodType;
    }

    public void setFoodType(double foodType) {
        this.foodType = foodType;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.foodType) ^ (Double.doubleToLongBits(this.foodType) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 61 * hash + Objects.hashCode(this.fillingFactor);
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
        if (Double.doubleToLongBits(this.foodType) != Double.doubleToLongBits(other.foodType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (!Objects.equals(this.fillingFactor, other.fillingFactor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FoodItem{" + "foodType=" + foodType + ", weight=" + weight + ", fillingFactor=" + fillingFactor + '}';
    }
    
}

