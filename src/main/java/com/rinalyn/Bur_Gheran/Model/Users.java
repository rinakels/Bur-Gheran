package com.rinalyn.Bur_Gheran.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users {

    private @Id
    @GeneratedValue Long id;
    private String userName;
    private String address;
    private String contactnumber;

    Users(){}


    public Users(String userName, String address, String contactnumber) {
        this.userName = userName;
        this.address = address;
        this.contactnumber = contactnumber;
    }

    //setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

   
   //getters
    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactnumber;
    }


    

    


}
