package com.hoteldream.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class Room {
    @Id @GeneratedValue
    private long id;

    // private String buEmail;

    private String roomPhoto;
    // private int picNum;

    private String price;

    private LocalDate checkIn;

    private LocalDate checkOut;

    private int roCount;

    private String roName;

    private String roInfo;
}
