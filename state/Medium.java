import java.util.Random;

public class Medium implements State {
    
    private ArithemeticGame game;

    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        Random r = new Random();
        int number = r.nextInt(50)+1;
        return number;
    }

    public String getOperation() {
        Random r = new Random();
        int number = r.nextInt(3)+1;
        if(number == 1) {
            return "+";
        } else if(number == 2) {
            return "-";
        } else return "*";
    }

    public void levelUp() {
        game.getHardState();
        System.out.println("You've been advanced to hard mode.");
    }

    public void levelDown() {
        game.getEasyState();
        System.out.println("You are struggling, let's go to easy mode.");
    }

}
