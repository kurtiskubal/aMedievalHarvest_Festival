/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Kurt
 */
public class MatchingGame implements Serializable {
    private int rows;
    private int columns;
    private MatchingGameLocation[][] matchingLocations;

    public MatchingGame() {
    }

    public MatchingGame(int rows, int columns) {
        if (rows < 1 || columns < 1) {
        System.out.println("The number of rows and columns must be greater than 0");
        return;
        }
        
        this.rows = rows;
        this.columns = columns;
        
        this.matchingLocations = new MatchingGameLocation[rows][columns];
                                     //4
        for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++) {
                                                //5
                MatchingGameLocation matchingLocation = new MatchingGameLocation();
                matchingLocation.setColumn(column);
                matchingLocation.setRow(row);
                matchingLocation.setChoosen(false);
                
                matchingLocations[row][column] = matchingLocation;
            }
        }
    }
    
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public MatchingGameLocation[][] getMatchingLocations() {
        return matchingLocations;
    }

    public void setMatchingLocations(MatchingGameLocation[][] matchingLocations) {
        this.matchingLocations = matchingLocations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.rows;
        hash = 59 * hash + this.columns;
        hash = 59 * hash + Arrays.deepHashCode(this.matchingLocations);
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
        final MatchingGame other = (MatchingGame) obj;
        if (this.rows != other.rows) {
            return false;
        }
        if (this.columns != other.columns) {
            return false;
        }
        if (!Arrays.deepEquals(this.matchingLocations, other.matchingLocations)) {
            return false;
        }
        return true;
    }
}
