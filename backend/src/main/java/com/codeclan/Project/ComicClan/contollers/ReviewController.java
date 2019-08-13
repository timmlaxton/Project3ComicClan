package com.codeclan.Project.ComicClan.contollers;

import com.codeclan.Project.ComicClan.models.Review;
import com.codeclan.Project.ComicClan.repositories.reviews.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("reviews")
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping
    public List<Review> getAllReviews(){ return reviewRepository.findAll();}

}
