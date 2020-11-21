package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TrackRepository extends JpaRepository<Track,Long> {
}
