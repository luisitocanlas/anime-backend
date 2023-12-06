package com.luisitocanlas.animes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    public List<Anime> allAnime() {
        return animeRepository.findAll();
    }

    public Optional<Anime> singleAnime(String imdbId) {
        return animeRepository.findAnimeByImdbId(imdbId);
    }
}