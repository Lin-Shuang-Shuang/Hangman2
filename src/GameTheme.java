import java.util.Random;
public class GameTheme extends Theme{
    private String gameTitles;
    public String[] GameTitles = new String[]{
            "The Legend of Zelda: Breath of the Wild",
            "Halo Infinite",
            "Red Dead Redemption 2",
            "Cyberpunk 2077",
            "Fortnite",
            "Super Mario Odyssey",
            "Grand Theft Auto V",
            "Assassin's Creed Valhalla",
            "Call of Duty: Warzone",
            "Minecraft",
            "Overwatch",
            "Fall Guys: Ultimate Knockout",
            "PlayerUnknown's Battlegrounds",
            "Apex Legends",
            "Destiny 2"};



    public String getWord() {
        Random rand = new Random();
        return GameTitles[rand.nextInt(GameTitles.length-1)];
    }


}

