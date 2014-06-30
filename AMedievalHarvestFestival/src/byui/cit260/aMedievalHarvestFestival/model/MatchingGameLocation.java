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
public class MatchingGameLocation implements Serializable{
    private double row;
    private double column;
    private boolean choosen;
    private boolean matched;
    private MatchingInstance matchingInstance; 

    public MatchingInstance getMatchingInstance() {
        return matchingInstance;
    }

    public void setMatchingInstance(MatchingInstance matchingInstance) {
        this.matchingInstance = matchingInstance;
    }

    public MatchingGameLocation() {
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public boolean isChoosen() {
        return choosen;
    }

    public void setChoosen(boolean choosen) {
        this.choosen = choosen;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 37 * hash + (this.choosen ? 1 : 0);
        hash = 37 * hash + (this.matched ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.matchingInstance);
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
        final MatchingGameLocation other = (MatchingGameLocation) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (this.choosen != other.choosen) {
            return false;
        }
        if (this.matched != other.matched) {
            return false;
        }
        if (!Objects.equals(this.matchingInstance, other.matchingInstance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MatchingGameLocation{" + "row=" + row + ", column=" + column + ", choosen=" + choosen + ", matched=" + matched + ", matchingInstance=" + matchingInstance + '}';
    }

    
    
    
    
    
    
}
