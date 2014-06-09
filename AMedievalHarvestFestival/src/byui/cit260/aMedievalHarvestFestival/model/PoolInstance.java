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
public class PoolInstance implements Serializable {
    
    //class instance variables
    private Double poolDepth;
    private Double poolLength;
    private Double poolWidth;

    public PoolInstance() {
    }
    
    public Double getPoolDepth() {
        return poolDepth;
    }

    public void setPoolDepth(Double poolDepth) {
        this.poolDepth = poolDepth;
    }

    public Double getPoolLength() {
        return poolLength;
    }

    public void setPoolLength(Double poolLength) {
        this.poolLength = poolLength;
    }

    public Double getPoolWidth() {
        return poolWidth;
    }

    public void setPoolWidth(Double poolWidth) {
        this.poolWidth = poolWidth;
    }

    @Override
    public String toString() {
        return "PoolInstance{" + "poolDepth=" + poolDepth + ", poolLength=" + poolLength + ", poolWidth=" + poolWidth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.poolDepth);
        hash = 47 * hash + Objects.hashCode(this.poolLength);
        hash = 47 * hash + Objects.hashCode(this.poolWidth);
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
        final PoolInstance other = (PoolInstance) obj;
        if (!Objects.equals(this.poolDepth, other.poolDepth)) {
            return false;
        }
        if (!Objects.equals(this.poolLength, other.poolLength)) {
            return false;
        }
        if (!Objects.equals(this.poolWidth, other.poolWidth)) {
            return false;
        }
        return true;
    }
    
    
}

