import java.util.Scanner;

public class Convert {
    static Scanner scanner =new Scanner(System.in);
    static int getInt(String Prompt){
        String value=scanner.nextLine();
        for (int i=0;i<value.length();i++){
            if (!Character.isDigit(value.charAt(i)))
            return 0;
        }
        //if (value.length()==0){
         //   return 0;
       // }
        return Integer.parseInt(value);
    }
    static double getDoube(String prompt){
        String value =scanner.nextLine();
        for (int i=0;i<value.length();i++){
            if (!Character.isDigit(value.charAt(i)))
            return 0.0;
        }
        return Double.parseDouble(value);
    }
    public static void main(String[] args) {
        int x=getInt("please insert an int:");
        System.out.println(x);
    }
}
