package com.backend.why_am_i_crime.controller;

import com.backend.why_am_i_crime.exception.CustomException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Tag(name = "Report-Board-Controller", description = "커뮤니티 페이지 - 제보 게시판 컨트롤러")
@RestController
@RequestMapping("/api/community/report")
public class ReportBoardController {

    // api/community/report?page={pageNumber}
    @Operation(summary = "제보 게시글 목록", description = "커뮤니티 페이지에서 제보 게시글 목록 불러오기")
    @GetMapping()
    public ResponseEntity<?> getAllReportBoard(@RequestParam(name = "page") Integer pageNumber ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/{boardId}
    @Operation(summary = "제보 게시글 조회", description = "커뮤니티 페이지에서 제보 게시글 조회하기")
    @GetMapping("/board/{boardId}")
    public ResponseEntity<?> getReportBoard( @PathVariable(name = "boardId") Long boardId ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board
    @Operation(summary = "제보 게시글 등록", description = "커뮤니티 페이지에서 제보 게시글 등록하기")
    @PostMapping("/board")
    public ResponseEntity<?> postReportBoard( /*@RequestBody*/ ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board
    @Operation(summary = "제보 게시글 수정", description = "커뮤니티 페이지에서 제보 게시글 수정하기")
    @PutMapping("/board")
    public ResponseEntity<?> editReportBoard( /*@RequestBody*/ ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/{boardId}
    @Operation(summary = "제보 게시글 삭제", description = "커뮤니티 페이지에서 제보 게시글 삭제하기")
    @DeleteMapping("//board/{boardId}")
    public ResponseEntity<?> deleteReportBoard( @PathVariable(name="boardId") Long boardId){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/comment
    @Operation(summary = "제보 게시글 댓글 등록", description = "커뮤니티 페이지에서 제보 게시글에 댓글 달기")
    @PostMapping("//board/comment")
    public ResponseEntity<?> postReportBoardComment( /*@RequestBody*/ ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/like/{boardId}
    @Operation(summary = "제보 게시글 좋아요", description = "커뮤니티 페이지에서 제보 게시글 좋아요 누르기")
    @PostMapping("//board/like/{boardId}")
    public ResponseEntity<?> likeReportBoard( @PathVariable(name="boardId") Long boardId){
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
