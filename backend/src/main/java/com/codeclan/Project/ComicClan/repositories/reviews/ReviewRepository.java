package com.codeclan.Project.ComicClan.repositories.reviews;

import com.codeclan.Project.ComicClan.models.Review;
import com.codeclan.Project.ComicClan.projections.EmbedReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedReviews.class)
public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
}
