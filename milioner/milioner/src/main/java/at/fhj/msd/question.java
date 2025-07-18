package at.fhj.msd;

public class question {
    private String questiontext;
    private String[] answers;
    private String correctanswer;
    private int points;

    public question (String qt, String[] a, String ca, int p){
        this.questiontext = qt;
        this.answers = a;
        this.correctanswer = ca;
        this.points = p;
    }
    public void displayQuestion(){
        System.out.println(this.questiontext);
        for (String answer: this.answers) {
            System.out.println(" "+answer);
        }
    }

    public boolean guess(String guess){
        if (this.correctanswer.equals(guess)){
            return true;
        }else {
            return false;
        }
    }

    public int getpoints(){
        return this.points;
    }
    
}
