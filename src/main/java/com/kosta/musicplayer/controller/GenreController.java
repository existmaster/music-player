package com.kosta.musicplayer.controller;

import com.kosta.musicplayer.domain.Genre;
import com.kosta.musicplayer.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenreController {

    @Autowired
    private GenreRepository gr;

    @GetMapping
    public List<Genre> getGenre(){
        //DB에서 아티스트 정보를 받아와야 함
        //1. DB에 접속
        //2. 정보를 받아야 함
        return gr.findAll();
    }

    @GetMapping("/{id}")
    public Genre getGenre(@PathVariable long id){
        return gr.findById(id).get();
    }

    @PostMapping
    public Genre postArtist(@RequestBody Genre g){
        return gr.save(g);
    }

    @PutMapping("/{id}")
    public Genre updateArtist(@PathVariable("id") long id, @RequestBody Genre g){
        Genre result_genre = gr.findById(id).get();
        result_genre.setName(g.getName());
        return gr.save(result_genre);
    }
    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable("id") long id){
        gr.deleteById(id);
    }
}
