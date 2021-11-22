import java.util.Random;

public class Easy implements State {
    
    private ArithemeticGame game;

    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        Random r = new Random();
        int number = r.nextInt(9)+1;
        return number;
    }

    public String getOperation() {
        Random r = new Random();
        int number = r.nextInt(2)+1;
        if(number == 1) {
            return "+";
        } else return "-";
    }

    public void levelUp() {
        game.getMediumState();
        System.out.println("You've been advanced to medium mode.");
    }

    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }

}
