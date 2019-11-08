package com.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void test(){
        Customer customer = new Customer("Pallav");

        Movie movieOne = new Movie("Midway", Movie.NEW_RELEASE);
        Rental rentalOne = new Rental(movieOne, 1);

        Movie movieTwo = new Movie("The GoodFellas", Movie.REGULAR);
        Rental rentalTwo = new Rental(movieOne, 3);

        customer.addRental(rentalOne);
        customer.addRental(rentalTwo);

        String actual = customer.statement();

        Assert.assertEquals(
            String.format("Rental Record for Pallav\n\tMidway\t3.0\n\tMidway\t9.0\nAmount owed is 12.0\nYou earned 3 frequent renter points"),
            actual);
    }

}