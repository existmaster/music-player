package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track,Long> {
}
