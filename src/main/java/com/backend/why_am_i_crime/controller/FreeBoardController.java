package com.backend.why_am_i_crime.controller;

import com.backend.why_am_i_crime.exception.CustomException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Tag(name = "Free-Board-Controller", description = "커뮤니티 페이지 - 자유 게시판 컨트롤러")
@RestController
@RequestMapping("/api/community/free")
public class FreeBoardController {

    // api/community/free?page={pageNumber}
    @Operation(summary = "자유게시판 게시글 목록", description = "커뮤니티 페이지에서 자유게시판 게시글 목록 불러오기")
    @GetMapping()
    public ResponseEntity<?> getAllFreeBoard(@RequestParam(name = "page") Integer pageNumber ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}
