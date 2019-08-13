package com.codeclan.Project.ComicClan.contollers;


import com.codeclan.Project.ComicClan.models.Persona;
import com.codeclan.Project.ComicClan.repositories.personas.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("characters")
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping
    public List<Persona> getAllPersonas(){
        return personaRepository.findAll();
    }
}
