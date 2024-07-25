package com.backend.why_am_i_crime.domain;

import jakarta.persistence.*;

@Entity
public class Crime extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
