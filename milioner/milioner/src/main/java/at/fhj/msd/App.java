package at.fhj.msd;


public class App  ={
    public static void main(String[] args) {
        player p1 = new player("MArio");
        player p2 = new player("John");
        p1.status();
        p2.status();
        p1.updatescore(10);
        p1.updatescore(5);
        p2.updatescore(12);
        p1.status();
        p2.status();
    
       

    q1.displayQuestion();
    if(q1.guess("A")){
        p1.updatescore(q1.getpoints());
    }
    q2.displayQuestion();
    if (q2.guess("C")){
        p1.updatescore(q2.getpoints());
    }
    p1.status();
}   
