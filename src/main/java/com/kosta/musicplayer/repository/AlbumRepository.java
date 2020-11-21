package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
