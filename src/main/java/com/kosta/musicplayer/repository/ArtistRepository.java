package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    List<Artist> findByName(@Param("name") String name);
    //@Query("SELECT a from Artist a WHERE a.name = :name")
    //List<Artist> findmmmmmm(String name);
    //@Query(value = "dldkdkd", nativeQuery = true)
}
