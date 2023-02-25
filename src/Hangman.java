import java.util.ArrayList;
import java.util.Random;

public class Hangman {
    private static int numIncorrectGuesses;
    private static String word;
    Random rand = new Random();
    private Theme[] themes = new Theme[]{
            new MovieTheme(),
            new GameTheme()
    };

    public Hangman() {
        numIncorrectGuesses = 0;
    }

    public void printHangman(int numIncorrectGuesses) {
        switch (numIncorrectGuesses) {
            case 0:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=======");
                break;
            case 1:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=======");
                break;
            case 2:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|   | ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=======");
                break;
            case 3:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|  /| ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=======");
                break;
            case 4:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|  /|\\");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=======");
                break;
            case 5:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|  /|\\");
                System.out.println("|  /  ");
                System.out.println("|     ");
                System.out.println("=======");
                break;
            case 6:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O ");
                System.out.println("|  /|\\");
                System.out.println("|  / \\");
                System.out.println("|     ");
                System.out.println("=======");
                break;
            default:
                System.out.println("Invalid number of incorrect guesses");
                break;
        }
    }

    public String printWords(String currentPhrase, String guessedLetter) {
        String temp = this.word;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == guessedLetter.charAt(0)) {
                arr.add(i);
            }
        }
        if (arr.size() != 0) {
            StringBuilder sb = new StringBuilder(currentPhrase);
            for (int i = 0; i < arr.size(); i++) {
                if (currentPhrase.charAt(arr.get(i)) == guessedLetter.charAt(0)) {
                    System.out.println("You have already guessed this letter");
                    break;
                } else if (currentPhrase.charAt(arr.get(i)) == '_') {
                    sb.setCharAt(arr.get(i), guessedLetter.charAt(0));

                }
            }

            return sb.toString();
        } else {
            System.out.println("Sorry, there are no " + guessedLetter + "'s");
            return currentPhrase;
        }


    }

    public Theme getTheme(int index) {
        return themes[index];
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumIncorrectGuesses() {
        return numIncorrectGuesses;
    }

    public void incrementNumIncorrectGuesses() {
        numIncorrectGuesses++;
    }


}
