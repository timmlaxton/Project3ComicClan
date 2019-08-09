package components;

import com.codeclan.Project.ComicClan.models.Comic;
import com.codeclan.Project.ComicClan.models.Persona;
import com.codeclan.Project.ComicClan.models.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.codeclan.Project.ComicClan.repositories.ComicRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ComicRepository comicRepository;

//    @Autowired
//    CharacterRepository characterRepository;
//
//    @Autowired
//    PublisherRepository publisherRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception{

        Publisher publisher1 = new Publisher("Marvel");

        Comic comic1 = new Comic("Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero");
        comicRepository.save(comic1);
    }
}
