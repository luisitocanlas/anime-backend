package com.luisitocanlas.animes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/anime")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> getAllAnime() {
        return new ResponseEntity<List<Anime>>(animeService.allAnime(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Anime>> getSingleAnime(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Anime>>(animeService.singleAnime(imdbId), HttpStatus.OK);
    }
}