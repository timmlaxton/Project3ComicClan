package com.codeclan.Project.ComicClan;

import com.codeclan.Project.ComicClan.models.Comic;
import com.codeclan.Project.ComicClan.models.Persona;
import com.codeclan.Project.ComicClan.models.Publisher;
import com.codeclan.Project.ComicClan.models.User;
import com.codeclan.Project.ComicClan.repositories.comics.ComicRepository;
import com.codeclan.Project.ComicClan.repositories.personas.PersonaRepository;
import com.codeclan.Project.ComicClan.repositories.publishers.PublisherRepository;
import com.codeclan.Project.ComicClan.repositories.users.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComicClanApplicationTests {

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

//	@Test
//	public void contextLoads() {
//	}

//	@Test
//	public void canAddComic(){
//		Comic comic1 = new Comic("Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", "Superhero");
//		comicRepository.save(comic1);
//	}

//	@Test
//	public void canAddPersona(){
//		Persona persona1 = new Persona("DareDevil", "Matt Murdoch", "Blind");
//		personaRepository.save(persona1);
//	}

//	@Test
//	public void canAddPublisher(){
//		Publisher publisher1 = new Publisher("Marvel");
//		publisherRepository.save(publisher1);
//	}

	@Test
	public void createComicAndCharacter(){
		Publisher publisher1 = new Publisher("Marvel");
		publisherRepository.save(publisher1);
		Comic comic1 = new Comic("Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero");
		comicRepository.save(comic1);
		Persona persona1 = new Persona("DareDevil", "Matt Murdoch", "Blind", "Comic");
		personaRepository.save(persona1);
	}

	@Test
	public void canAddUser(){
		 User user1 = new User("Jordan", "Just Jordan");
		 userRepository.save(user1);
	}

	@Test
	public void canAddReview(){
		User user1 = new User("Jordan", "Just Jordan");
		userRepository.save(user1);
		Comic comic1 = new Comic("Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero");
		comicRepository.save(comic1);
		Review review1 = new Review(user1, comic1, 4);
		reviewRepository.save(review1);
	}

	}



