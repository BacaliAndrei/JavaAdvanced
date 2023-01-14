package ro.sda.advanced._7_Interfaces;

public class rectangle implements Shape{
    private double width;
    private double height;

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw(){
        System.out.println("Drawing rectangle!");
    }

    @Override
        public double getArea(){
            return this.height*this.width;
    }
}
