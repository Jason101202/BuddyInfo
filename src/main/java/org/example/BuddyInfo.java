package org.example;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Query;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class BuddyInfo {


    @Id
    private String name;
    private String address;
    private String phoneNumber;
    @ManyToOne
    private AddressBook addressBook;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public BuddyInfo() {

    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddressBook(AddressBook addressBook) {this.addressBook = addressBook; }


    public AddressBook getAddressBook() {
        return addressBook;
    }



    @Override
    public String toString() {
        return "BuddyInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }




}
