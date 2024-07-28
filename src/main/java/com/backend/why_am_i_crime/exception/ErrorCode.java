package com.backend.why_am_i_crime.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

// 사용할 ErrorCode를 정의
@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "USER_NOT_FOUND", "사용자를 찾을 수 없습니다."),
    INVALID_CREDENTIALS(HttpStatus.UNAUTHORIZED, "INVALID_CREDENTIALS", "아이디 또는 비밀번호가 일치하지 않습니다."),
    LOGIN_ID_ALREADY_EXISTS(HttpStatus.CONFLICT, "LOGIN_ID_ALREADY_EXISTS", "중복된 아이디입니다."),
    PASSWORD_MISMATCH(HttpStatus.BAD_REQUEST, "PASSWORD_MISMATCH", "비밀번호와 비밀번호 확인의 값이 일치하지 않습니다."),
    EMAIL_ALREADY_EXISTS(HttpStatus.CONFLICT, "EMAIL_ALREADY_EXISTS", "중복된 이메일입니다.");

    private final HttpStatus httpStatus; // HTTP 상태 코드
    private final String error;          // 오류 코드
    private final String message;        // 오류 설명 메시지
}