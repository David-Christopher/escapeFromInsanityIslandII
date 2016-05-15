/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Christopher
 */
public class WarehouseTypeScene implements Serializable {
     // Class instance variables
    private String noOfItems;
    private String attribute;

    public WarehouseTypeScene() {
    }
    
    public String getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(String noOfItems) {
        this.noOfItems = noOfItems;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.noOfItems);
        hash = 67 * hash + Objects.hashCode(this.attribute);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WarehouseTypeScene other = (WarehouseTypeScene) obj;
        if (!Objects.equals(this.noOfItems, other.noOfItems)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WarehouseTypeScene{" + "noOfItems=" + noOfItems + ", attribute=" + attribute + '}';
    }

    
    
}
