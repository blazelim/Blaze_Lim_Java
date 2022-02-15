package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer cus;
    private Address ship;
    private Address bill;

    @Before
    public void init() {
        ship = new Address(
                "555 Fake Address St",
                "Apt. #420",
                "fakerCity",
                "fakerState",
                "12345"
        );

        bill = new Address(
                "222 Pseudo Address Rd",
                "Apt. #024",
                "fakerCity2",
                "fakerState2",
                "54321"
        );

        cus = new Customer(
                "Blaze",
                "Lim",
                "random@email.com",
                "6266006294",
                ship,
                bill,
                true
        );
    }

    @Test
    public void accessingCustomerInformation() {
        assertEquals("Blaze", cus.getFirstName());
        assertEquals("Lim", cus.getLastName());
        assertEquals("random@email.com", cus.getEmail());
        assertEquals("6266006294", cus.getPhoneNumber());
        assertTrue(cus.isRewardsMember());
    }

    @Test
    public void ableToChangeCustomerInformation() {
        assertEquals("Blaze", cus.getFirstName());
        assertEquals("Lim", cus.getLastName());
        assertEquals("random@email.com", cus.getEmail());
        assertEquals("6266006294", cus.getPhoneNumber());
        assertTrue(cus.isRewardsMember());

        cus.setFirstName("Randy");
        cus.setLastName("Wrong");
        cus.setEmail("lessRandom@email.com");
        cus.setPhoneNumber("1234567891");
        cus.setRewardsMember(false);

        assertEquals("Randy", cus.getFirstName());
        assertEquals("Wrong", cus.getLastName());
        assertEquals("lessRandom@email.com", cus.getEmail());
        assertEquals("1234567891", cus.getPhoneNumber());
        assertFalse(cus.isRewardsMember());
    }

    @Test
    public void abilityToGetAddresses() {
        assertTrue(cus.getBillingAddress().equals(bill));
        assertTrue(cus.getShippingAddress().equals(ship));
    }

    @Test
    public void abilityToChangeAddress() {
        Address newAddress = new Address(
                "123 Faux Address Ct",
                "Apt. #7453",
                "fakerCity3",
                "fakerState3",
                "67894");

        assertNotEquals(cus.getShippingAddress(), newAddress);
        cus.setShippingAddress(newAddress);
        assertEquals(cus.getShippingAddress(),newAddress);
    }
}