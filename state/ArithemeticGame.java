import java.util.Scanner;

/**
 * Written by Danai Angelidis
 */

public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * Constructor for ArithemeticGame.
     */
    public ArithemeticGame() {
        this.score = 0;
        this.state = setState(easyState);
        this.reader = new Scanner(System.in);
    }

    /**
     * Generates a question for the user.
     */
    public void pressQuestionButton() {
        int firstNum = this.state.getNum();
        int secondNum = this.state.getNum();
        String op = this.state.getOperation();
        System.out.println(firstNum+" "+op+" "+secondNum+" = ?");
        int answer = this.reader.nextInt();
        int correctAns = 0;
        
        if(op == "+") {
            correctAns = firstNum+secondNum;
        } else if(op == "-") {
            correctAns = firstNum-secondNum;
        } else if(op == "*") {
            correctAns = firstNum*secondNum;
        }else if(op == "/") {
            correctAns = firstNum/secondNum;
        }

        if(answer == correctAns) {
            System.out.println("Correct!");
            this.score++;
        } else {
            System.out.println("Incorrect!");
            this.score--;
        }

        if(this.score >= 3) {
            if(this.state == this.easyState) {
                setState(this.mediumState);
            }else if(this.state == this.mediumState) {
                setState(this.hardState);
            }
        } else if(this.score <= -3) {
            if(this.state == this.mediumState) {
                setState(this.easyState);
            }else if(this.state == this.hardState) {
                setState(this.mediumState);
            }
        }
    }

    /**
     * Sets difficulty state for the game.
     * @param state The state that the game is going to be set to.
     * @return The new state the game has been set to.
     */
    public State setState(State state) {
        return this.state = state;
    }

    /**
     * Sets the state to easy.
     * @return Easy state.
     */
    public State getEasyState() {
        return this.easyState;
    }

    /**
     * Sets the state to medium.
     * @return Medium state.
     */
    public State getMediumState() {
        return this.mediumState;
    }

    /**
     * Sets the state to hard.
     * @return Hard state.
     */
    public State getHardState() {
        return this.hardState;
    }

}
