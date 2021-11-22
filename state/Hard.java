import java.util.Random;

/**
 * Written by Danai Angelidis
 */

public class Hard implements State {
    
    private ArithemeticGame game;

    /**
     * Constructor for Hard state.
     * @param game New game that is being started.
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number 1-100.
     */
    public int getNum() {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        return number;
    }

    /**
     * Generates a random operation for the game.
     */
    public String getOperation() {
        Random r = new Random();
        int number = r.nextInt(4);
        if(number == 1) {
            return "+";
        } else if(number == 2) {
            return "-";
        } else if(number == 3) {
            return "*";
        } else return "/";
    }

    /**
     * Levels up the game.
     */
    public void levelUp() {
        System.out.println("You're doing so well!!!!");
    }

    /**
     * Levels down the game.
     */
    public void levelDown() {
        game.getMediumState();
        System.out.println("You are struggling, let's go to medium mode.");
    }

}
