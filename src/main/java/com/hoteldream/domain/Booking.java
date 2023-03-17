package com.hoteldream.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class Booking {

    // 참조 할 DB
    // 1. Business
    // 2. Member
    // 3. Room
    // 4. Booking Status
    @Id @GeneratedValue
    private long id;

    private LocalDate checkIn;

    private LocalDate checkOut;

    // private int bookingStatus;

    // private String mEmail;

    // private String bEmail;

    private String price;

    private String buTile;

    // private String roTitle;

    private String guest;

}
