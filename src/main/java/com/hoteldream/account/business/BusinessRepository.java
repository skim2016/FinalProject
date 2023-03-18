package com.hoteldream.account.business;

import com.hoteldream.domain.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface BusinessRepository extends JpaRepository<Business, String> {
    boolean existsByBuEmail(String email);

    boolean existsByBuPhoneNumber(String phoneNumber);
}
