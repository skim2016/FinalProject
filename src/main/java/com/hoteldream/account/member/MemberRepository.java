package com.hoteldream.account.member;

import com.hoteldream.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface MemberRepository extends JpaRepository<Member, String> {
    boolean existsByMeEmail(String email);

    boolean existsByMePhoneNumber(String phoneNumber);
}
