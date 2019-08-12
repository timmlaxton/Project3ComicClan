package com.codeclan.Project.ComicClan;

import com.codeclan.Project.ComicClan.models.*;
import com.codeclan.Project.ComicClan.repositories.comics.ComicRepository;
import com.codeclan.Project.ComicClan.repositories.personas.PersonaRepository;
import com.codeclan.Project.ComicClan.repositories.publishers.PublisherRepository;
import com.codeclan.Project.ComicClan.repositories.reviews.ReviewRepository;
import com.codeclan.Project.ComicClan.repositories.users.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

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
		Publisher publisher1 = new Publisher("Marvel", "");
		publisherRepository.save(publisher1);
		Comic comic1 = new Comic(" X-men: House of X", "Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero", "/images/Images/Comics/X-men.jpg", "FACE THE FUTURE. Superstar writer Jonathan Hickman (SECRET WARS, AVENGERS, FANTASTIC FOUR) takes the reins of the X-Men universe! Since the release of Uncanny X-Men #1, there have been four seminal moments in the history of the X-Men. Giant-Sized X-Men. X-Men. Age of Apocalypse. New X-Men. Four iconic series that introduced a new era for Marvel’s mutants and revolutionized the X-Men. In House of X, Charles Xavier reveals his master plan for mutantkind…one that will bring mutants out of the shadow of mankind and into the light once more.");
		comicRepository.save(comic1);
		Persona persona1 = new Persona("Cyclops", "Scott summers", "Lazer Beams", "Comic", "/images/Images/Persona/cyclops.jpg", "The first X-Man, Scott Summers possesses the mutant ability to draw ambient energy from another dimension through his eyes which are actually portals to the dimension, he usually channels this energy into concussive force blasts. He is visually distinctive for the ruby quartz visor he wears to control his devastating power. A born leader, Cyclops succeeded his mentor Professor X to command the X-Men.");
		personaRepository.save(persona1);
	}

	@Test
	public void canAddUser(){
		 User user1 = new User("Jordan", "Just Jordan");
		 userRepository.save(user1);
	}

	@Test
	public void canAddReview(){
		Publisher publisher1 = new Publisher("Marvel", "");
		publisherRepository.save(publisher1);
		User user1 = new User("Jordan", "Just Jordan");
		userRepository.save(user1);
		Comic comic1 = new Comic(" X-men: House of X", "Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero", "/images/Images/Comics/X-men.jpg", "FACE THE FUTURE. Superstar writer Jonathan Hickman (SECRET WARS, AVENGERS, FANTASTIC FOUR) takes the reins of the X-Men universe! Since the release of Uncanny X-Men #1, there have been four seminal moments in the history of the X-Men. Giant-Sized X-Men. X-Men. Age of Apocalypse. New X-Men. Four iconic series that introduced a new era for Marvel’s mutants and revolutionized the X-Men. In House of X, Charles Xavier reveals his master plan for mutantkind…one that will bring mutants out of the shadow of mankind and into the light once more.");
		comicRepository.save(comic1);
		Date date = new Date(2019, 05, 19, 06, 22);
		Review review1 = new Review(date,"This is an awesome comic!", 4, comic1, user1);
		reviewRepository.save(review1);

	}

	@Test
	public void canCalculateAvgAmount(){
		Publisher publisher1 = new Publisher("Marvel", "");
		publisherRepository.save(publisher1);
		User user1 = new User("Jordan", "Just Jordan");
		userRepository.save(user1);
		Comic comic1 = new Comic(" X-men: House of X", "Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero", "/images/Images/Comics/X-men.jpg", "FACE THE FUTURE. Superstar writer Jonathan Hickman (SECRET WARS, AVENGERS, FANTASTIC FOUR) takes the reins of the X-Men universe! Since the release of Uncanny X-Men #1, there have been four seminal moments in the history of the X-Men. Giant-Sized X-Men. X-Men. Age of Apocalypse. New X-Men. Four iconic series that introduced a new era for Marvel’s mutants and revolutionized the X-Men. In House of X, Charles Xavier reveals his master plan for mutantkind…one that will bring mutants out of the shadow of mankind and into the light once more.");
		comicRepository.save(comic1);
		Date date = new Date(2019, 05, 19, 06, 22);
		Review review1 = new Review(date, "This comic is awful...", 3, comic1, user1);
		reviewRepository.save(review1);
		Review review2 = new Review(date, "Meh.", 4, comic1, user1);
		reviewRepository.save(review2);
		assertEquals(3.50, comic1.getRating(), 0.01);
	}

}



