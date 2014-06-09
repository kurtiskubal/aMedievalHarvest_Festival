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
public class RoomInstance implements Serializable{

    //class instance variables
    private double roomHeight;
    private double roomWidth;
    private double roomLength;
    private double sqFootageRoom;

    public RoomInstance() {
    }
    
    public double getRoomHeight() {
        return roomHeight;
    }

    public void setRoomHeight(double roomHeight) {
        this.roomHeight = roomHeight;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(double roomLength) {
        this.roomLength = roomLength;
    }

    public double getSqFootageRoom() {
        return sqFootageRoom;
    }

    public void setSqFootageRoom(double sqFootageRoom) {
        this.sqFootageRoom = sqFootageRoom;
    }

    @Override
    public String toString() {
        return "RoomInstance{" + "roomHeight=" + roomHeight + ", roomWidth=" + roomWidth + ", roomLength=" + roomLength + ", sqFootageRoom=" + sqFootageRoom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.roomHeight) ^ (Double.doubleToLongBits(this.roomHeight) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.roomWidth) ^ (Double.doubleToLongBits(this.roomWidth) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.roomLength) ^ (Double.doubleToLongBits(this.roomLength) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.sqFootageRoom) ^ (Double.doubleToLongBits(this.sqFootageRoom) >>> 32));
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
        final RoomInstance other = (RoomInstance) obj;
        if (Double.doubleToLongBits(this.roomHeight) != Double.doubleToLongBits(other.roomHeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.roomWidth) != Double.doubleToLongBits(other.roomWidth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.roomLength) != Double.doubleToLongBits(other.roomLength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sqFootageRoom) != Double.doubleToLongBits(other.sqFootageRoom)) {
            return false;
        }
        return true;
    }
    
    
    
}
