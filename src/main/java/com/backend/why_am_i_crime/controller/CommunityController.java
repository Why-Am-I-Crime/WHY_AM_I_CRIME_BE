package com.backend.why_am_i_crime.controller;

import com.backend.why_am_i_crime.exception.CustomException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Tag(name = "Community-Controller", description = "커뮤니티 페이지 컨트롤러")
@RestController
@RequestMapping("/api/community")
public class CommunityController {

    // api/community?type={type}&location={location}
    @Operation(summary = "동네 검색 후 커뮤니티 조회", description = "커뮤니티페이지에서 원하는 동네 검색 후 조회")
    @GetMapping()
    public ResponseEntity<?> getCommunityByTypeAndLocation( @RequestParam(name = "type") Integer type, @RequestParam(name = "location") String location ) {
        log.info("동네 검색 후 커뮤니티 조회, type: " + type + ", location: " + location);

        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(HttpStatus.ACCEPTED);
        } catch (CustomException | IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}
