public class App {
    public static void main(String[] args) throws Exception {
       Circle c1 = new Circle();
       Circle c2 = new Circle();
       c1.SetRadius(3.0);
       c1.SetColor("Black");
       System.out.println("AREA =" + c1.getarea());

       c2.SetRadius(2.0);
       c2.SetColor("BLUE");
       System.out.println("the CIRCUMFERENCE = "+ c2.GetCircumference());
       System.out.println(c1.toString() + c2.toString());
    }
}
