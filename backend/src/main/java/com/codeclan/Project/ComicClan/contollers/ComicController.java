package com.codeclan.Project.ComicClan.contollers;


import com.codeclan.Project.ComicClan.models.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeclan.Project.ComicClan.repositories.comics.ComicRepository;

import java.util.List;

@RestController
@RequestMapping("api/comics")
public class ComicController {
    @Autowired
    ComicRepository comicRepository;

    @GetMapping
    public List<Comic> getAllPersonas(){
        return comicRepository.findAll();
    }
}
