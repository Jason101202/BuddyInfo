package org.example;

import jakarta.persistence.Query;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BuddyInfoTest {
    private BuddyInfo bud;
    @Before
    public void setUp() throws Exception {
        bud = new BuddyInfo("bud", "addr", "1234");

    }

    @Test
    public void getName() {
        assertEquals("bud", bud.getName());
    }

    @Test
    public void getAddress() {

        assertEquals("addr", bud.getAddress());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals("1234", bud.getPhoneNumber());
    }
    @Test
    public void testToString() {
        assertEquals("BuddyInfo{name='bud', address='addr', phoneNumber='1234'}", bud.toString());

    }


}