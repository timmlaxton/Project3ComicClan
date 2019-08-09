package com.codeclan.Project.ComicClan.contollers;


import com.codeclan.Project.ComicClan.repositories.personas.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personae")
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;
}
