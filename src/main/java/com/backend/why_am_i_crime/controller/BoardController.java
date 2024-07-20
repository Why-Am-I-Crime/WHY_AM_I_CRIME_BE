package com.backend.why_am_i_crime.controller;

import com.backend.why_am_i_crime.exception.NoSuchDataException;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/community")
public class BoardController {

    // api/community/{type}?page={pageNumber}
    @Operation(summary = "제보 게시글 조회", description = "커뮤니티 페이지에서 제보 게시글 목록 불러오기")
    @ExceptionHandler(NoSuchDataException.class)
    @GetMapping("{type}")
    public ResponseEntity<?> getAllReportBoard( @PathVariable(name = "type")Integer type, @RequestParam(name = "page") Integer pageNumber ){
        log.info("커뮤니티 페이지 제보 글 불러오기");

        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(pageNumber);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}
