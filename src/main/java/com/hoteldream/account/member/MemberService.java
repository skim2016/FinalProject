package com.hoteldream.account.member;

import com.hoteldream.account.form.MeSignUpForm;
import com.hoteldream.domain.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member createNewMember(MeSignUpForm meSignUpForm){
        Member member = Member.builder()
                .meEmail(meSignUpForm.getEmail())
                .mePassword(meSignUpForm.getPassword())
                .meName(meSignUpForm.getName())
                .mePhoneNumber(meSignUpForm.getPhoneNumber())
                .build();
        return memberRepository.save(member);
    }

}
