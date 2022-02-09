package com.spring.usinsa.dto.oauth2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class KakaoTokenDto {

    // 토큰
    private String token_type;      // 토큰 타입, bearer로 고정
    private String access_token;    // 사용자 액세스 토큰 값
    private Integer expires_in;     // 액세스 토큰 만료 시간(초)
    private String refresh_token;   // 사용자 리프레시 토큰 값
    private Integer refresh_token_expires_in;  // 리프레시 토큰 만료 시간(초)
    private String scope;       // 인증된 사용자의 정보 조회 권한 범위 범위가 여러 개일 경우, 공백으로 구분
}
