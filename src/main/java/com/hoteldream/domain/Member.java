package com.hoteldream.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor

public class Member {
    @Id @GeneratedValue
    private long id;

    private String meEmail;

    private String mePassword;

    private String meName;

    private String mePhoneNumber;

    //private int adminCheck;



}
