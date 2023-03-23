package com.hoteldream.account.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class BuSignUpForm {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Length(min = 3, max = 30)
    private String password;

    @NotBlank
    @Length(min = 3, max = 20)
    private String name;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    @Length(min = 3, max = 30)
    private String buTitle;

    @NotBlank
    @Length(min = 3, max = 30)
    private String buAddress;

    @NotBlank
    private String hotelPicture;
}
