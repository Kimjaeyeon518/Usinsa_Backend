package com.spring.usinsa.service;

import com.spring.usinsa.model.VerificationCode;

public interface VerificationCodeService {

    VerificationCode findByCode(String code);
    VerificationCode createCode(Long userId);
    VerificationCode verifyCode(String code);
    boolean existsByCode(String code);
    void delete(VerificationCode verificationCode);
}
