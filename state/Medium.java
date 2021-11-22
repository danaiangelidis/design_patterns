import java.util.Random;

/**
 * Written by Danai Angelidis
 */

public class Medium implements State {
    
    private ArithemeticGame game;

    /**
     * Constructor for Medium state.
     * @param game New game that is being started.
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number 1-50.
     */
    public int getNum() {
        Random r = new Random();
        int number = r.nextInt(50)+1;
        return number;
    }

    /**
     * Generates a random operation for the game.
     */
    public String getOperation() {
        Random r = new Random();
        int number = r.nextInt(3)+1;
        if(number == 1) {
            return "+";
        } else if(number == 2) {
            return "-";
        } else return "*";
    }

    /**
     * Levels up the game.
     */
    public void levelUp() {
        game.getHardState();
        System.out.println("You've been advanced to hard mode.");
    }

    /**
     * Levels down the game.
     */
    public void levelDown() {
        game.getEasyState();
        System.out.println("You are struggling, let's go to easy mode.");
    }

}
