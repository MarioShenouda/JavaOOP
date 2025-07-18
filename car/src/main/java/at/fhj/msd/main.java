package at.fhj.msd;

public class main {
    public static void main(String[] args) {
        Car c1 =new Car();
        c1.SetName("BMW");
        c1.SetModel(2025);
        c1.SetPrice(34.999);
        c1.SetMaxspeed(350);

        System.out.println("DAS IST EIN "+c1.getName()+" BAUJAHRE "+c1.getModel()+" MaxSpeed: "+c1.getMaxSpeed()+".In price von: "+c1.getprice());
    }
}
