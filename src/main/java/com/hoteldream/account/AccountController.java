package com.hoteldream.account;

import com.hoteldream.account.business.BusinessService;
import com.hoteldream.account.business.BusinessValidator;
import com.hoteldream.account.form.BuSignUpForm;
import com.hoteldream.account.form.MeSignUpForm;
import com.hoteldream.account.member.MemberService;
import com.hoteldream.account.member.MemberValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class AccountController {

    private final BusinessValidator businessValidator;
    private final MemberValidator memberValidator;
    private final MemberService memberService;
    private final BusinessService businessService;

    @InitBinder({"buSignUpForm, meSignUpForm"})
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(businessValidator);
        webDataBinder.addValidators(memberValidator);
    }

    // member
    @GetMapping("/meSignUpForm")
    public String meSignUpForm(Model model){
        model.addAttribute("meSignUpForm",new MeSignUpForm());
        return "member/meSignUpForm";
    }

    @PostMapping("/meSignUpForm")
    public String meSignUpForm(@Valid MeSignUpForm meSignUpForm, Errors errors){
        if(errors.hasErrors()){
            return "jmember/meSignUpForm";
        }
        memberService.createNewMember(meSignUpForm);
        return "redirect:/";
    }
    //member end

    //business
    @GetMapping("/buSignUpForm")
    public String buSignUpForm(Model model){
        model.addAttribute("buSignUpForm", new BuSignUpForm());
        return "/member/buSignUpForm";
    }

    @PostMapping("/buSignUpForm")
    public String buSignUpForm(@Valid BuSignUpForm buSignUpForm, Errors errors){
        if(errors.hasErrors()){
            return "/member/buSignUpForm";
        }
        businessService.createNewBusiness(buSignUpForm);
        return "redirect:/";
    }

    //business end





}































































