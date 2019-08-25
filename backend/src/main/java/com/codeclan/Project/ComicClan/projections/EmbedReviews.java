package com.codeclan.Project.ComicClan.projections;

import com.codeclan.Project.ComicClan.models.Comic;
import com.codeclan.Project.ComicClan.models.Review;
import com.codeclan.Project.ComicClan.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name= "embedReviews", types = Review.class)
public interface EmbedReviews {
    Long getId();
    String getReview();
    Date getDate();
    Comic getComic();
    double getRating();
    User getUser();
}