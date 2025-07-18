public class Account {
    private int accountNo;
    private String name;
    private double amount;

    public void insert (int a,String n , Float amt){
        this.accountNo=a;
        this.name=n;
        this.amount=amt;
    }
    public void deposit(float amt){
        this.amount=this.amount + amt;
        System.out.println(amt + "deposite");
    }
    public void withdraw (float amt){
        if (amt>this.amount)
            System.out.println("Insufficient Balance");
        else
            this.amount=this.amount-amt;
        System.out.println(amt + "withdrawn");
    }
    public void checkBalance(){
        System.out.println("BALANCE : "+ this.amount);
    }
    
    public String toString() {
        return "Account [accountNo=" + this.accountNo + ", name=" + this.name + ", amount=" + this.amount + "]";
    }
    
}
