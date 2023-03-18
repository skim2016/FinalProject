package com.hoteldream.account.member;

import com.hoteldream.account.business.BusinessRepository;
import com.hoteldream.account.form.BuSignUpForm;
import com.hoteldream.account.form.MeSignUpForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class MemberValidator implements Validator {
    private final MemberRepository memberRepository;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom((MeSignUpForm.class));
    }

    @Override
    public void validate(Object target, Errors errors) {
        MeSignUpForm meSignUpForm = (MeSignUpForm)target;
        if(memberRepository.existsByMeEmail(meSignUpForm.getEmail())){
            errors.rejectValue("email", "invalid.email",
                    new Object[]{meSignUpForm.getEmail()},
                    "이미 사용 중인 이메일입니다");
        }
        if(memberRepository.existsByMePhoneNumber(meSignUpForm.getPhoneNumber())){
            errors.rejectValue("email", "invalid.email",
                    new Object[]{meSignUpForm.getEmail()},
                    "이미 사용 중인 이메일입니다");
        }

    }

}
