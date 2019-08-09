package com.codeclan.Project.ComicClan.contollers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeclan.Project.ComicClan.repositories.ComicRepository;

@RestController
@RequestMapping("/comics")
public class ComicController {
    @Autowired
    ComicRepository comicRepository;


}
