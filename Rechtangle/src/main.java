import java.util.Scanner;

public class main {
     Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        Rechtangle r1= new Rechtangle();


        r1.setlength();
        r1.setwidth(7);
        r1.getlength();
        r1.getwidth();
        System.out.println(r1.getarea());

    }
}
