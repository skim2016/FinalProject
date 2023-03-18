package com.hoteldream.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Business {

    // 참조 DB
    // Room
    // Picture
    // Admin 아마도?

    @Id @GeneratedValue
    private long id;

    private String buEmail;

    private String buPassword;

    private String buTitle;

    // private String roTitle;

    // private String picture;

    private String buAddress;

    private String buPhoneNumber;

    private String buName;

    private int approval;
}
