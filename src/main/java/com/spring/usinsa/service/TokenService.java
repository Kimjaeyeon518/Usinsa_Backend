package com.spring.usinsa.service;


import com.spring.usinsa.dto.TokenDto;
import com.spring.usinsa.dto.TokenRequestDto;
import com.spring.usinsa.dto.UserLoginRequestDto;
import com.spring.usinsa.model.User;

public interface TokenService {
    TokenDto login(UserLoginRequestDto userLoginRequestDto);
    TokenDto refresh(TokenRequestDto tokenRequestDto);
    TokenDto saveToken(User user);
    TokenRequestDto setTokenRequestDto(String accessToken, String refreshToken);
}
