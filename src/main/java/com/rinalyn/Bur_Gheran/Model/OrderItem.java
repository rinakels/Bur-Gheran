package com.rinalyn.Bur_Gheran.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderitemtbl")

public class OrderItem {
    
    private @Id
    @GeneratedValue Long orderitemId;
    private Long orderId;
    private Long productId;
    private int quantity;
    private double price;
    
    
    OrderItem(){}

    public OrderItem(Long orderitemId, Long orderId, Long productId, int quantity, double price){
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    } 

    //getters

    public Long getorderitemId(){
        return orderitemId;
    }
    
    public Long getorderId(){
        return orderId;
    }

    public Long getproductId(){
        return productId;
    }

    public int getquantity(){
        return quantity;
    }

    public double getprice(){
        return price;
    }

    //setters
    public void setorderitemId(Long orderitemId){
        this.orderitemId = orderitemId;
    }

    public void setorderId(Long orderId){
        this.orderId = orderId;
    }

    public void setproduct(Long productId){
        this.productId = productId;
    }

    public void setquantity(int quantity){
        this.quantity = quantity;
    }
    
    public void setprice(double price){
        this.price = price;
    }

}
