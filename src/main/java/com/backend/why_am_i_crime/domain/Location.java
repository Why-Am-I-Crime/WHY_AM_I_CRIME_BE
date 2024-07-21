package com.backend.why_am_i_crime.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="location")
public class Location extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String locationName;

    @OneToMany(mappedBy = "location")
    private List<Member> members;

    @OneToMany(mappedBy = "location")
    private List<News> news;

}
