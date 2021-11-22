import java.util.Random;

/**
 * Written by Danai Angelidis
 */

public class Easy implements State {
    
    private ArithemeticGame game;

    /**
     * Constructor for Easy state.
     * @param game New game that is being started.
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number 1-10.
     */
    public int getNum() {
        Random r = new Random();
        int number = r.nextInt(9)+1;
        return number;
    }

    /**
     * Generates a random operation for the game.
     */
    public String getOperation() {
        Random r = new Random();
        int number = r.nextInt(2)+1;
        if(number == 1) {
            return "+";
        } else return "-";
    }

    /**
     * Levels up the game.
     */
    public void levelUp() {
        game.getMediumState();
        System.out.println("You've been advanced to medium mode.");
    }

    /**
     * Levels down the game.
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }

}
