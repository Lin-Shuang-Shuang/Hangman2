import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hangman h = new Hangman();
        System.out.print("Choose (from 0 to 1) a theme: 0 for Movie, 1 for Games. ");
        Scanner sc = new Scanner(System.in);

        int theme = sc.nextInt();
        String word = h.getTheme(theme).getWord();
        String currentGuessWord = word.replaceAll("[a-zA-Z]", "_");
        h.setWord(word);
        System.out.println("The word is: " + currentGuessWord);
        System.out.println("The hangman currently looks like this: ");
        h.printHangman(h.getNumIncorrectGuesses());
        System.out.println("Guess a letter: ");
        String guess = sc.next();
        while (h.getNumIncorrectGuesses() < 5) {
            if (word.contains(guess)) {
                System.out.println("Correct!");
                currentGuessWord = h.printWords(currentGuessWord, guess);
                System.out.println("The word is: " + currentGuessWord);
                if (currentGuessWord.equals(word)) {
                    System.out.println("You win!");
                    break;
                }
            } else {
                System.out.println("Incorrect!");
                h.incrementNumIncorrectGuesses();
                System.out.println("The hangman currently looks like this: ");
                h.printHangman(h.getNumIncorrectGuesses());
                System.out.println("The word is: " + currentGuessWord);
            }
            System.out.println("Guess a letter: ");
            guess = sc.next();
        }
        if (h.getNumIncorrectGuesses() == 5) {
            h.printHangman(5);
            System.out.println("Your hangman has died! You lose!");
            System.out.println("The word was: " + word);
        } else {
            System.out.println("You win!");
        }


    }
}