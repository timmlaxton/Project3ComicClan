package com.codeclan.Project.ComicClan.contollers;

import com.codeclan.Project.ComicClan.repositories.publishers.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    PublisherRepository publisherRepository;

}
