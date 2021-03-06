package com.spring.usinsa.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.usinsa.dto.TokenDto;
import com.spring.usinsa.dto.oauth2.GoogleProfile;
import com.spring.usinsa.dto.oauth2.KakaoProfile;
import com.spring.usinsa.dto.oauth2.KakaoTokenDto;
import com.spring.usinsa.dto.oauth2.NaverProfile;
import com.spring.usinsa.model.Social;
import org.springframework.http.ResponseEntity;

public interface OAuthService {

    TokenDto oauthLogin(String email, Social social, String socialId);
    void guideSocial(String email);

    KakaoProfile getKakaoProfile(String accessToken);
    KakaoTokenDto getKakaoTokenInfo(String code);

    NaverProfile getNaverProfile(String accessToken);
    ResponseEntity<Object> getGoogleLoginForm();
//    String getGoogleIdToken(String code);
    GoogleProfile getGoogleProfile(String idToken) throws JsonProcessingException;
    Object checkProfile(Social social, String socialId, String email, Object object);
}
