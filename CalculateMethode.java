import java.util.Scanner;

public class CalculateMethode {
    static int sum(int a,int b ,int c){
        int result =a+b+c;

        return result;
    }
    public static void main(String[] args) {
        System.out.println("insert three numbers ");
        Scanner scanner =new Scanner(System.in);

        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        System.out.println("the result is : "+sum(num1, num2, num3));
    }
    
}
