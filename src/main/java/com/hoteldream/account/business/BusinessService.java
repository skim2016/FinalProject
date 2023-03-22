package com.hoteldream.account.business;

import com.hoteldream.account.form.BuSignUpForm;
import com.hoteldream.domain.Business;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class BusinessService {
    private final BusinessRepository businessRepository;

    public Business createNewBusiness(BuSignUpForm buSignUpForm){
        Business business = Business.builder()
                .buEmail(buSignUpForm.getEmail())
                .buPassword(buSignUpForm.getPassword())
                .buName(buSignUpForm.getName())
                .buPhoneNumber(buSignUpForm.getPhoneNumber())
                .buTitle(buSignUpForm.getBuTitle())
                .buAddress(buSignUpForm.getBuAddress())
                .hotelPicture(buSignUpForm.getHotelPicture())
                .build();

        return businessRepository.save(business);
    }
}
