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
public class Order {
    private String Order_Id;
    private String Item_Code;
    private int Quantity;

    /**
     * @return the Order_Id
     */
    public Order(){}
    
    public Order(String Order_Id, String Item_Code, int Quantity){
        this.Order_Id = Order_Id;
        this.Item_Code = Item_Code;
        this.Quantity = Quantity;
    }
    public String getOrder_Id() {
        return Order_Id;
    }

    /**
     * @param Order_Id the Order_Id to set
     */
    public void setOrder_Id(String Order_Id) {
        this.Order_Id = Order_Id;
    }

    /**
     * @return the Item_Code
     */
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
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    
    
}
