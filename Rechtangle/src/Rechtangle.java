import java.util.Scanner;

public class Rechtangle {
    
    private double width;
    private double length;

    public double setlength ( ){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        length =x;
        return length;
    }
    public void setwidth (double w){
        width = w;
    }
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
    public double getarea(){
        return length*width;
    }
}
