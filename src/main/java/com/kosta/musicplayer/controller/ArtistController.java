package com.kosta.musicplayer.controller;

import com.kosta.musicplayer.domain.Artist;
import com.kosta.musicplayer.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private ArtistRepository ar;

    @GetMapping
    public List<Artist> getArtists(){
        //DB에서 아티스트 정보를 받아와야 함
        //1. DB에 접속
        //2. 정보를 받아야 함
        return ar.findAll();
    }

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable long id){
        return ar.findById(id).get();
    }

    @PostMapping
    public Artist postArtist(@RequestBody Artist artist){
        return ar.save(artist);
    }

    @PutMapping("/{id}")
    public Artist updateArtist(@PathVariable("id") long id, @RequestBody Artist artist){
        Artist result_artist = ar.findById(id).get();
        result_artist.setName(artist.getName());
        return ar.save(result_artist);
    }
    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable("id") long id){
        ar.deleteById(id);
    }
}
