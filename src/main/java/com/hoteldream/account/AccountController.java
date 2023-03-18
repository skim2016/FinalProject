package com.hoteldream.account;

import com.hoteldream.account.business.BusinessValidator;
import com.hoteldream.account.member.MemberValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Controller
@RequiredArgsConstructor
public class AccountController {

    private final BusinessValidator businessValidator;
    private final MemberValidator memberValidator;

    @InitBinder({"buSignUpForm, meSignUpForm"})
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(businessValidator);
        webDataBinder.addValidators(memberValidator);
    }

}
