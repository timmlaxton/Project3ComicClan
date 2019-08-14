package com.codeclan.Project.ComicClan.projections;

import com.codeclan.Project.ComicClan.models.Comic;
import com.codeclan.Project.ComicClan.models.Persona;
import com.codeclan.Project.ComicClan.models.Publisher;
import com.codeclan.Project.ComicClan.models.Review;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedComics", types = Comic.class)
public interface EmbedComics {
    long getId();
    String getTitle();
    String getDescription();
    String getImage();
    String getWriter();
    String getArtist();
    String getLetterer();
    String getColourer();
    String getGenre();
    Publisher getPublisher();
    List<Persona> getPersonas();
    List<Review> getReviews();
    double getRating();
    int getReviewsAmount();
    void getAverageRating();
}
