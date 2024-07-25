package com.backend.why_am_i_crime.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;

@Data
@Builder
public class ErrorResponseEntity {
    private int status;    // HTTP 상태 코드
 //   private String error;  // 오류 코드
    private String message; // 오류 설명 메시지

    public static ResponseEntity<ErrorResponseEntity> toResponseEntity(ErrorCode e) {
        return ResponseEntity
                .status(e.getHttpStatus())
                .body(ErrorResponseEntity.builder()
                        .status(e.getHttpStatus().value()) // HTTP 상태 코드 값
//                        .error(e.getError())              // 오류 코드
                        .message(e.getMessage())          // 오류 설명 메시지
                        .build());
    }
}