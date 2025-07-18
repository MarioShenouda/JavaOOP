import java.util.Scanner;

public class MethodeOfThree {

    static float average(float x,float y,float z){
        float ave=(x+y+z)/3;
        return ave;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("insert the three numbers ");
        float num1= scanner.nextInt();
        float num2=scanner.nextInt();
        float num3= scanner.nextInt();

        System.out.println("the average of three numbers are:  "+average(num1, num2, num3));
    }
}