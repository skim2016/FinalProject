package com.hoteldream.account.business;

import com.hoteldream.account.form.BuSignUpForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class BusinessValidator implements Validator {

    private final BusinessRepository businessRepository;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom((BuSignUpForm.class));
    }

    @Override
    public void validate(Object target, Errors errors) {
        BuSignUpForm buSignUpForm = (BuSignUpForm)target;
        if(businessRepository.existsByBuEmail(buSignUpForm.getEmail())){
            errors.rejectValue("email", "invalid.email",
                    new Object[]{buSignUpForm.getEmail()},
                    "이미 사용 중인 이메일입니다");
        }
        if(businessRepository.existsByBuPhoneNumber(buSignUpForm.getPhoneNumber())){
            errors.rejectValue("email", "invalid.email",
                    new Object[]{buSignUpForm.getEmail()},
                    "이미 사용 중인 이메일입니다");
        }

    }
}
