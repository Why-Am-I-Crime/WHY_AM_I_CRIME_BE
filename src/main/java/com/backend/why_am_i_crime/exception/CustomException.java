package com.backend.why_am_i_crime.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

// ErrorCode를 담을 class
@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException{
    ErrorCode errorCode;

//    public CustomException(String message) {
//        super(message);
//    }
}