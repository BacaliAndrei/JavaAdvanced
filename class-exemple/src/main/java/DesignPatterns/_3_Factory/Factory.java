package DesignPatterns._3_Factory;

public class Factory {
    public Shape crate(String shapeType){
        if (shapeType==null){
            return null;
        }if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }if (shapeType.equalsIgnoreCase("Square")){
            return  new Square();
        }if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
