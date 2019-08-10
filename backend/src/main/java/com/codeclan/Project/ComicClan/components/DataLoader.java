package com.codeclan.Project.ComicClan.components;


import com.codeclan.Project.ComicClan.models.Comic;
import com.codeclan.Project.ComicClan.models.Persona;
import com.codeclan.Project.ComicClan.models.Publisher;
import com.codeclan.Project.ComicClan.models.User;
import com.codeclan.Project.ComicClan.repositories.personas.PersonaRepository;
import com.codeclan.Project.ComicClan.repositories.publishers.PublisherRepository;
import com.codeclan.Project.ComicClan.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.codeclan.Project.ComicClan.repositories.comics.ComicRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ComicRepository comicRepository;

    @Autowired
    PersonaRepository personaRepository;

    @Autowired
    PublisherRepository publisherRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception{

        Publisher publisher1 = new Publisher("Marvel");
        publisherRepository.save(publisher1);
        Comic comic1 = new Comic("Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero");
        comicRepository.save(comic1);
        Persona persona1 = new Persona("DareDevil", "Matt Murdoch", "Blind", "Comic");
        personaRepository.save(persona1);
        User user1 = new User("Tim", "Comic Dude");
        userRepository.save(user1);
        user1.addComic(comic1);
        userRepository.save(user1);
    }


}
