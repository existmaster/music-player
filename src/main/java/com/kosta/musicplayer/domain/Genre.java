package com.kosta.musicplayer.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    private long id;
    private String name;
}
