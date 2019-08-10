package com.codeclan.Project.ComicClan.components;


import com.codeclan.Project.ComicClan.models.*;
import com.codeclan.Project.ComicClan.repositories.personas.PersonaRepository;
import com.codeclan.Project.ComicClan.repositories.publishers.PublisherRepository;
import com.codeclan.Project.ComicClan.repositories.reviews.ReviewRepository;
import com.codeclan.Project.ComicClan.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.codeclan.Project.ComicClan.repositories.comics.ComicRepository;

import java.util.Date;

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

    @Autowired
    ReviewRepository reviewRepository;

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
        comic1.addUser(user1);
        comicRepository.save(comic1);
        Date date1 = new Date(2019, 8, 10, 10, 40);
        Review review1 = new Review(date1, 3, comic1, user1);
        reviewRepository.save(review1);
    }


}
