/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

/**
 *
 * @author Adam Decker
 */
public class ConsumableControl {
    public Integer calcFillingFoodItem(Integer foodType, Integer weight){
        if(foodType == null || weight == null)return null;
        else if(foodType < 1)return -1;
        else if(weight < 1)return -2;
        else if (foodType > 5)return -3;
        else if(weight > 10)return -4;
        else {
            Integer fillingFactor;
            fillingFactor = foodType * weight;
            return fillingFactor;
        }
    }
    public Integer calcQuenchBeverageItem(Integer beverageType, Integer volume){
        if(beverageType == null || volume == null)return null;
        else if(beverageType < 1)return -1;
        else if(volume < 1)return -2;
        else if (beverageType > 5)return -3;
        else if(volume > 10)return -4;
        else {
            Integer quenchFactor;
            quenchFactor = beverageType * volume;
            return quenchFactor;
        }
    }
}

