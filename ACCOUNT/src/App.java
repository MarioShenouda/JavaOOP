public class App {
    public static void main(String[] args) throws Exception {
        Account A1 =new Account();
        Account A2 =new Account();
        Account A3 =new Account();

        A1.insert(4451238, "Mario", (float) 10000.0);
        A1.deposit(12000);
        A1.withdraw(2000);
        A1.checkBalance();
        System.out.println(A1.toString());

        A2.insert(9563145, "Martin", (float) 100.0);
        A2.deposit(50);
        A2.withdraw(140);
        A2.checkBalance();
        System.out.println(A2.toString());

        A3.insert(44512384, "belle", (float) 500);
        A3.deposit(550);
        A3.withdraw(10);
        A3.checkBalance();
      


    }
}
