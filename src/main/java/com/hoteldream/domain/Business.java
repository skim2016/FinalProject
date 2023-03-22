package com.hoteldream.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Business {

    // 참조 DB
    // Room
    // Picture
    // Admin 아마도?

    @Id @GeneratedValue
    private long id;

    private String buEmail;

    private String buPassword;

    private String buName;

    private String buPhoneNumber;

    private String buTitle;

    // private String roTitle;

    // private String picture;

    private String buAddress;

    private String hotelPicture;




    private int approval;
}
