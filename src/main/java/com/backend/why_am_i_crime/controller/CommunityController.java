package com.backend.why_am_i_crime.controller;

import com.backend.why_am_i_crime.exception.NoSuchDataException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Tag(name = "CommunityController", description = "커뮤니티 페이지 컨트롤러")
@RestController
@RequestMapping("/api/community")
public class CommunityController {

    // api/community?type={type}&location={location}
    @Operation(summary = "동네 검색 후 커뮤니티 조회", description = "커뮤니티페이지에서 원하는 동네 검색 후 조회")
    @ExceptionHandler(NoSuchDataException.class)
    @GetMapping()
    public ResponseEntity<?> getCommunityByTypeAndLocation( @RequestParam(name = "type") Integer type, @RequestParam(name = "location") String location ){
        log.info("동네 검색 후 커뮤니티 조회, type: "+type+", location: "+location);

        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report?page={pageNumber}
    @Operation(summary = "제보 게시글 목록", description = "커뮤니티 페이지에서 제보 게시글 목록 불러오기")
    @ExceptionHandler(NoSuchDataException.class)
    @GetMapping("/report")
    public ResponseEntity<?> getAllReportBoard( @RequestParam(name = "page") Integer pageNumber ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/{boardId}
    @Operation(summary = "제보 게시글 조회", description = "커뮤니티 페이지에서 제보 게시글 조회하기")
    @ExceptionHandler(NoSuchDataException.class)
    @GetMapping("/report/board/{boardId}")
    public ResponseEntity<?> getReportBoard( @PathVariable(name = "boardId") Long boardId ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board
    @Operation(summary = "제보 게시글 등록", description = "커뮤니티 페이지에서 제보 게시글 등록하기")
    @ExceptionHandler(NoSuchDataException.class)
    @PostMapping("/report/board")
    public ResponseEntity<?> postReportBoard( /*@RequestBody*/ ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board
    @Operation(summary = "제보 게시글 수정", description = "커뮤니티 페이지에서 제보 게시글 수정하기")
    @ExceptionHandler(NoSuchDataException.class)
    @PutMapping("/report/board")
    public ResponseEntity<?> editReportBoard( /*@RequestBody*/ ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/{boardId}
    @Operation(summary = "제보 게시글 삭제", description = "커뮤니티 페이지에서 제보 게시글 삭제하기")
    @ExceptionHandler(NoSuchDataException.class)
    @DeleteMapping("/report/board/{boardId}")
    public ResponseEntity<?> deleteReportBoard( @PathVariable(name="boardId") Long boardId){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/comment
    @Operation(summary = "제보 게시글 댓글 등록", description = "커뮤니티 페이지에서 제보 게시글에 댓글 달기")
    @ExceptionHandler(NoSuchDataException.class)
    @PostMapping("/report/board/comment")
    public ResponseEntity<?> postReportBoardComment( /*@RequestBody*/ ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/report/board/{boardId}
    @Operation(summary = "제보 게시글 좋아요", description = "커뮤니티 페이지에서 제보 게시글 좋아요 누르기")
    @ExceptionHandler(NoSuchDataException.class)
    @PostMapping("/report/board/like/{boardId}")
    public ResponseEntity<?> likeReportBoard( @PathVariable(name="boardId") Long boardId){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/free?page={pageNumber}
    @Operation(summary = "자유게시판 게시글 목록", description = "커뮤니티 페이지에서 자유게시판 게시글 목록 불러오기")
    @ExceptionHandler(NoSuchDataException.class)
    @GetMapping("/free")
    public ResponseEntity<?> getAllFreeBoard( @RequestParam(name = "page") Integer pageNumber ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    // api/community/safe?page={pageNumber}
    @Operation(summary = "안전귀가동행인 게시글 목록", description = "커뮤니티 페이지에서 안전귀가동행인 게시글 목록 불러오기")
    @ExceptionHandler(NoSuchDataException.class)
    @GetMapping("/safe")
    public ResponseEntity<?> getAllSafeBoard( @RequestParam(name = "page") Integer pageNumber ){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        }
        catch (NoSuchDataException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}
