package com.heyhong.HeyHong.config;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public enum ErrorCode {

    UsernameOrPasswordNotFoundException (400, "아이디 또는 비밀번호가 일치하지 않습니다.", HttpStatus.BAD_REQUEST),
    ForbiddenException(403, "해당 요청에 대한 권한이 없습니다.", HttpStatus.FORBIDDEN),
    UNAUTHORIZEDException (401, "로그인 후 이용가능합니다.", HttpStatus.UNAUTHORIZED),
    MalformedJwtException(443, "잘못된 토큰의 형식입니다.", HttpStatus.UNAUTHORIZED),
    ExpiredJwtException(444, "기존 토큰이 만료되었습니다. /app/auth/refreshToken 에서 새로운 토큰을 발급 받으십시오.", HttpStatus.UNAUTHORIZED),
    EtcTokenError(445, "토큰 오류입니다.", HttpStatus.UNAUTHORIZED),
    ReLogin(445, "모든 토큰이 만료되었습니다. 다시 로그인해주세요.", HttpStatus.UNAUTHORIZED),

    ;

    @Getter
    private int code;

    @Getter
    private String message;

    @Getter
    private HttpStatus status;

    ErrorCode(int code, String message, HttpStatus status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
}
