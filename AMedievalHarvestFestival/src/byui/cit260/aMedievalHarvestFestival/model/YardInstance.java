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
public class YardInstance implements Serializable{
    
    //class instance variables
    private Double sqFootageYard;
    private Double grassLength;

    public YardInstance() {
    }
    
    public Double getSqFootageYard() {
        return sqFootageYard;
    }

    public void setSqFootageYard(Double sqFootageYard) {
        this.sqFootageYard = sqFootageYard;
    }

    public Double getGrassLength() {
        return grassLength;
    }

    public void setGrassLength(Double grassLength) {
        this.grassLength = grassLength;
    }

    @Override
    public String toString() {
        return "YardInstance{" + "sqFootageYard=" + sqFootageYard + ", grassLength=" + grassLength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.sqFootageYard);
        hash = 79 * hash + Objects.hashCode(this.grassLength);
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
        final YardInstance other = (YardInstance) obj;
        if (!Objects.equals(this.sqFootageYard, other.sqFootageYard)) {
            return false;
        }
        if (!Objects.equals(this.grassLength, other.grassLength)) {
            return false;
        }
        return true;
    }
    
    
    
}

