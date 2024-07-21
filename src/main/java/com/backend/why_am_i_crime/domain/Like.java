package com.backend.why_am_i_crime.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="like")
public class Like extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @JoinColumn(name = "board_id", nullable = false)
    private Board board;
}
