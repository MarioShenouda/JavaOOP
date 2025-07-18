package at.fhj.msd;

public class player {
    private int score;
    private String  name;

    public player (String name){
        this.name=name;
        this.score =0;
    }
    public void status(){
        System.out.printf("player : %s, Score: %d\n", this.name,this.score);
    }
    public void updatescore(int points){
        this.score += points;
    }

}
