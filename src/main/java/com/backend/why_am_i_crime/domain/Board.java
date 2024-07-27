package com.backend.why_am_i_crime.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name="board")
@AllArgsConstructor
@Builder
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @Column(nullable = false)
    private int type;

    @Column(nullable = false)
    private String reportTitle;

    @Column(nullable = false)
    private String reportContent;

    @Column(columnDefinition = "json")
    private String reportImage;

    @Column(nullable = false)
    private int hit = 0;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Like> likes;
}
