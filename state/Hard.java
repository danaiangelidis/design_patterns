import java.util.Random;

public class Hard implements State {
    
    private ArithemeticGame game;

    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        return number;
    }

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

    public void levelUp() {
        System.out.println("You're doing so well!!!!");
    }

    public void levelDown() {
        game.getMediumState();
        System.out.println("You are struggling, let's go to medium mode.");
    }

}
