package hai;

public class Test {
    private char status;
    private int correct;
    private int incorrect;
    private int totalScore;

    public Test(char status, int correct, int incorrect, int totalScore) {
        this.status = status;
        this.correct = correct;
        this.incorrect = incorrect;
        this.totalScore = totalScore;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(int incorrect) {
        this.incorrect = incorrect;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public float viewTestResult(){
        return 0;
    }

    public void takeTest(){

    }

    public void setTest(QuestionDatabank obj){

    }
}
