/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.io.Serializable;

/**
 *
 * @author Kurt
 */
public class Map implements Serializable {
    
//class instance variables
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns){
        
        if (noOfRows < 1 || noOfColumns < 1) {
        System.out.println("The number of rows and columns must be greater than 0");
        return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
                                     //4
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColumns; column++) {
                                                //5
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                this.locations[row][column] = location;
            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    public double getRowCount() {
        return noOfRows;
    }

    public void setRowCount(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public double getColumnCount() {
        return noOfColumns;
    }

    public void setColumnCount(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.noOfRows) ^ (Double.doubleToLongBits(this.noOfRows) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.noOfColumns) ^ (Double.doubleToLongBits(this.noOfColumns) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.noOfRows) != Double.doubleToLongBits(other.noOfRows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noOfColumns) != Double.doubleToLongBits(other.noOfColumns)) {
            return false;
        } else {
        }
        return true;
    }

    

    
    
    
    
}

