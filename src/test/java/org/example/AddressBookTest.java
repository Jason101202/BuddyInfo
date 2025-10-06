package org.example;

import jakarta.persistence.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AddressBookTest {
    public AddressBook abt1;

    @Before
    public void setUp() throws Exception {
        abt1 = new AddressBook();

    }


    @Test
    public void addBuddy() {
        abt1.addBuddy(new BuddyInfo("bud", "addr", "1234", "bud@carleton.ca"));
        assertEquals("[BuddyInfo{name='bud', address='addr', phoneNumber='1234', email='bud@carleton.ca'}]",abt1.toString());
    }

    @Test
    public void removeBuddy() {
        abt1.removeBuddy(new BuddyInfo("bud", "addr", "1234","bud@carleton.ca"));
        assertEquals("[]", abt1.toString());
    }

    @Test
    public void testToString() {
        abt1.addBuddy(new BuddyInfo("bud", "addr", "1234","bud@carleton.ca"));
        abt1.addBuddy(new BuddyInfo("bud2", "addr2", "4321", "bud2@carleton.ca"));
        assertEquals("[BuddyInfo{name='bud', address='addr', phoneNumber='1234',email='bud@carleton.ca'}, BuddyInfo{name='bud2', address='addr2', phoneNumber='4321', email='bud2@carleton.ca'}]", abt1.toString());
    }


}