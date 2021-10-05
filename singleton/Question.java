package singleton;

public class Question {

    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * Constructs a question for the game.
     * @param question The question that will be presented.
     * @param ans1 The first choice.
     * @param ans2 The second choice.
     * @param ans3 The third choice.
     * @param ans4 The fourth choice.
     * @param correctAnswer The right answer to the question.
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
    }

    /**
     * Prints out the question.
     */
    public String toString() {
        return this.question+"\n1. "+this.answers[0]+"\n2. "+this.answers[1]+"\n3. "+this.answers[2]+"\n4. "+this.answers[3];
    }

    /**
     * Decides if the user's answer is correct or not.
     * @param userAnswer The user's answer.
     * @return True if the answer is right and false if the answer is wrong.
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer-1 == correctAnswer;
    }

    /**
     * Returns the correct answer.
     * @return The correct answer.
     */
    public String getCorrectAnswer() {
        return answers[this.correctAnswer];
    }
    
}
