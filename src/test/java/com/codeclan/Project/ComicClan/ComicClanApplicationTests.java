package com.codeclan.Project.ComicClan;

import com.codeclan.Project.ComicClan.models.Comic;
import com.codeclan.Project.ComicClan.repositories.ComicRepository;
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

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddComic(){
		Comic comic1 = new Comic("Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", "Superhero");
		comicRepository.save(comic1);
	}



}
