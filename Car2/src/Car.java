

public class Car {
    String Name;
    int Maxspeed;
    double Price;
    int Model;

    void SetName(String name){
        Name=name;
    }
    void SetMaxspeed(int speed){
        Maxspeed=speed;
    }
    void SetPrice (double price){
        Price=price;
    }
    void SetModel(int model){
        Model=model;
    }

    String getName(){
        return Name;
    }
    int getMaxSpeed (){
        return Maxspeed;
    }
    double getprice(){
        return Price;
    }
    int getModel(){
        return Model;
    }
}
