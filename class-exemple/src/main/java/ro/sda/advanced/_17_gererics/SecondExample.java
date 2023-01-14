package ro.sda.advanced._17_gererics;

public class SecondExample {
    public static void main(String[] args) {
        Garage<Audi>garage=new Garage<>();
        garage.putInside(new Audi("Audi",3000,"Gray"));

        Garage<BMW>garage1=new Garage<>();
        garage1.putInside(new BMW("E46",1500,"Black"));

        Garage<Car> garage2 = new Garage<>();

        garage2.putInside(new Car("suzuki", 20000, "red"));


    }


}


class Garage<T>{
    private T car;

    public void putInside(T car){
        this.car=car;

    }
    public T getOut(){
        return car;
    }
}

class Car{
    String model;
    double price;
    String color;

    public Car(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }
}

class Audi extends Car{

    public Audi(String model, double price, String color) {
        super(model, price, color);
    }
}
class BMW extends Car{

    public BMW(String model, double price, String color) {
        super(model, price, color);
    }
}
class Toyota extends Car{

    public Toyota(String model, double price, String color) {
        super(model, price, color);
    }
}