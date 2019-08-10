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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        Publisher publisher1 = new Publisher("Marvel", "../Images/Publisher/Marvel Logo.jpg");
        publisherRepository.save(publisher1);

        Publisher publisher2 = new Publisher("DC");
        publisherRepository.save(publisher2);

        Publisher publisher3 = new Publisher("Image");
        publisherRepository.save(publisher3);

        Publisher publisher4 = new Publisher("Darkhorse");
        publisherRepository.save(publisher4);

        Publisher publisher5 = new Publisher("Vertigo");
        publisherRepository.save(publisher5);

        Publisher publisher6 = new Publisher("Humanoids");
        publisherRepository.save(publisher6);

        Publisher publisher7 = new Publisher("Boom");
        publisherRepository.save(publisher7);

        Publisher publisher8 = new Publisher("IDW");
        publisherRepository.save(publisher8);

        Publisher publisher9 = new Publisher("Valiant");
        publisherRepository.save(publisher9);

        Publisher publisher10 = new Publisher("Fantagraphics");
        publisherRepository.save(publisher10);

        Comic comic1 = new Comic("Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero", "../Images/Comics/X-men.jpg");
        comicRepository.save(comic1);
<<<<<<< HEAD
        Persona persona1 = new Persona("Cyclops", "Scott summers", "Lazer Beams", "Comic", "../Images/Persona/Scott Summers.jpg");
        personaRepository.save(persona1);
        User user1 = new User("Tim", "Comic Dude");
        userRepository.save(user1);
        user1.addComic(comic1);
        userRepository.save(user1);
<<<<<<< HEAD
        Date date1 = new Date(2019, 8, 10, 10, 40);
        Review review1 = new Review(date1, 3, comic1, user1);
        reviewRepository.save(review1);
    }
=======
        comic1.addUser(user1);
        comicRepository.save(comic1);
=======

        Comic comic2 = new Comic("Hard Boiled", "Frank Miller", "Geof Darrow", "Claude Legris", "John Workman", publisher4, "Sci-fi", );
        comicRepository.save(comic2);

        Comic comic3 = new Comic("All Star Superman", "Grant Morrison", "Frank Quitely", "Jamie Grant", "Phil Balsman ", publisher2, "Superhero");
        comicRepository.save(comic3);

        Comic comic4 = new Comic("Criminal", "Ed Brubaker", "Shaun Phillips", "Jacob Phillips", "Sean Phillips", publisher3, "Crime");
        comicRepository.save(comic4);

        Comic comic5 = new Comic("Gidon Falls", "Jeff Lamiere", "Andrea Sorrentino", "Dave Stewart", "Steve Wands", publisher3, "Horror");
        comicRepository.save(comic5);

        Comic comic6 = new Comic("V for Vendetta", "Alan Moore", "David Lloyd", "David Lloyd", "Jenny O’Connor", publisher5, "Political Thriller");
        comicRepository.save(comic6);

        Comic comic7 = new Comic("Sheriff of Babylon", "Tom King", "Leinil Francis Yu", "Marte Gracia", "Nick Napolitano", publisher5, "Superhero");
        comicRepository.save(comic7);

        Comic comic8 = new Comic("Deadly Class", "Rick Remender", "Wes Craig", "Lee Loughridge", "Rus Wooton", publisher3, "Superhero");
        comicRepository.save(comic8);

        Comic comic9 = new Comic("Head Looper", "Andrew Maclean", "Andrew Maclean", "Jordie Bellaire", "Andrew Maclean", publisher3, "Fantasy");
        comicRepository.save(comic9);

        Comic comic10 = new Comic("Bataman", "Scott Snyder", "Greg Capullo", "FCO Plascencia", "Richard Starkings", publisher2, "Superhero");
        comicRepository.save(comic10);

        Comic comic11 = new Comic("The Incal", "Alexandro Jordorowsky", "Moebius", "Dave Stewart", "Yves Chaland", publisher6, "Sci Fi");
        comicRepository.save(comic11);

        Comic comic12 = new Comic(" The Fix", "Nick Spencer", "Steve Lieber", "Ryan Hill", "Nick J Shaw", publisher3, "Crime Comedy");
        comicRepository.save(comic12);

        Comic comic13 = new Comic("Transmapolitan", "Warren Ellis", "Darick Robertson", "Mitch Gerads", "Nathan Eyring", publisher5, "Sci Fi");
        comicRepository.save(comic13);

        Comic comic14 = new Comic("Sex Criminals", "Matt Fraction", "Chip Zdarsky", "Becka Kinzie", "Derek Jacobi", publisher5, "Crime Comedy");
        comicRepository.save(comic14);

        Comic comic15 = new Comic("The Immortal Hulk", "Al Ewing", "Joe Bennett", "Paul Mounts", "Cory Petit", publisher1, "Superhero");
        comicRepository.save(comic15);

        Comic comic15 = new Comic("Bone Parish", "Culle Bunn", "Jonsa Scharf", "Rod Reis", "Ed Dukeshire", publisher7, "Superhero");
        comicRepository.save(comic15);

        Comic comic16 = new Comic("Stan Sakai", "Stan Sakai", "Tom Luth", "Stan Sakai", publisher8, "Fantasy");
        comicRepository.save(comic16);

        Comic comic17 = new Comic("Usagi Yojimbo", "Gabriel Rodriguez", "Jay Fotos", "Robbie Robbins", publisher9, "Horror");
        comicRepository.save(comic17);

        Comic comic18 = new Comic("Love and Rockets", "Jaimie Hernandez", "Gilbert Hernandez", "Mario Hernandez", "Jaimie Hernandez", publisher10, "Alternative");
        comicRepository.save(comic18);


        Persona persona1 = new Persona("Superman", "Clark Kent", "Superhuman", "Action Comics #1");
        personaRepository.save(persona11);

        Persona persona2 = new Persona("Incredible Hulk", "Bruce Banner", "Mental Rage", "The Incredible Hulk #1");
        personaRepository.save(persona11);

        Persona persona3 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1");
        personaRepository.save(persona11);


>>>>>>> develop


}
