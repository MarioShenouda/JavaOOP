public class Circle {
    private double radius;
    private String color;

    public void SetRadius(double radius){
        this.radius =radius;
    }
    public void SetColor(String color){
        this.color=color;
    }
    public double GetRadius(){
        return radius;
    }
    public String GetColor(){
        return color;
    }
    public  double getarea(){
        double area =Math.PI*radius*radius;
        return area;
    }

    public double GetCircumference(){
        return Math.PI*2*radius;
    }
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
   

}
