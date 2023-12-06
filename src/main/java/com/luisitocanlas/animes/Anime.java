package com.luisitocanlas.animes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
import java.util.Map;

@Document(collection = "animes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Anime {
    @Id
    private ObjectId id;
    private String imdbId;
    private String type;
    private String name;
    private String poster;
    private String trailerLink;
    private List<String> backdrop;
    private List<String> genres;
    private List<String> tags;
    private Map<String, String> description;

    @DocumentReference
    private List<Review> reviewIds;
}