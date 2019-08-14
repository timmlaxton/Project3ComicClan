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

        Comic comic12 = new Comic("The Fix", "Nick Spencer", "Steve Lieber", "Ryan Hill", "Nick J Shaw", publisher3, "Crime Comedy", "/images/Images/Comics/Fix.jpg", "THE FIX is a story of the crooked cops, scheming mobsters, and corrupt politicians that run Los Angeles-and the sex toy that can bring them all down. Oh, and the hero is a drug-sniffing beagle named Pretzels");
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

        Comic comic21 = new Comic("X-Men #1", "Stan Lee", "Jack Kirby ", "Jack Kirby", "Stan Lee", publisher1, "Superhero", "/images/Images/Comics/CFA.jpg", "The master of magnetism has taken over a missile base, and only the strangest teens of all time stand between him and victory! It's the X-Men's first day of class, and Magneto wants to make it a memorable one - and their last!");
        comicRepository.save(comic21);

        Comic comic22 = new Comic("Action Comic #1", "Jerry Siegel", "Joe Shuster ", "Todd Evans", "Jerry Siegel", publisher2, "Superhero", "/images/Images/Comics/SFA.jpg", "Faster than a speeding bullet. More powerful than a locomotive. Able to leap tall buildings in a single bound! The Man of Steel burst into the comic book world with a bang, kicking off the golden era of superheroes, paving the way for the hundreds if not thousands of super-powered heroes who have come since. As a distant planet takes its final breath, a scientist places his infant son into a space ship sending it to the planet Earth! Crash landing in rural Kansas, the boy is found by Jonathan and Martha Kent, where the couple take in the boy as their own. Unbeknownst to them the boy will one day grow up to be Earth's mightiest champion, Superman!");
        comicRepository.save(comic22);

        Comic comic23 = new Comic("The Incredible Hulk #1", "Stan Lee", "Steve Ditko ", "Wayne Jenson", "Stan Lee", publisher1, "Superhero", "/images/Images/Comics/HFA.jpg", "Witness the birth of the Jade Giant! The Hulk is the strangest man alive. Is he man or monster...or both? Scientist Bruce Banner saves a young boy from being killed by a nuclear blast but absorbs deadly amounts of gamma radiation which transforms him into a monster dubbed the Hulk. Bruce Banner is scientist by day, but transforms into the Hulk once the sun goes down.");
        comicRepository.save(comic23);

        Comic comic24 = new Comic("Detective Comic #27", "Bill Finger", "Bob Kane ", "Bob Kane", "Bob Kane", publisher2, "Superhero", "/images/Images/Comics/BFA.jpg", "Commissioner Gordon learns that a chemical industrialist named Lambert has just been murdered. It appears as if Lambert's son is guilty of the crime, but he confesses only to finding his father's body. A young friend of Gordon,Bruce Wayne is present at the crime scene and decides to investigate as Batman.");
        comicRepository.save(comic24);

        Comic comic25 = new Comic("Tales to Astonish #35", "Larry Lieber", "Jack Kirby", "Stan Goldberg", "Stan Lee", publisher1, "Superhero", "/images/Images/Comics/AFA.jpg", "Doctor Henry Pym is a scientist who had invented two incredible serums, one to reduce objects, and the other to enlarge them back to their natural size. The reducing potion proved more powerful than he anticipated. It reduced him to the size of an insect and led him to the most frightening encounter of his life within a teeming ant hill. Frantically, Pym escaped from the ants and reached his enlarging serum. After he was restored to normal size, Pym destroyed his serums, which he felt were too dangerous to exist on Earth. However, weeks later he decided that such a great discovery should not melt into nothingness and concocted his serums again, this time locking them safely away in his safe.");
        comicRepository.save(comic25);

        Comic comic26 = new Comic("Daredevil #131", "Marv Wolfman", "Bob Brown", "Michele Wolfman", "Joe Rosen", publisher2, "Superhero", "/images/Images/Comics/BEFA.jpg", "Matt is called upon to investigate a slumlord, who turns out to be Heather's father (or at least his company.) He gets sidetracked, however, when an assassin with impeccable aim and a desire for publicity kills a man as an example before drawing Daredevil into a very public fight.");
        comicRepository.save(comic26);

        Comic comic27 = new Comic("CatWoman", "Bill Finger", "Bob Kane ", "Sheldon Molodoff", "Sheldon Molodoff", publisher4, "Superhero", "/images/Images/Comics/CWFA.jpg", "Batman and Robin encounter a female jewel thief known only as The Cat. They stop her from stealing an emerald necklace, but the smitten Batman allows her escape.");
        comicRepository.save(comic27);

        Comic comic28 = new Comic("Daredevil #1", "Stan Lee", "Bill Everett", "Steve Ditko", "Sam Rosen", publisher1, "Superhero", "/images/Images/Comics/DDFA.jpg", "One night at Fogwell's gym, a number of the bruisers that work there are enjoying a game of cards, when they're interrupted by the arrival of Daredevil, who has come looking for their boss, the Fixer. Fighting them, Daredevil reflects back to his past, and the events that led to his becoming this new costumed hero:");
        comicRepository.save(comic28);

        Comic comic29 = new Comic("The Amazing Spider-Man #3", "Steve Ditko", "Steve Ditko ", "Steve Ditko", "John Duffy", publisher1, "Superhero", "/images/Images/Comics/DROCT.jpg", "Spider-Man catches Charlie and his two pals robbing a warehouse. Surprising them with his Spider Signal light, he quickly overcomes them and webs them up for the police. Meanwhile, atomic scientist Otto Octavius, known to his colleagues as Doctor Octopus because of the unique set of four remote-controlled arms he invented for handling radioactive material, is hard at work at the U.S. Atomic Research Center. Suddenly his experiment goes awry. In the ensuing explosion, Otto Octavius's mechanical arms fuse to his body, and the excess radiation alters his brain. When he awakens at Bliss Private Hospital, he discovers that he can make his mechanical arms move by thought alone, just as if they were his real arms. With his brain unbalanced, Dr. Octopus forcibly takes over the hospital as his first criminal act.");
        comicRepository.save(comic29);

        Comic comic30 = new Comic("Strange Tales #110", "Robert Bernstein", "Steve Ditko", "Steve Ditko", "John Duffy", publisher1, "Superhero", "/images/Images/Comics/DRStrange.jpg", "Dr. Stephen Strange was once a gifted but egotistical surgeon who sought out the Ancient One to heal his hands after they were wounded in a car accident. Instead, the Ancient One trained him to become Master of the Mystic Arts and the Sorcerer Supreme of Earth.");
        comicRepository.save(comic30);

        Comic comic31 = new Comic("Daredevil #168", "Frank Miller", "Frank Miller ", "Laura Martin", "Joe Rosen", publisher1, "Superhero", "/images/Images/Comics/EFA.jpg", "On a dark rainy night in Hell's Kitchen, Daredevil searches for a thief named Arlarich Wallenquist. This thief witnessed a murder and can clear another man falsely accused of it. Daredevil seeks to bring Wallenquist into court. Wallenquist paid for protection from Eric Slaughter. As Daredevil descends from a street light he finds Turk, dressed as a blind man. Turks seeing eye dog named Brutus attacks Daredevil. Daredevil quickly dispatches and takes the dog out. It's not long before Turk is about to break and divulge the information when Daredevils radar sense warns him of someone circling him. A man dressed as a wino suddenly throws a bottle of nitroglycerin which Daredevil eludes before it explodes. The wino, who is really an employee of Slaughter's, flees from the scene to only have an injured Daredevil block his escape route. ");
        comicRepository.save(comic31);

        Comic comic32 = new Comic( "Marvel Premiere #20" , "Tony Isabella", "Arvell Jones", "Gil Kane", "Tony Isobella", publisher1, "Superhero", "/images/Images/Comics/MNA.jpg", "Iron Fist finds himself (again), under the attack of the Cult of Kara-Kai. Will Fist ever be able to clear his name with Joy Meachum? Uncle Ward Meachum calls in a big gun to eliminate Iron Fist…Batroc the Leaper! Plus, what does Lee Wing have that the Ninja wants for himself?");
        comicRepository.save(comic32);

        Comic comic33 = new Comic("Amazing Fantasy #15" , "Stan Lee", "Steve Ditko", "Steve Ditko", "Joe Rosen", publisher1, "Superhero", "/images/Images/Comics/SMFA.jpg", "Peter Parker is bitten by a radioactive spider and gains the abilities of a spider. When he fails to stop a burglar who runs past him, his uncle is killed as a result. He therefore swears never to shirk his responsibility again.");
        comicRepository.save(comic33);

        Comic comic34 = new Comic("Journey into Mystery #83", "Larry Lieber", "Jack Kirby", "Jack Kirby", "Stan Lee", publisher1, "Superhero", "/images/Images/Comics/Thor.jpg", "Introducing...the Mighty Thor! The most exciting super hero of all time! When the Stone-Men from Saturn invade Earth, only the lame Dr. Donald Blake can stop them -- but he stands no chance, not until he strikes a wooden stick on the ground and finds himself transformed into Thor, God of Thunder! Watch as Thor learns how to wield his hammer in battle! Only this new hero can save the Earth from being conquered!");
        comicRepository.save(comic34);

        Comic comic35 = new Comic( "The Amazing Spider-Man #2", "Stan Lee", "Steve Ditko", "Steve Oliff", "Stan Lee", publisher1, "Superhero", "/images/Images/Comics/VFA.jpg", "The Vulture's rampage in Manhattan begins. Can Spidey take down the avian menace?");
        comicRepository.save(comic35);

        Comic comic36 = new Comic("Sensation Comics#1", "Harry G Peter", "Jon L Blummer ", "Jenson Myers", "Nevel Jenkins", publisher2, "Superhero", "/images/Images/Comics/WWFA.jpg", "Wonder Woman was introduced in All Star Comics #8 (December 1941), during the era known to comics historians as the Golden Age of Comic Books. Following this debut, she was featured in Sensation Comics #1 (January 1942), and six months later appeared in her own comic book series (Summer 1942).[3][2] Wonder Woman took her place beside the extant superheroines or antiheroes Fantomah, Black Widow, Invisible Scarlet O'Neil, and Canada's Nelvana of the Northern Lights.");
        comicRepository.save(comic36);



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

        Persona persona4 = new Persona("Batman", "Bruce Wayne", "Hunners of money", "Warrior #1", "/images/Images/Persona/Matban.jpg", "Bruce Wayne, who witnessed the murder of his billionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman." );
        personaRepository.save(persona4);

        Persona persona5 = new Persona("Ant-Man", "Scott Lang", "Teeny Tiny", "The Avengers #181", "/images/Images/Persona/Anty.jpg", "Scott Lang was a thief who became Ant-Man after stealing the Ant-Man suit to save his daughter Cassandra  Lang from a heart condition.Reforming from his life of crime, Lang soon took on a full-time career as Ant-Man with the encouragement of Hank Pym.[6] He became an affiliate of the Fantastic Four,[7] and later became a full-time member of the Avengers" );
        personaRepository.save(persona5);

        Persona persona6 = new Persona("Bullseye", "Benjamin Dex Poindexter", "Handy at throwing things", "DareDevil #131", "/images/Images/Persona/Bullseye.jpg", "Bullseye first achieved notoriety with a series of extortion attempts and murder in New York City, publicizing his antics by agreeing to an interview with the Daily Bugle. Bullseye fought and defeated Daredevil, although the hero soon tracked him down and prevented Bullseye's extortion schemes. Bullseye was then hired to murder the lawyer Matt Murdock, Daredevil's secret identity, but was defeated by Daredevil." );
        personaRepository.save(persona6);

        Persona persona7 = new Persona("CatWoman", "Selina Kyle", "Picks Pockets", "Batman #1", "/images/Images/Persona/Catwoman.jpg", "Catwoman is a fictional character created by Bill Finger and Bob Kane who appears in American comic books published by DC Comics, commonly in association with superhero Batman. The character made her debut as the Cat in Batman #1 (Spring 1940), and her real name is Selina Kyle. She is Batman's most enduring love interest and is known for her complex love-hate relationship with him." );
        personaRepository.save(persona7);

        Persona persona8 = new Persona("DareDevil", "Matt Murdoch", "Canny see", "DareDevil #1", "/images/Images/Persona/DareDevil.jpg", "Daredevil is a fictional superhero appearing in American comic books published by Marvel Comics. Daredevil was created by writer-editor Stan Lee and artist Bill Everett, with an unspecified amount of input from Jack Kirby." );
        personaRepository.save(persona8);

        Persona persona9 = new Persona("Dr Octopus", "Otto Gunther Octavius", "Eight Arms and really clever", "The Amazing Spider-Man #3", "/images/Images/Persona/DrOctopus.jpg", "Born in Schenectady, New York, Otto Octavius had a turbulent upbringing. His father Torbert Octavius, a factory worker, was abusive and violent towards both Otto and his mother Mary Octavius. Young Otto's shyness and good work in school got him labeled as a teacher's pet and targeted as a subject for bullying.");
        personaRepository.save(persona9);

        Persona persona10 = new Persona("Dr Strange", "Dr Steven Strange", "Really mystical", "Warrior #1", "/images/Images/Persona/DrStrange.jpg", "A Master of the Mystic Arts, Doctor Strange has phenomenally powerful magical abilities that enable him to skillfully conjure myriad spells. Strange has been able to use his spells to bind opponents and create complex shields and barriers, among many other uses for both defense and attack. Strange is also adept at astral projection, sending his astral self away from his body and allowing him to observe events without the knowledge of those present.");
        personaRepository.save(persona10);

        Persona persona11 = new Persona("Elektra", "Elektra Natchios", "Handy with tools", " Daredevil #168", "/images/Images/Persona/Elektra.jpg", "Elektra is a highly trained assassin of Greek descent who wields a pair of sai as her trademark weapons. Elektra is one of Frank Miller's best-known creations, but subsequent writers' use of her is controversial as Marvel had originally promised to refrain from reviving the character without Miller's permission. She has also appeared as a supporting character of the X-Men's Wolverine and in other series and mini-series, as well as adaptations for the screen." );
        personaRepository.save(persona11);

        Persona persona12 = new Persona("Misty Knight", "Mercedes Knight", "Hard as nails",  "Marvel Premiere #20", "/images/Images/Persona/MistyKnight.jpg", "Knight is a former NYPD police officer, whose arm was amputated following a bomb attack. After receiving a bionic prosthetic from Tony Stark, she started a private-investigation agency with close friend, Colleen Wing. The two would later form the crime-fighting duo Daughters of the Dragon. As private investigators, Knight and Wing frequently work with Heroes for Hire: Luke Cage and Iron Fist. In 2013, Knight became co-leader of the Valkyrior with Valkyrie in Fearless Defenders #1 by Cullen Bunn and Will Sliney." );
        personaRepository.save(persona12);

        Persona persona13 = new Persona("Spiderman", "Peter Parker", "Spider Sense", "Amazing Fantasy #15", "/images/Images/Persona/Spiderman.jpg", "A bite from a spider somehow granted teenager Peter Parker its arachnid abilities and instead of using them for personal gain, he decided to help others with them. An orphan living with his aunt, May Parker, the boy chose to wear a mask while fighting crime so as not to burden her with his actions. Calling himself Spider-Man and sporting a pair of web-shooting devices he’d constructed, Parker wound up in internet videos which attracted the attention of Tony Stark. The billionaire industrialist deduced Spider-Man’s secret identity and approached Parker at his and May’s home in Queens, New York with a request for aid from the hero in an upcoming confrontation with Captain America and a group of other rogue Avengers and associates. Parker was initially hesitant to even admit his secret career as Spider-Man, but the thrill of adventure and Stark’s talk of responsibility drew him in and he accepted the invitation, as well as a new, high-tech costume and web-shooters." );
        personaRepository.save(persona13);

        Persona persona14 = new Persona("Thor", "Thor Odinson", "Handy with a hammer",  "Journey into Mystery #83", "/images/Images/Persona/Thor.jpg", "Thor is the Asgardian God of Thunder, and the son of the All-Father of Asgard Odin and the Elder Earth-Goddess Gaea. Combining the powers of Asgard and Midgard (Earth), Thor is arguably the greatest defender of both worlds. Armed with his enchanted Uru hammer Mjolnir, which can only be lifted by those who are worthy, Thor is the mightiest warrior in all of Asgard. A staunch ally for good and one of the strongest beings on Earth, Thor is also a founding member of the Avengers." );
        personaRepository.save(persona14);

        Persona persona15 = new Persona("Vulture", "Adrian Toomes", "Flying", "The Amazing Spider-Man #2", "/images/Images/Persona/Vulture.jpg", "Adrian Toomes was born in Staten Island, New York. He is a former electronics engineer who was once the business partner of Gregory Bestman; Bestman handled the finances whilst Toomes handled the inventions. One day, after creating a flight harness, Toomes eagerly rushed into Bestman's office to share the happy news. However, Bestman was not there, and Toomes discovered that Bestman had secretly been embezzling funds and that Toomes had no legal recourse, meaning he lost his job. Enraged, Toomes wrecked the business, discovering that the harness also granted him superhuman strength. He then decided to turn to crime professionally as the Vulture." );
        personaRepository.save(persona15);

        Persona persona16 = new Persona("Wonder Woman", "Diana Prince", "Hunners of money", " All Star Comics #8", "/images/Images/Persona/WonderWoman.jpg", "Wonder Woman's origin story relates that she was sculpted from clay by her mother Queen Hippolyta and was given a life to live as an Amazon, along with superhuman powers as gifts by the Greek gods. In recent years, DC changed her background with the retcon that she is the daughter of Zeus and Hippolyta, jointly raised by her mother and her aunts Antiope and Menalippe. The character has changed in depiction over the decades, including briefly losing her powers entirely in the late 1960s; by the 1980s, artist George Perez gave her an atheltic look and emphasized her Amazonian heritage.[11][12] She possesses an arsenal of advanced technology, including the Lasso of Truth, a pair of indestructible bracelets, a tiara which serves as a projectile, and, in older stories, a range of devices based on Amazon technology." );
        personaRepository.save(persona16);









    }

}
