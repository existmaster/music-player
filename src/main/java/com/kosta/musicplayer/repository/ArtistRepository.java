package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
