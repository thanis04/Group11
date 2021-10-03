/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thanis
 */
public class Item {
    private String Item_Code;
    private String Description;
    private int QuantityInHand;

    /**
     * @return the Item_Code
     */
    
    public Item(){}
    
    public Item(String Item_Code, String Description, int QuantityInHand){
        this.Item_Code = Item_Code;
        this.Description = Description;
        this.QuantityInHand = QuantityInHand;
    }
    
    public String getItem_Code() {
        return Item_Code;
    }

    /**
     * @param Item_Code the Item_Code to set
     */
    public void setItem_Code(String Item_Code) {
        this.Item_Code = Item_Code;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the QuantityInHand
     */
    public int getQuantityInHand() {
        return QuantityInHand;
    }

    /**
     * @param QuantityInHand the QuantityInHand to set
     */
    public void setQuantityInHand(int QuantityInHand) {
        this.QuantityInHand = QuantityInHand;
    }
    
    
    
}
