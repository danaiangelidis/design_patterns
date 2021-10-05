package singleton;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * Constructs a Trivia Game, but only once.
     */
    private TriviaGame() {
        this.questions = new ArrayList<Question>();
        DataLoader trivia = new DataLoader();
        questions = trivia.getTriviaQuestions();
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        System.out.println("Welcome to the Trivia Game!!");
        playRound();
    }

    /**
     * Constructs an instance of a Trivia Game.
     * @return The instance of a Trivia Game.
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
			triviaGame = new TriviaGame();
		}
		return triviaGame;
    }

    /**
     * Lets the user decide whether they want to play another game of Trivia.
     */
    public void play() {
        System.out.println("(P)lay or (Q)uit:");
        String play = reader.nextLine();
        if(play.equalsIgnoreCase("p")) {
            playRound();
        } 
        else if(play.equalsIgnoreCase("q")) {
            System.out.println("You have won "+score+" games!!\nGoodbye!");
            System.exit(0);
        }
        else {
            play();
        }
    }

    /**
     * Plays a round of the Trivia Game.
     * @return True if gotten correct and false if gotten wrong.
     */
    private boolean playRound() {
        int number = this.rand.nextInt(9);
        Question triviaQuestion = questions.get(number);
        System.out.println(triviaQuestion);
        System.out.println("Enter your answer:");
        int ans = reader.nextInt();
        if(triviaQuestion.isCorrect(ans)) {
            score++;
            System.out.println("YAY! You got it right!");
            play();
            return true;
        } else {
            System.out.println("You got it wrong!\nThe correct answer is "+triviaQuestion.getCorrectAnswer());
            play();
            return false;
        }  
    }

}
