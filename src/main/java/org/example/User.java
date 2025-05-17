package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private List<Booking> bookingList;

    public User(String firstName, String lastName, String phoneNo) {
        this.userId = String.valueOf(new Random().nextInt(100000));
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.bookingList = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }
}
