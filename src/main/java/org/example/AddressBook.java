package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "addressBook", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public AddressBook(String name) {this.name = name;}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addBuddy(BuddyInfo newBuddy) {
        buddies.add(newBuddy);
        newBuddy.setAddressBook(this);
    }
    public Boolean removeBuddy(BuddyInfo remBuddy) {
        return buddies.remove(remBuddy);
    }



    public List<BuddyInfo> getBuddies() {
        return buddies;
    }



    public void setBuddies(List<BuddyInfo> buddies) {
        this.buddies = buddies;
    }


    @Override
    public String toString() {

        return buddies.toString();
    }
}
