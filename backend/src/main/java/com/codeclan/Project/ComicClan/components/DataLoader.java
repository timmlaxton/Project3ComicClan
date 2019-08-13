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

    public DataLoader() {

    }

    public void run(ApplicationArguments args) throws Exception {


        Publisher publisher1 = new Publisher("Marvel", "/images/Images/Publisher/Marvel.jpg");
        publisherRepository.save(publisher1);

        Publisher publisher2 = new Publisher("DC", "/images/Images/Publisher/DCLogo.jpg");
        publisherRepository.save(publisher2);

        Publisher publisher3 = new Publisher("Image", "/images/Images/Publisher/ImageLogo.jpg");
        publisherRepository.save(publisher3);

        Publisher publisher4 = new Publisher("Darkhorse", "/images/Images/Publisher/DarkHorseLogo.jpg");
        publisherRepository.save(publisher4);

        Publisher publisher5 = new Publisher("Vertigo", "/images/Images/Publisher/VertigoLogo.jpg");
        publisherRepository.save(publisher5);

        Publisher publisher6 = new Publisher("Humanoids", "/images/Images/Publisher/HumanoidsLogo.jpg");
        publisherRepository.save(publisher6);
        
        Publisher publisher7 = new Publisher("Boom", "/images/Images/Publisher/BoomLogo.jpg");
        publisherRepository.save(publisher7);

        Publisher publisher8 = new Publisher("IDW", "/images/Images/Publisher/IDWLogo.jpg");
        publisherRepository.save(publisher8);

        Publisher publisher9 = new Publisher("Valiant", "/images/Images/Publisher/ValiantLogo.jpg");
        publisherRepository.save(publisher9);

        Publisher publisher10 = new Publisher("Fantagraphics", "/images/Images/Publisher/FantagraphicsLogo.jpg");
        publisherRepository.save(publisher10);

        Comic comic1 = new Comic(" X-men: House of X", "Jonathan Hickman", "Leinil Francis Yu", "Marte Gracia", "Clayton Cowels", publisher1, "Superhero", "/images/Images/Comics/X-men.jpg", "FACE THE FUTURE. Superstar writer Jonathan Hickman (SECRET WARS, AVENGERS, FANTASTIC FOUR) takes the reins of the X-Men universe! Since the release of Uncanny X-Men #1, there have been four seminal moments in the history of the X-Men. Giant-Sized X-Men. X-Men. Age of Apocalypse. New X-Men. Four iconic series that introduced a new era for Marvel’s mutants and revolutionized the X-Men. In House of X, Charles Xavier reveals his master plan for mutantkind…one that will bring mutants out of the shadow of mankind and into the light once more.");
        comicRepository.save(comic1);

        Persona persona1 = new Persona("Cyclops", "Scott summers", "Lazer Beams", "Comic", "/images/Images/Persona/Whyclops.jpg", "The first X-Man, Scott Summers possesses the mutant ability to draw ambient energy from another dimension through his eyes which are actually portals to the dimension, he usually channels this energy into concussive force blasts. He is visually distinctive for the ruby quartz visor he wears to control his devastating power. A born leader, Cyclops succeeded his mentor Professor X to command the X-Men.");
        personaRepository.save(persona1);
        User user1 = new User("Tim", "Comic Dude");
        userRepository.save(user1);
        user1.addComic(comic1);
        userRepository.save(user1);


        Comic comic2 = new Comic("Hard Boiled", "Frank Miller", "Geof Darrow", "Claude Legris", "John Workman", publisher4, "Sci-fi", "/images/Images/Comics/HardBoiled.jpg", "Carl Seltz is a suburban insurance investigator, a loving husband, and devoted father. Nixon is a berserk, homicidal tax collector racking up mind-boggling body counts in a diseased urban slaughterhouse. Unit Four is the ultimate robot killing machine and the last hope of the future's enslaved mechanical servants. And they're all the same psychotic entity.");
        comicRepository.save(comic2);

        Comic comic3 = new Comic("All Star Superman", "Grant Morrison", "Frank Quitely", "Jamie Grant", "Phil Balsman ", publisher2, "Superhero", "/images/Images/Comics/AllStarSuperman.jpg", "The Man of Steel goes toe-to-toe with Bizarro, his oddball twin, and the new character Zibarro, also from the Bizarro planet. And Superman faces the final revenge of Lex Luthor in the form of his own death! All-Star Superman is a spectacular reimagining of the Superman mythos, from the Man of Steel's origin to his greatest foes and beyond.");
        comicRepository.save(comic3);

        Comic comic4 = new Comic("Criminal", "Ed Brubaker", "Shaun Phillips", "Jacob Phillips", "Sean Phillips", publisher3, "Crime", "/images/Images/Comics/Criminal.jpg", "The series' story arcs are self-contained and focus on different characters, but these central characters inhabit the same world, grew up in fictional Center City, frequent the same bar, and share a common history of two generations of crime. With his partner Ivan, Tommy Patterson ran the city's most proficient crew of pickpockets and taught the trade to his eight-year-old son, Leo. When Tommy was arrested and imprisoned for the murder of Teeg Lawless, Ivan took care of Leo and explained to him how following certain rules can keep a criminal \"out in the world,\" out of both prison and the morgue.");
        comicRepository.save(comic4);

        Comic comic5 = new Comic("Gidon Falls", "Jeff Lamiere", "Andrea Sorrentino", "Dave Stewart", "Steve Wands", publisher3, "Horror", "/images/Images/Comics/GideonFalls.jpg", "A brand-new ongoing series from the acclaimed bestselling creative team of Old Man Logan and Green Arrow! The lives of a reclusive young man obsessed with a conspiracy in the city's trash, and a washed-up Catholic priest arriving in a small town full of dark secrets, become intertwined around the mysterious legend of The Black Barn, an otherworldly building that is alleged to have appeared in both the city and the small town, throughout history, bringing death and madness in its wake. Rural mystery and urban horror collide in this character-driven meditation on obsession, mental illness, and faith.");
        comicRepository.save(comic5);

        Comic comic6 = new Comic("V for Vendetta", "Alan Moore", "David Lloyd", "David Lloyd", "Jenny O’Connor", publisher5, "Political Thriller", "/images/Images/Comics/VforVendetta.jpg", "In a world without political freedom or personal freedom, and precious little faith in anything, comes a mysterious man in a white porcelain mask who fights political oppressors through terrorism and seemingly absurd acts. It's a gripping tale of the blurred lines between ideological good and evil.");
        comicRepository.save(comic6);

        Comic comic7 = new Comic("Sheriff of Babylon", "Tom King", "Leinil Francis Yu", "Marte Gracia", "Nick Napolitano", publisher5, "Superhero", "/images/Images/Comics/SheriffofBabylon.jpg", "Baghdad, 2003. The reign of Saddam Hussein is over. The Americans are in command. And no one is in control. Former cop turned military contractor Christopher Henry knows that better than anyone. He's in the country to train up a new Iraqi police force, and one of his recruits has just been murdered. With civil authority in tatters and dead bodies clogging the streets, Chris is the only person in the Green Zone with any interest in finding out who killed him-and why.");
        comicRepository.save(comic7);

        Comic comic8 = new Comic("Deadly Class", "Rick Remender", "Wes Craig", "Lee Loughridge", "Rus Wooton", publisher3, "Superhero", "/images/Images/Comics/DeadlyClass.jpg", "It's 1987. Marcus Lopez hates school. His grades suck. The jocks are hassling his friends. He can't focus in class. But the jocks are the children of Joseph Stalin's top assassin, the teachers are members of an ancient league of assassins, the class he's failing is \"Dismemberment 101,\" and his crush has a doubledigit body count. Welcome to the most brutal high school on earth, where the world's top crime families send the next generation of assassins to be trained. Murder is an art. Killing is a craft. At Kings Dominion School for the Deadly Arts, the dagger in your back isn't always metaphorical.");
        comicRepository.save(comic8);

        Comic comic9 = new Comic("Head Looper", "Andrew Maclean", "Andrew Maclean", "Jordie Bellaire", "Andrew Maclean", publisher3, "Fantasy", "/images/images/Comics/HeadLopper.jpg", "The Head Lopper, Norgal, and the nagging severed head of Agatha Blue Witch arrive on the Isle of Barra to find it overrun with beasts: minions of the Sorcerer of the Black Bog. When Queen Abigail hires Norgal and Agatha to slay the Sorcerer, our heroes trek across the island reliving the horrors of their heads—and playing right into the hands of a master manipulator. ");
        comicRepository.save(comic9);

        Comic comic10 = new Comic("Batman", "Scott Snyder", "Greg Capullo", "FCO Plascencia", "Richard Starkings", publisher2, "Superhero", "/images/Images/Comics/Batman.jpg", "After a series of brutal murders rocks Gotham City, Batman begins to realize that perhaps these crimes go far deeper than appearances suggest. As the Caped Crusader begins to unravel this deadly mystery, he discovers a conspiracy going back to his youth and beyond to the origins of the city he's sworn to protect. Could the Court of Owls, once thought to be nothing more than an urban legend, be behind the crime and corruption? Or is Bruce Wayne losing his grip on sanity and falling prey to the pressures of his war on crime?");
        comicRepository.save(comic10);

        Comic comic11 = new Comic("The Incal", "Alexandro Jordorowsky", "Moebius", "Dave Stewart", "Yves Chaland", publisher6, "Sci Fi", "/images/Images/Comics/Incal.jpg", "The Sci-Fi masterpiece by Moebius and Jodorowsky about the tribulations of the shabby detective John Difool as he searches for the precious and coveted Incal. John Difool, a low-class detective in a degenerate dystopian world, finds his life turned upside down when he discovers an ancient, mystical artifact called The Incal. Difool's adventures will bring him into conflict with the galaxy's greatest warrior, the Metabaron, and will pit him against the awesome powers of the Technopope. These encounters and many more make up a tale of comic and cosmic proportions that has Difool fighting for not only his very survival, but also the survival of the entire universe.");
        comicRepository.save(comic11);

        Comic comic12 = new Comic(" The Fix", "Nick Spencer", "Steve Lieber", "Ryan Hill", "Nick J Shaw", publisher3, "Crime Comedy", "/images/Images/Comics/Fix.jpg", "THE FIX is a story of the crooked cops, scheming mobsters, and corrupt politicians that run Los Angeles-and the sex toy that can bring them all down. Oh, and the hero is a drug-sniffing beagle named Pretzels");
        comicRepository.save(comic12);

        Comic comic13 = new Comic("Transmetropolitan", "Warren Ellis", "Darick Robertson", "Mitch Gerads", "Nathan Eyring", publisher5, "Sci Fi", "/images/Images/Comics/Transmetropolitan.jpg","In the near future, gonzo journalist/cult author Spider Jerusalem lives fast and loose in The City--a chaotic melting pot of cultures, subcultures, lifeforms, and technologies. Creators Warren Ellis and Darick Robertson deliver in this sharp, manic, anything-goes extrapolation of urban life.");
        comicRepository.save(comic13);

        Comic comic14 = new Comic("Sex Criminals", "Matt Fraction", "Chip Zdarsky", "Becka Kinzie", "Derek Jacobi", publisher5, "Crime Comedy", "/images/Images/Comics/SexCriminals.jpg", "Suzie's a normal girl with an extraordinary ability: when she has sex, she stops time. One night she meets John... who has the same gift. And so they do what any other sex-having, time-stopping, couple would do: they rob banks. In the vein of THE 40-YEAR OLD VIRGIN and BRIDESMAIDS, Image Comics invites you to come along with MATT FRACTION (Hawkeye, SATELLITE SAM) and CHIP ZDARSKY (Prison Funnies, Monster Cops) for the series that puts the \"comic\" back in \"comics\" and the \"sexy\" back in \"sex crimes.\"");
        comicRepository.save(comic14);

        Comic comic15 = new Comic("The Immortal Hulk", "Al Ewing", "Joe Bennett", "Paul Mounts", "Cory Petit", publisher1, "Superhero", "/images/Images/Comics/ImmortalHulk.jpg", "Horror has a name. You’d never notice the man. He doesn’t like to be noticed. He’s quiet. Calm. If someone were to shoot him in the head…all he’d do is die. Until night falls — and someone else gets up again. The man’s name is Banner. The horror is the Immortal Hulk! And trouble has a way of following them both. As reporter Jackie McGee tries to put together the pieces, Banner treads a lonely path from town to town, finding murder, mystery and tragedy as he goes. And what Banner finds, the Hulk smashes! Elsewhere, the hero called Sasquatch can’t help but feel involved. In many ways, he’s Banner’s equal — and his opposite. Sasquatch is about to risk his life by looking for the man — and finding the monster!");
        comicRepository.save(comic15);

        Comic comic16 = new Comic("Bone Parish", "Cullen Bunn", "Alex Guimaraes", "Rod Reis", "Ed Dukeshire", publisher7, "Horror", "/images/Images/Comics/BoneParish.jpg", "A new drug is sweeping through the streets of New Orleans—one made from the ashes of the dead. Wars are being fought over who will control the supply, and the demand is rising. While the various criminal factions collide, users begin to experience terrifying visions of the dead coming back to life...through them. Eisner Award-nominated author Cullen Bunn (Harrow County, The Empty Man) and illustrator Jonas Scharf team up for Bone Parish, a haunting blend of horror and crime that takes an unflinching look at how we connect to—and disconnect from—the world around us.");
        comicRepository.save(comic16);

        Comic comic17 = new Comic("Usagi Yojimbo", "Stan Sakai", "Stan Sakai", "Tom Luth", "Stan Sakai", publisher8, "Fantasy", "/images/Images/Comics/Usagi.jpg", "Usagi Yojimbo is set in a unique world. Based in 17th century Japan, it features Miyamoto Usagi who is a skilled swordsrabbit, and follows his many exciting adventures traversing this unique world. Yojimbo is the Japanese word for \"bodyguard\" as Miyamoto Usagi was the personal bodyguard for a Japanese War Lord. Usagi is now a \"Ronin\" wandering swordsrabbit. Honing his skills, saving villages, and oftentimes stumbling into delicate affairs of national/political significance! It's quite clear that someone is writing his explosive life story.");
        comicRepository.save(comic17);

        Comic comic18 = new Comic("Locke and Key", "Joe Hill", "Gabriel Rodriguez", "Jay Fotos", "Robbie Robbins", publisher9, "Fantasy", "/images/Images/Comics/Locke.jpg", "Locke & Key tells of Keyhouse, an unlikely New England mansion, with fantastic doors that transform all who dare to walk through them, and home to a hate-filled and relentless creature that will not rest until it forces open the most terrible door of them all!" );
        comicRepository.save(comic18);

        Comic comic19 = new Comic("Love and Rockets", "Jaimie Hernandez", "Gilbert Hernandez", "Mario Hernandez", "Jaimie Hernandez", publisher10, "Alternative", "/images/Images/Comics/Loveandrockets.jpg", "Love and Rockets (often abbreviated L&R) is a comic book series by the Hernandez brothers: Gilbert, Jaime, and Mario. It was one of the first comic books in the alternative comics movement of the 1980s. The Hernandez brothers produced stories in the series independently of each other. Gilbert and Jaime produced the majority of the material, and tended to focus on particular casts of characters and settings. Those of Gilbert usually focused on a cast of characters in the fictional Central American village of Palomar; the stories often featured magic realist elements. The Locas stories of Jaime centered on a social group in Los Angeles, particularly the Latin-American friends and sometimes-lovers Maggie and Hopey.");
        comicRepository.save(comic19);

        Comic comic20 = new Comic("Akira", "Katsuhiro Otomo", "Katsuhiro Otomo ", "Steve Oliff", "Katsuhiro Otomo", publisher4, "Sci-Fi", "/images/Images/Comics/Akira.jpg", "In 1988 the Japanese government drops an atomic bomb on Tokyo after ESP experiments on children go awry. In 2019, 31 years after the nuking of the city, Kaneda, a bike gang leader, tries to save his friend Tetsuo from a secret government project. He battles anti-government activists, greedy politicians, irresponsible scientists and a powerful military leader until Tetsuo's supernatural powers suddenly manifest. A final battle is fought in Tokyo Olympiad exposing the experiment's secrets.");
        comicRepository.save(comic20);


        Date date1 = new Date(2019, 8, 10, 10, 40);
        Review review1 = new Review(date1, "This comic is awesome!", 3, comic1, user1);
        reviewRepository.save(review1);

        Date date2 = new Date(2019, 8, 11, 10, 05);
        Review review2 = new Review(date2, "Seriously, read this comic!", 1, comic1, user1);
        reviewRepository.save(review2);




        Persona persona2 = new Persona("Superman", "Clark Kent", "Superhuman", "Action Comics #1", "/images/Images/Persona/Juperman.jpg", "Rocketed to Earth as an infant from the doomed planet Krypton, Kal-El was adopted by the loving Kent family and raised in America's heartland as Clark Kent. Using his immense solar-fueled powers, he became Superman to defend mankind against all manner of threats while championing truth, justice and the American way!");
        personaRepository.save(persona2);

        Persona persona3 = new Persona("Incredible Hulk", "Bruce Banner", "Mental Rage", "The Incredible Hulk #1", "/images/Images/Persona/Sulk.jpg","After being bombarded with a massive dose of gamma radiation while saving a young man's life during the testing of an experimental bomb, Dr. Robert Bruce Banner was transformed into the Incredible Hulk: a green behemoth who is the living personification of rage and pure physical strength." );
        personaRepository.save(persona3);

        Persona persona4 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Matban.jpg", "Scott Lang was a thief who became Ant-Man after stealing the Ant-Man suit to save his daughter Cassandra  Lang from a heart condition.[5] Reforming from his life of crime, Lang soon took on a full-time career as Ant-Man with the encouragement of Hank Pym.[6] He became an affiliate of the Fantastic Four,[7] and later became a full-time member of the Avengers." );
        personaRepository.save(persona4);

        Persona persona5 = new Persona("Ant-Man", "Scott Lang", "Teeny Tiny", "The Avengers #181", "/images/Images/Persona/Anty.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona5);

        Persona persona6 = new Persona("Bullseye", "Benjamin Dex Poindexter", "Handy at throwing things", "DareDevil #131", "/images/Images/Persona/Bullseye.jpg", "Bullseye first achieved notoriety with a series of extortion attempts and murder in New York City, publicizing his antics by agreeing to an interview with the Daily Bugle[10]. Bullseye fought and defeated Daredevil, although the hero soon tracked him down and prevented Bullseye's extortion schemes. Bullseye was then hired to murder the lawyer Matt Murdock, Daredevil's secret identity, but was defeated by Daredevil. In his own mind, Bullseye believed his formidable reputation was ruined and swore vengeance. Bullseye fought Daredevil at any opportunity, holding a TV studio hostage, kidnapping the Black Widow,[13] or simply tracking him down. Each time, he was captured and given over to the police by Daredevil. At one point, Bullseye was declared insane due to a brain tumor and began hallucinating, believing random people were actually Daredevil, and trying to kill them all. The true Daredevil managed to defeat him, and the tumor was removed." );
        personaRepository.save(persona6);

        Persona persona7 = new Persona("CatWoman", "Selina Kyle", "Picks Pockets", "Batman #1", "/images/Images/Persona/Catwoman.jpg", "Catwoman is a fictional character created by Bill Finger and Bob Kane who appears in American comic books published by DC Comics, commonly in association with superhero Batman. The character made her debut as \"the Cat\" in Batman #1 (Spring 1940), and her real name is Selina Kyle. She is Batman's most enduring love interest and is known for her complex love-hate relationship with him." );
        personaRepository.save(persona7);

        Persona persona8 = new Persona("DareDevil", "Matt Murdoch", "Canny see", "DareDevil #1", "/images/Images/Persona/DareDevil.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona8);

        Persona persona9 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/DrOctopus.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona9);

        Persona persona10 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/DrStrange.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona10);

        Persona persona11 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Elektra.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona11);

        Persona persona12 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/MistyKnight.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona12);

        Persona persona13 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/MistyKnight.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona13);

        Persona persona14 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Spiderman.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona14);

        Persona persona15 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Thor.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona15);

        Persona persona16 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Vulture.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona16);

        Persona persona17 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/WonderWoman.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona17);

        Persona persona18 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Matban.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona18);

        Persona persona19 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Matban.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona19);

        Persona persona20 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Matban.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona20);

        Persona persona21 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Matban.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona21);







    }

}
