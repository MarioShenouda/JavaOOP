import java.util.Scanner;

public class SmallestNumber {
      static int  findMin(int a,int b , int c){
              if (a<b&&a<c){
                  return a;
              }else if (b<c && b<a){
                  return b;
            }else 
            return c;
      
          }
          static int min (int a, int b ,int c){
            int minnumber =a;
            if (minnumber >b)
            minnumber = b;
            if (minnumber >c)
            minnumber =c;

            return minnumber ;
          }
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Please insert three numbers :");
              int num1 = scanner.nextInt();
              int num2 = scanner.nextInt();
              int num3 = scanner.nextInt();
      
              int result = findMin(num1,num2,num3);
              System.out.printf("the smallest number is : %d \n",result);

              int newresult =min(num1, num2, num3) + 1;
              System.out.println("the new result is "+newresult);
    }
}
