import java.util.Random;

public class MovieTheme extends Theme{

    public String[] movieTitles = new String[]{
            "The Shawshank Redemption",
            "The Godfather",
            "The Godfather: Part II",
            "The Dark Knight",
            "12 Angry Men",
            "Schindler's List",
            "The Lord of the Rings: The Return of the King",
            "Pulp Fiction",
            "The Good, the Bad and the Ugly",
            "Forrest Gump",
            "The Lord of the Rings: The Fellowship of the Ring",
            "Star Wars: Episode V - The Empire Strikes Back",
            "Inception",
            "The Lord of the Rings: The Two Towers",
            "The Matrix",
            "Goodfellas",
            "One Flew Over the Cuckoo's Nest",
            "Se7en",
            "The Silence of the Lambs",
            "It's a Wonderful Life",
            "Life is Beautiful",
            "Saving Private Ryan",
            "The Green Mile",
            "Interstellar",
            "The Usual Suspects",
            "Léon: The Professional",
            "The Lion King",
            "Gladiator",
            "American Beauty",
            "Terminator 2: Judgment Day",
            "The Prestige",
            "Fight Club",
            "Back to the Future",
            "The Departed",
            "Raiders of the Lost Ark",
            "The Pianist",
            "City of God",
            "The Intouchables",
            "Whiplash",
            "The Sting",
            "Amélie",
            "The Shining",
            "Alien",
            "Jurassic Park",
            "Blade Runner",
            "Aliens",
            "A Clockwork Orange",
            "2001: A Space Odyssey",
            "E.T. the Extra-Terrestrial",
            "Apocalypse Now",
            "Full Metal Jacket",
            "The Great Dictator",
            "Modern Times",
            "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb",
            "The Exorcist",
            "The Texas Chain Saw Massacre",
            "Halloween",
            "The Thing",
            "Jaws",
            "Psycho",
            "The Birds",
            "The Terminator",
            "Die Hard",
            "Heat",
            "The Big Lebowski",
            "The Grand Budapest Hotel",
            "Memento",
            "The Sixth Sense",
            "American History X",
            "No Country for Old Men",
            "There Will Be Blood",
            "The Master",
            "Boyhood",
            "Moonlight",
            "La La Land",
            "Birdman or (The Unexpected Virtue of Ignorance)",
            "The Artist",
            "The Revenant",
            "Spotlight",
            "Argo",
            "The Hurt Locker",
            "Crash",
            "Glory",
            "A Beautiful Mind",
            "The King's Speech",
            "The Social Network",
            "Gravity",
            "The Martian",
            "Mad Max: Fury Road",
            "Get Out",
            "Dunkirk",
            "Black Panther",
            "The Shape of Water",
            "The Irishman",
            "Joker"
    };


    // @Override
    public String getWord() {
        Random random = new Random();
        return movieTitles[random.nextInt(movieTitles.length-1)];
    }

}
