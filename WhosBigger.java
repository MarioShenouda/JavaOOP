import java.util.Scanner;

class WhosBigger{

    static void Two_Numbers (int a,int b){
    
            if (a>b)
            System.out.printf("%d is bigger than %d \n",a,b);
            if(a<b)
            System.out.printf("%d is smaller than %d \n",a,b);
            if (a==b)
            System.out.printf("%d is equal to %d \n",a,b);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" insert the two numbers you want to Scann:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            Two_Numbers(num1,num2);
    }
}
/*andere lösung ohne if


 * import java.util.Scanner;

public class NoIfsNoButs {
  
    public static String noIfsNoButs(int a, int b) {     
       switch(Integer.compare(a, b)) {
            case 1:
                return String.format("%d is greater than %d", a, b);
            case -1:
                return String.format("%d is smaller than %d", a, b);
            default:
                return String.format("%d is equal to %d", a, b); // using string.format to return string  
    }
    }  
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    noIfsNoButs( num1, num2);
  }
}
 */