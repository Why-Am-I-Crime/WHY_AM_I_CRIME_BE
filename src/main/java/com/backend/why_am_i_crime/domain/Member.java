// Member.java
package com.backend.why_am_i_crime.domain;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name="member")
public class Member extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @Column(nullable = false, unique = true)
    private String loginId;

    @Column(nullable = false)
    private String password;

    private String name;

    @Column(columnDefinition = "json")
    private String profileImage;

    @Builder
    public Member(Location location, String loginId, String password, String name) {
        this.location = location;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
    }
}
